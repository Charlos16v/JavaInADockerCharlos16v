package edu.pingpong.romans;

import edu.pingpong.romans.domain.RomanNumber;

import java.util.Scanner;

public class App {


    public static void main(String[] args) {
        String confirmationEntry = "";

        while (!confirmationEntry.equals("N")) {
            System.out.println("========ROMAN NUMERAL TO DECIMAL!========");
            System.out.println("Type a Roman Numeral:");
            String keyboardEntry = "";
            Scanner scannerEntry = new Scanner(System.in);
            keyboardEntry = scannerEntry.nextLine();


            RomanNumber romanNumber = new RomanNumber();
            romanNumber.initRegexList();
            romanNumber.setRomanNumber(keyboardEntry);

            if (romanNumber.isValidRomanNumber()) {
                clearScreen();
                System.out.println("\n The value of " + keyboardEntry + " in decimal is: " + romanNumber.convertToDecimal());

                System.out.println("\n \n ========OTHER TIME?========!");
                System.out.println('\n' + "Y/N");

                Scanner scannerEntryConfirmation = new Scanner(System.in);
                confirmationEntry = scannerEntryConfirmation.nextLine();
                clearScreen();
            } else {
                clearScreen();
                System.out.println("\n The number " + keyboardEntry + " is not a valid Roman Numeral :(");
            }
        }
        clearScreen();
        System.out.println('\n' + "BYE!");
    }

    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}
