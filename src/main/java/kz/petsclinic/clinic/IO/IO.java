package kz.petsclinic.clinic.IO;

import java.util.Scanner;

/**
 * Класс ввода - вывода
 */
public class IO {

    private final static String MSG_MAIN_MENU = "1 view / 2 add / 0 quit";
    private static final String MSG_TYPE_OF_PETS = "1 Cat / 2 Bird / 3 Dog";
    private static final String ASK_NAME_FOR_PET = "Pls input Pet name";
    private static final String ASK_NAME_FOR_PERSON = "Pls input Person name";

    private static void print(final String stringToPrint) {
        System.out.println(stringToPrint);
    }

    public static void showMainMenu() {
        print(MSG_MAIN_MENU);
    }

    public static String getString() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    public static void showTypeOfPets() {
        print(MSG_TYPE_OF_PETS);
    }

    public static void askNameForPet() {
        print(ASK_NAME_FOR_PET);
    }

    public static void askNameForPerson() {
        print(ASK_NAME_FOR_PERSON);
    }
}
