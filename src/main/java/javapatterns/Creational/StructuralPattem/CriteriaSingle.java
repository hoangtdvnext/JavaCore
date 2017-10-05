package javapatterns.Creational.StructuralPattem;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ASUS on 6/19/2017.
 */
public class CriteriaSingle implements Criteria {


    @Override
    public List<Person> meetCriterial(List<Person> persons) {
        List<Person> singlePersons = new ArrayList<Person>();
        for (Person person : persons) {
            if(person.getMaritalStatus().equalsIgnoreCase("SIN  GLE")){
                singlePersons.add(person);
            }
        }
        return singlePersons;
    }
}
