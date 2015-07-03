package kz.petsclinic.clinic.IO;

import java.util.Scanner;

/**
 * Класс ввода - вывода
 */
public class IO {

    private final static String MSG_MAIN_MENU = "1 asdsd / 2 ada / 0 Quit";

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
}
