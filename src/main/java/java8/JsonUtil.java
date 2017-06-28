package java8;

import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * Created by ASUS on 6/28/2017.
 */
public class JsonUtil {

    private final static String UNDEFINED = "{}";
    private static ObjectMapper mapper = new ObjectMapper();

    static {
        mapper = new ObjectMapper();
    }

    public static <T> T fromJson(String json, final Class<T> tClass) {
        try {
            return mapper.readValue(json, tClass);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static String toJson(Object object) {
        try {
            return mapper.writeValueAsString(object);
        } catch (Exception e) {
            e.printStackTrace();
            return UNDEFINED;
        }
    }
}
