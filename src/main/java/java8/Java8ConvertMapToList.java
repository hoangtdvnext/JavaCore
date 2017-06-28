package java8;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Created by ASUS on 5/5/2017.
 */
public class Java8ConvertMapToList {

    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        //put data
        map.put(10, "apple");
        map.put(20, "orange");
        map.put(30, "banana");
        map.put(40, "watermelon");
        map.put(50, "dragonfruit");

        //convert to list
        List<Integer> result1 = map.entrySet()
                .stream()
                .map(x -> x.getKey())
                .collect(Collectors.toList());

        Collections.sort(result1, (o1, o2) -> o1.compareTo(o2));
        result1.forEach(System.out::println);
        System.out.println();
        //
        List<String> result2 = map.entrySet()
                .stream()
                .map(x -> x.getValue())
                .collect(Collectors.toList());

        Collections.sort(result2, (o1, o2) -> o1.compareTo(o2));
        result2.forEach(System.out::println);
    }
}
