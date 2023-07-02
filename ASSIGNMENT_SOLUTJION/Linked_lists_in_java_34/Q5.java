
//Intakhab alam
/*Q5. 
Given two numbers represented by two lists, write a function that returns the sum list. The
sum list is a list representation of the addition of two input numbers.
 */




class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
    }
}

class SumLinkedLists {
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummyHead = new ListNode(0);
        ListNode current = dummyHead;
        int carry = 0;

        while (l1 != null || l2 != null || carry != 0) {
            int digit1 = (l1 != null) ? l1.val : 0;
            int digit2 = (l2 != null) ? l2.val : 0;

            int currentSum = digit1 + digit2 + carry;
            int digitSum = currentSum % 10;
            carry = currentSum / 10;

            current.next = new ListNode(digitSum);
            current = current.next;

            if (l1 != null) l1 = l1.next;
            if (l2 != null) l2 = l2.next;
        }

        return dummyHead.next;
    }

    public static void main(String[] args) {
        // Create the first linked list: 5 -> 6 -> 3
        ListNode num1 = new ListNode(5);
        num1.next = new ListNode(6);
        num1.next.next = new ListNode(3);

        // Create the second linked list: 8 -> 4 -> 2
        ListNode num2 = new ListNode(8);
        num2.next = new ListNode(4);
        num2.next.next = new ListNode(2);

        ListNode sum = addTwoNumbers(num1, num2);

        // Print the sum linked list: 1 -> 4 -> 0 -> 5
        while (sum != null) {
            System.out.print(sum.val + " ");
            sum = sum.next;
        }
    }
}
