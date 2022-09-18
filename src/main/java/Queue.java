// Name: Brendan Woods
// Class: CS 3305/01
// Term: Fall 2022
// Instructor: Dr. Haddad
// Assignment: 5
// IDE Name: IntelliJ

public class Queue<E>
{
    public Node<E> head, tail;

    //constructor method to create a list of object with head, tail, and size.
    public Queue()
    {
        head = null;
        tail = null;

    }

    //method add node to end of list
    public void enqueue(E data)
    {
        if (tail == null)
            head = tail = new Node<E>(data); //empty list
        else
        {
            tail.next = new Node<E>(data); //link new node as last node
            tail = tail.next; //make tail pointer points to last node
        }
    }

    //method #3: remove first node
    public void dequeue()
    {
        if (head == null)
            return;
        else {
            if (head == tail) {
                head = null;
                tail = null;
            } else {
                head = head.next;
            }
        }
    }

    //method Size
    public int size() {
        int listSize= 0;

        Node<E> temp = head;

        while (temp != null)
        {
            listSize++;
            temp = temp.next;
        }

        return listSize;
    }

    public boolean isEmpty() {
        return size() == 0;
    }

    //method to print out the list
    public void printQueue()
    {
        Node<E> temp;
        temp = head;
        while (temp != null)
        {
            System.out.print(temp.data + "   ");
            temp = temp.next;
        }
    }

    //class to create nodes as objects
    private static class Node<E> {
        private E data;  //data field
        private Node<E> next; //link field
        public Node(E item) //constructor method
        {
            data = item;
            next = null;
        }
    }
}