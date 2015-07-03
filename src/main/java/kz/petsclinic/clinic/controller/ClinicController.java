package kz.petsclinic.clinic.controller;

import kz.petsclinic.clinic.Clinic;
import kz.petsclinic.clinic.IO.IO;
import kz.petsclinic.clinic.Person;
import kz.petsclinic.clinic.pets.*;

/**
 * Контроллер для основной работы
 */
public class ClinicController {

    private static int countOfrem = 0;
    private boolean stopWork = false;
    private Clinic clinic = new Clinic();

    public void startWork() {
        while (!stopWork) {
            this.MainMenu();
        }
    }

    private void MainMenu() {
        this.showMainMenu();
        final int userChoice = this.getChoiceFromMainMenu();
        switch (userChoice) {
            case 1:         this.showAllPersons();
                            break;
            case 2:         this.addPerson();
                            break;
            case 3:         this.showPersonByName();
                            break;
            case 4:         this.showPersonByPetName();
                            break;
            case 5:         this.showPersonByPetClass();
                            break;
            case 6:         this.remPersonByPersonName();
                            break;
            case 7:         this.remPersonByPetName();
                            break;
            case 8:         this.renPersonByPersonName();
                            break;
            case 9:         this.renPersonByPetName();
                            break;
            default:        break;
            case 0:         this.stopWork = true;
                            break;
        }
    }

    private void showPersonByPetName() {
        IO.askNameForPet();
        final String nameOfPet = this.getString();
        showByPersonBlank(generatePersonBlankByPetName(nameOfPet));
    }

    private void showPersonByName() {
        IO.askNameForPerson();
        final String nameOfPerson = this.getString();
        showByPersonBlank(generatePersonBlankByName(nameOfPerson));
    }

    private void showPersonByPetClass() {
        IO.showTypeOfPets();
        final int typeIdOfPerson = this.getInt();
        showByPersonBlank(generatePersonBlankByPetClass(typeIdOfPerson));
    }

    private int getChoiceFromMainMenu() {
        return this.getChoice();
    }

    private int getChoice() {
        return this.getInt();
    }

    private int getInt() {
        return Integer.valueOf(this.getString());
    }

    private String getString() {
        return IO.getString();
    }

    private void showMainMenu() {
        IO.showMainMenu();
    }

    private Person generatePerson(final String nameOfPerson, final String nameOfPet, int typeOfPet) {
        Pet pet;
        switch (typeOfPet) {
            default:    pet = new Blank(nameOfPet);
                        break;
            case 1:     pet = new Cat(nameOfPet);
                        break;
            case 2:     pet = new Bird(nameOfPet);
                        break;
            case 3:     pet = new Dog(nameOfPet);
                        break;
        }
        return new Person(nameOfPerson, pet);
    }

    private Person generatePersonBlankByName(final String nameOfPerson) {
        return this.generatePerson(nameOfPerson, "", 0);
    }

    private Person generatePersonBlankByPetName(final String nameOfPet) {
        return this.generatePerson("", nameOfPet, 0);
    }

    private Person generatePersonBlankByPetClass(final int idOfPerson) {
        return this.generatePerson("", "", idOfPerson);
    }

    private void showByPersonBlank(final Person showByPerson) {
        for (int i = 0; i < clinic.getCountOfPersons(); i++) {
            if (clinic.getPersonById(i).isLike(showByPerson))
                IO.print(clinic.getPersonById(i).toString());
        }
    }

    private void showAllPersons() {
        for (int i = 0; i < clinic.getCountOfPersons(); i++) {
            IO.print(clinic.getPersonById(i).toString());
        }
    }

    private void addPerson() {
        clinic.addPerson(this.generateNewPersonByUserInput());
    }

    private Person generateNewPersonByUserInput() {
        final String nameOfPerson = this.getNameForPerson();
        final Pet pet = this.getPetFromUserInput();
        return new Person(nameOfPerson, pet);
    }

    private String getNameForPerson() {
        IO.askNameForPerson();
        return getString();
    }

    private Pet getPetFromUserInput() {
        Pet pet;
        switch (getTypeOfPet()) {
            default:
            case 1: pet = new Cat(getNameForPet());
                    break;
            case 2: pet = new Bird(getNameForPet());
                    break;
            case 3: pet = new Dog(getNameForPet());
        }
        return pet;
    }

    private int getTypeOfPet() {
        IO.showTypeOfPets();
        final int userChoiceTypeOfPet = getChoice();
        return userChoiceTypeOfPet;
    }

    private String getNameForPet() {
        IO.askNameForPet();
        return this.getString();
    }

    private void renPersonByPersonName() {
        IO.askNameForPerson();
        final Person personBlank = generatePersonBlankByName(this.getString());
        final Person renPerson = getPersonByPersonBlank(personBlank);
        if (renPerson != null) {
            renPerson.setNameOfPerson(this.getNameForPerson());
        } else IO.notFound();
    }

    private void renPersonByPetName() {
        IO.askNameForPet();
        final Person personBlank = generatePersonBlankByPetName(this.getString());
        final Person renPerson = getPersonByPersonBlank(personBlank);
        if (renPerson != null) {
            renPerson.setNameOfPet(this.getNameForPet());
        } else IO.notFound();
    }

    private Person getPersonByPersonBlank(final Person personBlank) {
        Person person = null;
        for (int i = 0; i < clinic.getCountOfPersons(); i++) {
            if (clinic.getPersonById(i).isLike(personBlank))
                person = clinic.getPersonById(i);
        }
        return person;
    }

    private void remPersonByPersonName() {
        IO.askNameForPerson();
        final Person personBlank = this.generatePersonBlankByName(this.getString());
        final Person remPerson = this.getPersonByPersonBlank(personBlank);
        if (remPerson != null) {
            clinic.remPerson(remPerson);
        } else IO.notFound();
    }

    private void remPersonByPetName() {
        countOfrem = 0;
        IO.askNameForPet();
        final Person personBlank = this.generatePersonBlankByPetName(this.getString());
        this.remPersonsByPersonBlank(personBlank);
    }

    private void remPersonsByPersonBlank(final Person personBlank) {
        final Person remPerson = this.getPersonByPersonBlank(personBlank);
        if (remPerson != null) {
            countOfrem++;
            clinic.remPerson(remPerson);
            this.remPersonsByPersonBlank(personBlank);
        } else {
            if (countOfrem > 1)
                IO.removedXItems(countOfrem);
            else IO.notFound();
        }
    }

}
