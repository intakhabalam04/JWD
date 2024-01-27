import java.util.*;

class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> stack = new Stack<>();

        for (String current : operations) {
            if (current.equals("C")) {
                stack.pop();
            } else if (current.equals("D")) {
                stack.push(2 * stack.peek());
            } else if (current.equals("+")) {
                int temp = stack.pop();
                int sum = stack.peek() + temp;
                stack.push(temp);
                stack.push(sum);
            } else {
                stack.push(Integer.parseInt(current));
            }
        }

        int sum = 0;
        while (!stack.empty()) {
            sum += stack.pop();
        }
        return sum;
    }
}

class Q3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Solution solution = new Solution();

        System.out.print("Enter the number of operations: ");
        int n = scanner.nextInt();
        scanner.nextLine();

        String[] operations = new String[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter operation " + (i + 1) + ": ");
            operations[i] = scanner.nextLine();
        }

        int result = solution.calPoints(operations);
        System.out.println("Result: " + result);
    }
}
