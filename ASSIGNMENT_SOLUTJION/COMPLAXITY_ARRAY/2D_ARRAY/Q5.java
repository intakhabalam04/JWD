import java.util.*;

public class Q5 {

    public static void arrayDisplay(int[][] arr, int m) {
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                if (i == m / 2 || j == m / 2) {
                    System.out.print(arr[i][j] + " ");
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the 2D Odd Order Square matrix");
        int m = sc.nextInt();

        int arr[][] = new int[m][m];
        System.out.println("Enter all element of your array");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        arrayDisplay(arr, m);

    }
}
