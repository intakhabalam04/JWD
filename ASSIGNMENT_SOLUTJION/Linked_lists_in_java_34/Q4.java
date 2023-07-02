//Intakhab Alam

/*
 
Q4. Given the head of a singly linked list, return true if it is a palindrome or false otherwise.

Input  :    head = [1,2,2,1]

output : true



 */

import java.util.*;
import java.io.*;


public class Q4 {
    public static void main(String[] args) {
        LinkedList ll4 = new LinkedList();
        ll4.insert(1);
        ll4.insert(2);
        ll4.insert(2);
        ll4.insert(1);
        System.out.println(ll4.isPalindrome());

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

    public boolean isPalindrome(){
        Node currentNode=head;
        int sum=0,reverseSum=0;
        while (currentNode!=null) {
            sum=sum*10+currentNode.data;
            currentNode=currentNode.next;
        }
        int temp=sum;
        while (temp!=0) {
            reverseSum=reverseSum*10+temp%10;
            temp/=10;
        }

        if (reverseSum==sum) {
            return true;
        }
        return false;

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