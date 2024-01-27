import java.util.*;

public class Q2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the 2D matrix");
        int m = sc.nextInt();

        int arr[][] = new int[m][m];
        System.out.println("Enter all element of your array");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.print("The elements above the secondary diagonal is : ");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                if ((i + j) < (m - 1)) {
                    System.out.print(arr[i][j] + " ");
                }
            }
        }
    }
}
