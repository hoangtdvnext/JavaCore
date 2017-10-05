package javapatterns.Creational.StructuralPattem;

import java.util.List;

/**
 * Created by ASUS on 6/19/2017.
 */
public class AndCriteria implements Criteria {
    private Criteria criteria;
    private Criteria otherCriteria;

    public AndCriteria(Criteria criteria, Criteria otherCriteria) {
        this.criteria = criteria;
        this.otherCriteria = otherCriteria;
    }

    @Override
    public List<Person> meetCriterial(List<Person> persons) {
        List<Person> fristCriteriaPersons = criteria.meetCriterial(persons);
        return otherCriteria.meetCriterial(fristCriteriaPersons);
    }

}
