// Name: Brendan Woods
// Class: CS 3305/01
// Term: Fall 2022
// Instructor: Dr. Haddad
// Assignment: 5
// IDE Name: IntelliJ

import java.lang.runtime.SwitchBootstraps;
import java.util.Scanner;

public class RadixSort {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String exit;

        int size;
        int array[] = new int[100];

        // Sentient Loop
        while (true) {

            // Read in user input
            System.out.print("Enter the size of the array: ");
            size = input.nextInt();

            System.out.print("Enter the numbers to sort: ");

            for (int i = 0; i < size; i++) {
                array[i] = input.nextInt();
            }

            // Output the array before sorting
            System.out.print("The array before sorting: ");
            for (int i = 0; i < size; i++) {
                System.out.print( array[i] + " ");
            }
            System.out.println();

            // Sort the array
            array = radixSort(array, size);

            // Output the array after sorting
            System.out.print("The array after sorting: ");
            for (int i = 0; i < size; i++) {
                System.out.print(array[i] + " ");
            }

            // Code to handle the exit logic
            System.out.print("\nDo you want to re-run code with different input string (Y/N)? ");
            exit = input.next();

            if (exit.equals("N") || exit.equals("n") || exit.equals("No") || exit.equals("no") || exit.equals("NO"))
                System.exit(255);
        }
    }

    // Method to figure out the digit based on the position given as digit on input
    public static int ExtractDigit(int num, int digit) {

        return 0;
    }

    /*
    * 1 - Extract digit
    * 2 - Sort into the corresponding Queue
    * 3 - Go to next digit
    * 4 - repeat 1-3 till no more digits
    * 5 - return array
    */

    // Method to do the actual sort
    public static int[] radixSort(int[] array, int size) {

        // Declare the Queues java was not liking trying to make an array of Queues
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

        for (int i = 0; i < 10; i++) { // Digits
            for (int j = 0; j < size; j++) { // Size
                switch (ExtractDigit(array[j], i)) { // add to the correct Queue
                    case 0: // the digit returns as 0
                        Q0.enqueue(array[j]);
                        break;
                    case 1: // the digit returns as 1
                        Q1.enqueue(array[j]);
                        break;
                    case 2: // the digit returns as 2
                        Q2.enqueue(array[j]);
                        break;
                    case 3: // the digit returns as 3
                        Q3.enqueue(array[j]);
                        break;
                    case 4: // the digit returns as 4
                        Q4.enqueue(array[j]);
                        break;
                    case 5: // the digit returns as 5
                        Q5.enqueue(array[j]);
                        break;
                    case 6: // the digit returns as 6
                        Q6.enqueue(array[j]);
                        break;
                    case 7: // the digit returns as 7
                        Q7.enqueue(array[j]);
                        break;
                    case 8: // the digit returns as 8
                        Q8.enqueue(array[j]);
                        break;
                    case 9: // the digit returns as 9
                        Q9.enqueue(array[j]);
                        break;
                }

                // Logic to empty the queues from 0 to 9
            }
        }

        return array;
    }
}
