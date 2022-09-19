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

        Queue<Integer> Q0 = new Queue<>();
        Queue<Integer> Q1 = new Queue<>();
        Queue<Integer> Q2 = new Queue<>();
        Queue<Integer> Q3 = new Queue<>();
        Queue<Integer> Q4 = new Queue<>();
        Queue<Integer> Q5 = new Queue<>();
        Queue<Integer> Q6 = new Queue<>();
        Queue<Integer> Q7 = new Queue<>();
        Queue<Integer> Q8 = new Queue<>();
        Queue<Integer> Q9 = new Queue<>();

        String exit;

        int size;
        int array[] = new int[100];

        while (true) {

            System.out.print("Enter the size of the array: ");
            size = input.nextInt();

            System.out.print("Enter the numbers to sort: ");

            for (int i = 0; i < size; i++) {
                array[i] = input.nextInt();
            }

            System.out.print("The array before sorting: ");
            for (int i = 0; i < size; i++) {
                System.out.print( array[i] + " ");
            }
            System.out.println();

            // Code to handle the exit logic
            System.out.print("Do you want to re-run code with different input string (Y/N)? ");
            exit = input.next();

            if (exit.equals("N") || exit.equals("n") || exit.equals("No") || exit.equals("no") || exit.equals("NO"))
                System.exit(255);
        }
    }

    public static int ExtractDigit(int num, int digit) {

        return 0;
    }

    public static void RadixSort() {

    }
}
