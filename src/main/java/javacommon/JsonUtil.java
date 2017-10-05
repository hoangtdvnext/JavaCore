package javacommon;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.module.SimpleModule;
import java8.util.CustomException;

import java.io.IOException;

/**
 * Created by ASUS on 6/28/2017.
 */
public class JsonUtil {
    private static ObjectMapper mapper = new ObjectMapper();

    static {
        mapper = new ObjectMapper();
        mapper.configure(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS, false);
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        mapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);

        BooleanSerializerModule module = new BooleanSerializerModule();
        mapper.registerModule(module);
//        mapper.registerModule(new JodaModule());
//        mapper.registerModule(new JavaTimeModule());
    }

    public static <T> T fromJson(String json, Class<T> klass) {
        try {
            return mapper.readValue(json, klass);
        } catch (IOException e) {
            return null;
        }
    }

    public static String toJsonString(Object object) throws CustomException {
        try {
            return mapper.writeValueAsString(object);
        } catch (JsonProcessingException e) {
            // TODO log error
            e.printStackTrace();
            return "{}";
        }
    }

    static class BooleanSerializerModule extends SimpleModule {

        public BooleanSerializerModule() {
            this.addSerializer(new JsonSerializer<Boolean>() {
                @Override
                public Class<Boolean> handledType() {
                    return Boolean.class;
                }

                @Override
                public void serialize(Boolean value, JsonGenerator gen, SerializerProvider serializers) throws
                        IOException, JsonProcessingException {
                    if (value != null) {
                        gen.writeNumber(value ? 1 : 0);
                    }
                }
            });
        }
    }
}
