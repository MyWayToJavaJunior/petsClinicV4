package kz.petsclinic.clinic;

import java.util.ArrayList;

/**
 * Класс для работы с массивом Персон
 */
public class Clinic {

    private final int MAX_PERSON_ON_CLINIC = 100;

    private ArrayList<Person> persons = new ArrayList<Person>(MAX_PERSON_ON_CLINIC);

    public void addPerson(final Person personForAdd) {
        this.persons.add(personForAdd);
    }


    public int getCountOfPersons() {
        return this.persons.size();
    }

    public Person getPersonById(final int indexOfPerson) {
        return this.persons.get(indexOfPerson);
    }
}
