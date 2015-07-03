package kz.petsclinic.clinic;

import kz.petsclinic.clinic.controller.ClinicController;

/**
 * Основной класс
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Start of program");
        ClinicController clinicController
                = new ClinicController();
        clinicController.startWork();
        System.out.println("End of program");
    }
}
