package ru.olegcherednik.utils.gson.feign;

import feign.Feign;
import feign.Logger;
import feign.okhttp.OkHttpClient;
import feign.spring.SpringContract;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import ru.olegcherednik.utils.gson.GsonDecorator;
import ru.olegcherednik.utils.gson.GsonHelper;
import ru.olegcherednik.utils.gson.feign.app.server.SpringBootApp;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT, classes = SpringBootApp.class)
@ExtendWith(SpringExtension.class)
public abstract class BaseClientTest {

    @LocalServerPort
    protected int randomServerPort;

    protected <T> T buildClient(Class<T> clientClass) {
        GsonDecorator gson = new GsonDecorator(GsonHelper.createGson());

//        ObjectMapper objectMapper = new ObjectMapper()
//                .registerModule(new Jdk8Module())
//                .registerModule(new JavaTimeModule());

        return Feign.builder()
                    .contract(new SpringContract())
                    .client(new OkHttpClient())
                    .encoder(new GsonEncoder(gson))
                    .decoder(new GsonDecoder(gson))
//                    .encoder(new JacksonEncoder(objectMapper))
//                    .decoder(new JacksonDecoder(objectMapper))
//                    .logger(new Slf4jLogger(FileSetClient.class))
                    .logLevel(Logger.Level.FULL)
                    .target(clientClass, String.format("http://localhost:%d", randomServerPort));
    }

}
