package java8.util;

import java.util.Arrays;
import java.util.stream.Collectors;

/**
 * Created by hoangtd on 9/12/2017.
 */
public final class FormatUtil {

    public static String concatItem(final String delimiter, final String... items){
        if(items == null || items.length ==  0) return null;

        return Arrays.stream(items).filter(item -> item !=null)
                .collect(Collectors.joining(delimiter)).trim();
    }
}
