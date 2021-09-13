package coffeemachine.logics;

import java.util.Scanner;

public class Keypad {
    private static Scanner scanner = new Scanner(System.in);

    public static String getLine() {
        return scanner.nextLine();
    }
}
