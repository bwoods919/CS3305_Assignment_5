// Name: Brendan Woods
// Class: CS 3305/01
// Term: Fall 2022
// Instructor: Dr. Haddad
// Assignment: 5
// IDE Name: IntelliJ

import java.util.Scanner;

public class RadixSort {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String exit = "N";

        while (true) {

            System.out.print("Do you want to re-run code with different input string (Y/N)?");
            exit = input.next();

            if (exit.equals("Y") || exit.equals("y") || exit.equals("Yes") || exit.equals("yes"))
                System.exit(-1);
        }
    }

    public void ExtractDigit() {

    }
}
