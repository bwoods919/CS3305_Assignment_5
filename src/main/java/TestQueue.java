// Name: Brendan Woods
// Class: CS 3305/01
// Term: Fall 2022
// Instructor: Dr. Haddad
// Assignment: 5
// IDE Name: IntelliJ

/**
 * Need to add the front method
 * */

import java.util.Scanner;

public class TestQueue {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Queue<Integer> queue = new Queue();

        int option, data;

        while(true) {

            printMenu();
            option = input.nextInt();

            switch (option) {
                case 1: // Enqueue element
                    System.out.print("\nEnter the number to enqueue: ");
                    data = input.nextInt();

                    System.out.println("\nEnqueueing " + data);
                    System.out.println("Queue content before enqueueing " + data + " is: ");
                    queue.printQueue();
                    queue.enqueue(data);

                    System.out.print("\nQueue content after enqueueing " + data + " is: ");
                    queue.printQueue();
                    System.out.println();
                    break;
                case 2: // Deque element
                    System.out.print("Queue content before dequeueing is:");
                    queue.printQueue();

                    queue.dequeue();

                    System.out.print("\nQueue content before dequeueing is:");
                    queue.printQueue();
                    System.out.println();
                    break;
                case 3: // Front Element
                    break;
                case 4: // Size of Queue
                    System.out.println("The Size of the Queue with contents:");
                    queue.printQueue();
                    System.out.print(" is: " + queue.size());
                    break;
                case 5: // is Empty Queue
                    if (queue.isEmpty())
                        System.out.println("\nThe Queue is empty.");
                    else {
                        System.out.println("\nThe Queue is Not empty.");

                        System.out.println("\nThe content of the queue is: ");
                        queue.printQueue();
                        System.out.println();
                    }
                    break;
                case 6: // Print queue content
                    System.out.print("\nThe content of the queue is:");
                    queue.printQueue();
                    System.out.println();
                    break;
                case 7: // Exit
                    System.exit(-1);
                    break;
            }
        }
    }

    public static void printMenu() {

        System.out.println("\n--------MAIN MENU--------");
        System.out.println("1 - Enqueue element");
        System.out.println("2 - Dequeue element");
        System.out.println("3 – Front element");
        System.out.println("4 – Size of queue");
        System.out.println("5 – Is Empty queue?");
        System.out.println("6 - Print queue content");
        System.out.println("7 - Exit program");
        System.out.print("\nEnter option number: ");
    }
}
