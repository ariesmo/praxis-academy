package Filter;

import java.util.List;

public class AndCriteria implements Criteria {
    private Criteria criteria;
    private Criteria otheCriteria;

    public AndCriteria(Criteria criteria, Criteria otheCriteria) {
        this.criteria = criteria;
        this.otheCriteria = otheCriteria;
    }

    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> firstCriteriaPersons = criteria.meetCriteria(persons);
        return otheCriteria.meetCriteria(firstCriteriaPersons);
    }
}