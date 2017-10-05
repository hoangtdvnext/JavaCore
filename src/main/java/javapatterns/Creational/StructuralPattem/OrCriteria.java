package javapatterns.Creational.StructuralPattem;

import java.util.List;

/**
 * Created by ASUS on 6/19/2017.
 */
public class OrCriteria implements Criteria {

    private Criteria criteria;
    private Criteria otherCriteria;


    public OrCriteria(Criteria criteria, Criteria otherCriteria) {
        this.criteria = criteria;
        this.otherCriteria = otherCriteria;
    }


    @Override
    public List<Person> meetCriterial(List<Person> persons) {
        List<Person> fristCriteriaItems = criteria.meetCriterial(persons);
        List<Person> otherCriteriaItems = otherCriteria.meetCriterial(persons);

        for (Person ps : otherCriteriaItems) {
            if (!fristCriteriaItems.contains(ps)) {
                fristCriteriaItems.add(ps);
            }
        }
        return fristCriteriaItems;
    }
}
