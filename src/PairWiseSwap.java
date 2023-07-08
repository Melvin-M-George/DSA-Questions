//Write a program to swap elements in a linked list pairwise.Negative value indicates end of the linked list.
import java.util.Scanner;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {
    Node head;

    void insert(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    void swapPairwise() {
        Node current = head;
        while (current != null && current.next != null) {
            int temp = current.data;
            current.data = current.next.data;
            current.next.data = temp;
            current = current.next.next;
        }
    }

    void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}

public class PairWiseSwap {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter elements for linked list (enter a negative value to stop):");
        int data;
        while ((data = scanner.nextInt()) >= 0) {
            linkedList.insert(data);
        }

        System.out.println("Original linked list:");
        linkedList.display();

        linkedList.swapPairwise();

        System.out.println("Linked list after swapping pairwise:");
        linkedList.display();

        scanner.close();
    }
}
