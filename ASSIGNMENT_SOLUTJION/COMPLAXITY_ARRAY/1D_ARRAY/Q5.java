import java.util.*;

public class Q5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array : ");
        int size = scanner.nextInt();

        int[] arr = new int[size];
        System.out.print("Enter the elements of the array : ");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }

        int peakElement = Integer.MIN_VALUE;

        for (int i = 1; i < size - 1; i++) {
            if (arr[i - 1] < arr[i] && arr[i] > arr[i + 1]) {
                peakElement = arr[i];
            }
        }
        System.out.println("Peak element of the element is : " + peakElement);
    }
}
