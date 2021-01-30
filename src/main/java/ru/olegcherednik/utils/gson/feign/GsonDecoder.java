package ru.olegcherednik.utils.gson.feign;

import feign.Response;
import feign.Util;
import feign.codec.Decoder;
import ru.olegcherednik.utils.gson.GsonDecorator;

import java.io.IOException;
import java.io.Reader;
import java.lang.reflect.Type;
import java.nio.charset.StandardCharsets;

/**
 * @author Oleg Cherednik
 * @since 17.01.2021
 */
public class GsonDecoder implements Decoder {

    private final GsonDecorator gson;

    public GsonDecoder(GsonDecorator gson) {
        this.gson = gson;
    }

    @Override
    public Object decode(Response response, Type type) throws IOException {
        if (response.status() == 404)
            return Util.emptyValueOf(type);
        if (response.body() == null)
            return null;

        try (Reader in = response.body().asReader(StandardCharsets.UTF_8)) {
            return gson.readValue(in, type);
        }
    }
}
