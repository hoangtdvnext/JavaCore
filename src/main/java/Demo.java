import java8.JsonUtil;
import java8.Person;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ASUS on 5/23/2017.
 */
public class Demo {

    public static void main(String[] args) {
        List<Person> personList = new ArrayList<Person>();
        for (int i = 0; i < 10; i++) {
            personList.add(new Person("Object " + i, i));
            System.out.println(JsonUtil.toJson(personList.get(i)));
        }
    }

}
