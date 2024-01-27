import java.util.*;

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no of elements in your Array : ");
        int size = sc.nextInt();// Size to determine the length of the array

        // Loop for entering the all elements of the array
        int arr[] = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Enter the element of your array : ");
            arr[i] = sc.nextInt();
        }

        int sum = 0;// Sum variable to store the outcome
        // Loop for adding the elements at even indices
        for (int i = 0; i < size; i += 2) {
            sum += arr[i];
        }

        System.out.println("The sum of element of the given array at even indices : " + sum);
    }
}
