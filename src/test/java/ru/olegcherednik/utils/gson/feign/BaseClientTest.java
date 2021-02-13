package ru.olegcherednik.utils.gson.feign;

import feign.Feign;
import feign.Logger;
import feign.okhttp.OkHttpClient;
import feign.spring.SpringContract;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.test.context.testng.AbstractTransactionalTestNGSpringContextTests;
import ru.olegcherednik.utils.gson.GsonDecorator;
import ru.olegcherednik.utils.gson.GsonUtilsHelper;
import ru.olegcherednik.utils.gson.feign.app.server.SpringBootApp;

/**
 * @author Oleg Cherednik
 * @since 17.01.2021
 */
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT, classes = SpringBootApp.class)
public abstract class BaseClientTest extends AbstractTransactionalTestNGSpringContextTests {

    @LocalServerPort
    protected int randomServerPort;

    protected <T> T buildClient(Class<T> clientClass) {
        GsonDecorator gson = new GsonDecorator(GsonUtilsHelper.createGson());

        return Feign.builder()
                    .contract(new SpringContract())
                    .client(new OkHttpClient())
                    .encoder(new GsonEncoder(gson))
                    .decoder(new GsonDecoder(gson))
                    .decode404()
                    .logLevel(Logger.Level.FULL)
                    .target(clientClass, String.format("http://localhost:%d", randomServerPort));
    }

}
