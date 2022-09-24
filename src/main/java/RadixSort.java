// Name: Brendan Woods
// Class: CS 3305/01
// Term: Fall 2022
// Instructor: Dr. Haddad
// Assignment: 5
// IDE Name: IntelliJ

import java.util.Arrays;
import java.util.*;

class Radixsort {
    static int getMax(int arr[], int n)
    {
        int mx = arr[0];
        for (int i = 1; i < n; i++)
            if (arr[i] > mx)
                mx = arr[i];
        return mx;
    }

    // A function to do counting sort of arr[] according to the digit represented by exp.
    static void extractDigit(int arr[], int n, int exp)
    {
        int output[] = new int[n]; // output array
        int i;
        int count[] = new int[10];
        Arrays.fill(count, 0);

        // Store count of occurrences in count[]
        for (i = 0; i < n; i++)
            count[(arr[i] / exp) % 10]++;

        for (i = 1; i < 10; i++)
            count[i] += count[i - 1];

        // Build the output array
        for (i = n - 1; i >= 0; i--) {
            output[count[(arr[i] / exp) % 10] - 1] = arr[i];
            count[(arr[i] / exp) % 10]--;
        }

        for (i = 0; i < n; i++)
            arr[i] = output[i];
    }

    // The main function to that sorts arr[] of size n using Radix Sort
    static void radixsort(int arr[], int n) {

        // Find the maximum number to know number of digits
        int m = getMax(arr, n);

        for (int exp = 1; m / exp > 0; exp *= 10)
            extractDigit(arr, n, exp);
    }

    // A utility function to print an array
    static void print(int arr[], int n)
    {
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
    }
}

// Main class
class Main {
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

            Radixsort.radixsort(inputs,size);

            System.out.println("Inputs array after sorting: ");
            System.out.println(Arrays.toString(inputs));

            // Re-run logic
            System.out.println("Do you want to run again? (Y/N): ");
            String exit = input.next();
            exit = exit.toLowerCase();

            if (exit.equals("N") || exit.equals("n") || exit.equals("No") || exit.equals("no") || exit.equals("NO"))
                System.exit(255);
        }
    }
}
