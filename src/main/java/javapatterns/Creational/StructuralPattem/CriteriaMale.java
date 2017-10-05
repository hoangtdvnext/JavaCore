package javapatterns.Creational.StructuralPattem;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ASUS on 6/19/2017.
 */
public class CriteriaMale implements Criteria {
    @Override
    public List<Person> meetCriterial(List<Person> persons) {
        List<Person> malePersons = new ArrayList<>();
        for (Person ps : persons) {
            if (ps.getGender().equalsIgnoreCase("MALE")) {
                malePersons.add(ps);
            }
        }

        return malePersons;
    }
}
