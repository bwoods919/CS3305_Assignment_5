// Name: Brendan Woods
// Class: CS 3305/01
// Term: Fall 2022
// Instructor: Dr. Haddad
// Assignment: 5
// IDE Name: IntelliJ

import java.util.Arrays;
import java.util.*;

class RadixSort {
    static int getMax(int[] array, int n)
    {
        int mx = array[0];
        for (int i = 1; i < n; i++)
            if (array[i] > mx)
                mx = array[i];
        return mx;
    }

    // A function to do counting sort of arr[] according to the digit represented by exp.
    static void sort(int[] array, int n, int exp)
    {
        int[] output = new int[n]; // output array
        int i;

        int[] count = new int[10];
        Arrays.fill(count, 0);

        // Store count of occurrences in count[]
        for (i = 0; i < n; i++)
            count[ExtractDigit(array, i, exp)]++;

        for (i = 1; i < 10; i++)
            count[i] += count[i - 1];

        // Build the output array
        for (i = n - 1; i >= 0; i--) {
            output[count[(array[i] / exp) % 10] - 1] = array[i];
            count[(array[i] / exp) % 10]--;
        }

        for (i = 0; i < n; i++)
            array[i] = output[i];
    }

    static int ExtractDigit(int[] array, int i, int exp) {
        return (array[i] / exp) % 10;
    }

    // The main function to that sorts arr[] of size n using Radix Sort
    static void RadixSort(int[] array, int n) {

        // Find the maximum number to know number of digits
        int m = getMax(array, n);

        for (int exp = 1; m / exp > 0; exp *= 10)
            sort(array, n, exp);
    }

    // A utility function to print an array
    static void print(int[] array, int n)
    {
        for (int i = 0; i < n; i++)
            System.out.print(array[i] + " ");
    }

    public static void main(String[] args) {

        while(true){
            Scanner input = new Scanner(System.in);

            System.out.print("How many integers in the array: ");
            int a= input.nextInt();
            int[] inputs = new int[a];

            System.out.println("Enter the elements of the array: ");

            for(int i=0; i<a; i++)
            {
                //reading array elements from the user
                inputs[i]=input .nextInt();
            }
            System.out.println("Array elements are: ");

            System.out.println("Inputs array before sorting: ");
            System.out.println(Arrays.toString(inputs));

            int size = inputs.length;

            RadixSort.RadixSort(inputs,size);

            System.out.println("Inputs array after sorting: ");
            System.out.println(Arrays.toString(inputs));

            // Re-Run Logic
            System.out.println("Do you want to run again? (Y/N): ");
            String exit = input.next();
            exit = exit.toLowerCase();

            if (exit.equals("N") || exit.equals("n") || exit.equals("No") || exit.equals("no") || exit.equals("NO"))
                System.exit(255);
        }
    }
}
