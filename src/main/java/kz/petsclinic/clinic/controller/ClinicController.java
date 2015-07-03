package kz.petsclinic.clinic.controller;

import kz.petsclinic.clinic.Clinic;
import kz.petsclinic.clinic.IO.IO;
import kz.petsclinic.clinic.Person;
import kz.petsclinic.clinic.pets.*;

/**
 * Контроллер для основной работы
 */
public class ClinicController {

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
            default:        break;
            case 0:         stopWork = true;
                            break;
        }
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

    public void showByPerson(final Person showByPerson) {


    }

    private void showAllPersons() {
        for (int i = 0; i < clinic.getCountOfPersons(); i++) {
            clinic.getPersonById(i).toString();
        }
    }

    private void addPerson() {
        clinic.addPerson(this.generateNewPersonByUserInput());
    }

    private Person generateNewPersonByUserInput() {
        final Pet pet = this.getPetFromUserInput();
        return new Person(this.getNameForPerson(), pet);
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
}
