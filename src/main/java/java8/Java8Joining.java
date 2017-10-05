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

        stringList.add("A");
        stringList.add("B");
        stringList.add("C");
        stringList.add(null);
        stringList.add("D");
        stringList.add(null);
        stringList.add("E");

        // joining
        String output = concatItem("/---/", stringList);

        System.out.println(output);
    }

    public static String concatItem(final String delimiter, final String... items){
        if(items == null || items.length ==  0) return null;

        return Arrays.stream(items).filter(item -> item !=null)
                .collect(Collectors.joining(delimiter)).trim();
    }

    public static String concatItem(final String delimiter, List<String> data){
        if(data == null || data.size() ==  0) return null;

        return data.stream().filter(item -> item !=null)
                .collect(Collectors.joining(delimiter)).trim();
    }
}
