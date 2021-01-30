package ru.olegcherednik.utils.gson.feign.app.server;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.gson.GsonAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Import;
import ru.olegcherednik.utils.gson.GsonDecorator;
import ru.olegcherednik.utils.gson.GsonHelper;

/**
 * @author Oleg Cherednik
 * @since 30.01.2021
 */
@SpringBootApplication(exclude = GsonAutoConfiguration.class)
@Import(SpringBootApp.Config.class)
public class SpringBootApp {

    public static class Config {

        @Bean
        public Gson gson() {
            return GsonHelper.createGson();
        }

        @Bean
        public GsonBuilder gsonBuilder() {
            return new GsonBuilder();
        }

        @Bean
        public GsonDecorator gson(Gson gson) {
            return new GsonDecorator(gson);
        }

    }
}
