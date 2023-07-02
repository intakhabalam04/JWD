//Intakhab Alam

/*Q2. 
Insert a node at the given position in a linked list. We are given a pointer to a node, and the
new node is inserted after the given node.
Q
Input :
LL = 1 -> 2 -> 4 -> 5 -> 6	pointer = 2	    value =  3.
Output :
 1 -> 2 -> 3 -> 4 -> 5 -> 6 
 */

import java.util.*;
import java.io.*;

class Q2 {
    public static void main(String[] args) {
        LinkedList ll2 = new LinkedList();
        ll2.insert(1);
        ll2.insert(2);
        ll2.insert(4);
        ll2.insert(5);
        ll2.insert(6);
        ll2.Displaying();
        ll2.insertAt(2, 3);
        ll2.Displaying();

    }
}

class LinkedList {
    Node head;

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public void insert(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node currNode = head;
        while (currNode.next != null) {
            currNode = currNode.next;
        }
        currNode.next = newNode;
    }

    //Implementation for the insertion of a nodes at a certain position
    public void insertAt(int position, int value) {
        Node newNode = new Node(value);
        Node curent = head;
        while (curent.data != position) {
            curent = curent.next;
        }
        newNode.next = curent.next;
        curent.next = newNode;
    }

    public void Displaying() {
        if (head == null) {
            System.out.println("Empty linked list");
            return;
        }
        Node current = head;
        while (current != null) {
            System.out.print(current.data + "->");
            current = current.next;
        }
        System.out.println("NULL");
    }

}