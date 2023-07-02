//Intakhab Alam
/*Q3. 
Given the head of a sorted linked list, delete all duplicates such that each element
appears only once. Return the linked list sorted as well.

Input:
    head = [1,1,2]
Output:
    [1,2]



*/

import java.util.*;
import java.io.*;

class Q3 {
    public static void main(String[] args) {
        LinkedList ll2 = new LinkedList();
        ll2.insert(1);
        ll2.insert(1);
        ll2.insert(2);

        ll2.Displaying();
        ll2.deleteDuplicate();
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

    //Implementation for the Deletion for the Duplicate Elements
    public void deleteDuplicate() {
        Node current = head;
        while (current != null && current.next != null) {
            if (current.data == (current.next).data) {
                current.next = current.next.next;
            } else {
                current = current.next;
            }
        }
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