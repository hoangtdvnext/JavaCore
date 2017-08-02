package java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by hoangtd on 9/12/2017.
 */
public class Java8Joining {

    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();

        stringList.add("quả 1");
        stringList.add("quả 2");
        stringList.add("quả 3");
        stringList.add(null);
        stringList.add("quả 5");
        stringList.add(null);
        stringList.add("quả 7");

        // joining
        String output = stringList
                .stream()
                .filter(s -> s != null)
                .collect(Collectors.joining("/"))
                .trim();

        System.out.println(output);
    }

    public static String concatItem(final String delimiter, final String... items){
        if(items == null || items.length ==  0) return null;

        return Arrays.stream(items).filter(item -> item !=null)
                .collect(Collectors.joining(delimiter)).trim();
    }
}
