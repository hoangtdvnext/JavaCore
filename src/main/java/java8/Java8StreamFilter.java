package java8;

import java.util.Arrays;
import java.util.List;

/**
 * Created by ASUS on 5/5/2017.
 */
public class Java8StreamFilter {

    public static void main(String[] args) {
        List<Person> persons = Arrays.asList(
                new Person("mkyong", 30),
                new Person("jack", 20),
                new Person("lawrence", 40)
        );

        String name = persons.stream().filter(
                x -> "jack".equals(x.getName()))
                // get ra 1 truong trong object
                .map(Person::getName)
                // lay ra thang dau tien
                .findAny()
                // else return null
                .orElse(null);

        System.out.println(name);
    }
}
