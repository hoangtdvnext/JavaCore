package javapatterns.Creational.StructuralPattem;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ASUS on 6/19/2017.
 */
public class CriteriaFemale implements Criteria{


    @Override
    public List<Person> meetCriterial(List<Person> persons) {
        List<Person> femalePersons = new ArrayList<>();
        for (Person ps : persons) {
            if (ps.getGender().equalsIgnoreCase("FEMALE")) {
                femalePersons.add(ps);
            }
        }

        return femalePersons;
    }
}
