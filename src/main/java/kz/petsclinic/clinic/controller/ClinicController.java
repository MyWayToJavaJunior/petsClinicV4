package kz.petsclinic.clinic.controller;

import kz.petsclinic.clinic.Clinic;
import kz.petsclinic.clinic.IO.IO;

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
            case 1:         break;
            case 2:         break;
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

}
