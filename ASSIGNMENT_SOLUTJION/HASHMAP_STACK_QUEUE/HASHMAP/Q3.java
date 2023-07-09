import java.util.*;

class Q3 {
    static String isDuplicate(int arr[]) {
        Map<Integer, Integer> map = new HashMap<>();
        
        for (int i : arr) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        
        for (int i : arr) {
            if (map.get(i) > 1) {
                return "Yes";
            }
        }
        
        return "No";
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the no of elements of array : ");
        int size =sc.nextInt();
        int arr[]=new int[size];
        System.out.print("Enter the elements of the array : ");
        for (int i = 0; i < size; i++) {
            arr[i]=sc.nextInt();
        }
        System.out.println(isDuplicate(arr));
    }
}
