//Intakhab Alam
/*Q1. Given a linked list and a key ‘X‘ in, the task is to check if X is present in the linked list or not.
Examples:
INPUT : 14->21->11->30->10, X = 14

OUTPUT : Yes

Explanation: 14 is present in the linked list 

INPUT : 6->21->17->30->10->8, X = 13

OUTPUT : No

*/

import java.util.*;
import java.io.*;

class Q1 {
    public static void main(String[] args) {
        linkedlist ll2 = new linkedlist();
        ll2.insert(14);
        ll2.insert(21);
        ll2.insert(11);
        ll2.insert(30);
        ll2.insert(10);

        System.out.println(ll2.isFound(14));
    }
}

class linkedlist {
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

    //Implementation for the searching of a elements in a linked list
    public String isFound(int target) {
        if (head == null) {
            return "No";
        }
        Node currNode = head;
        while (currNode != null) {
            if (currNode.data == target) {
                return "Yes";
            }
            currNode = currNode.next;
        }
        return "No";
    }

}