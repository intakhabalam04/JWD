import java.util.*;

public class Q1 {

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

        int pos = 0;
        int neg = 0;
        int odd = 0;
        int even = 0;
        int zero = 0;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (arr[i][j] > 0)
                    pos++;
                if (arr[i][j] < 0)
                    neg++;
                if (arr[i][j] % 2 != 0)
                    odd++;
                if (arr[i][j] % 2 == 0)
                    even++;
                if (arr[i][j] == 0)
                    zero++;
            }
        }

        System.out.println("number of positive numbers : " + pos);
        System.out.println("number of negative numbers : " + neg);
        System.out.println("number of odd numbers : " + odd);
        System.out.println("number of even numbers : " + even);
        System.out.println("number of zero numbers : " + zero);

    }
}
