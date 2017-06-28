package java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by ASUS on 5/5/2017.
 */
public class Java8Filter {
    public static void main(String[] args) {
        List<String> lines = Arrays.asList("spring", "hoangtd", "strus2", "demo");

        List<String> result = lines.stream()
                .filter(line -> !"hoangtd".equals(line))
                .collect(Collectors.toList());

        result.forEach(System.out::println);
    }
}
