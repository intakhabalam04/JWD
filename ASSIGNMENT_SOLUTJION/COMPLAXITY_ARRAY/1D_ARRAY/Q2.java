import java.util.*;

public class Q2 {
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

        // ForEach Loop
        for (int i : arr) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
    }
}
