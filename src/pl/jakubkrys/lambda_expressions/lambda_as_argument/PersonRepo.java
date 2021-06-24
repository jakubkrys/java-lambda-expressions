package pl.jakubkrys.lambda_expressions.lambda_as_argument;

import java.util.*;

public class PersonRepo {
    private Set<Person> people = new HashSet<>();

    public void add (Person person) {
        people.add(person);
    }

    public void remove (Person person){
        people.remove(person);
    }

    public Set<Person> find (Criteria criteria) {
        Set<Person> finded = new HashSet<>();
        for (Person person : people) {
            if (criteria.isFit(person)){
                finded.add(person);
            }
        }

        return finded;
    }
}