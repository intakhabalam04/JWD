import java.util.*;

public class Q4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the 2D matrix");
        int m = sc.nextInt();
        int n = sc.nextInt();

        // Array of size m*n;
        int arr[][] = new int[m][n];
        System.out.println("Enter all element of your array");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        int max = arr[0][0];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (arr[i][j] > max) {
                    max = arr[i][j];
                }
            }
        }
        System.out.println("Maximum array in  the above array is : " + max);
    }
}
