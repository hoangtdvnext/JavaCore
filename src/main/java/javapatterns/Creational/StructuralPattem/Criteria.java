package javapatterns.Creational.StructuralPattem;

import java.util.List;

/**
 * Created by ASUS on 6/19/2017.
 */
public interface Criteria {
    List<Person> meetCriterial(List<Person> persons);
}
