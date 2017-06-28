package java8;

import java.util.Arrays;
import java.util.List;

/**
 * Created by ASUS on 5/5/2017.
 */
public class Java8FilterObject {

    public static void main(String[] args) {
        List<Person> persons = Arrays.asList(
                new Person("mkyong", 30),
                new Person("jack", 20),
                new Person("lawrence", 40)
        );

        Person result1 = persons.stream()
                //filter
                .filter(person ->
                        "jack".equals(person.getName())
                )
                //find one record
                .findAny()
                //else return null
                .orElse(null);

        System.out.println(result1.getAge());

    }
}
