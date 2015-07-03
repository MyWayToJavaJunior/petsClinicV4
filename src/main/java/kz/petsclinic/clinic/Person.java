package kz.petsclinic.clinic;

import kz.petsclinic.clinic.pets.Pet;

/**
 * Класс персоны
 */
public class Person {

    private String nameOfPerson;
    private Pet pet;

    public Person(final String nameOfPerson, Pet pet) {
        this.nameOfPerson = nameOfPerson;
        this.pet = pet;
    }

    public boolean isLike(final Person likePerson) {
        boolean result = false;
        if ((likePerson.getNameOfPerson()).equals(this.getNameOfPerson()) ||
                (likePerson.getNameOfPet()).equals(this.getNameOfPet()) ||
                (likePerson.getClassOfPet().equals(this.getClassOfPet()))) {
            result = true;
        }
        return result;
    }

    public String getNameOfPerson() {
        return this.nameOfPerson;
    }

    public String getNameOfPet() {
        return this.pet.getNameOfPet();
    }

    public String getClassOfPet() {
        return this.pet.getClassOfPet();
    }

    public void setNameOfPerson(final String nameOfPerson) {
        this.nameOfPerson = nameOfPerson;
    }

    public void setNameOfPet(final String nameOfPet) {
        this.pet.setNameOfPet(nameOfPet);
    }

    @Override
    public String toString() {
        return "Name of Person: " + this.nameOfPerson + ", " + this.pet.toString();
    }
}
