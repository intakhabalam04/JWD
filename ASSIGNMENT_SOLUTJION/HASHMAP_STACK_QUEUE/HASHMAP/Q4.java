import java.util.*;

class Q4 {
    static int largest(int arr[]) {
        TreeMap<Integer, Integer> map = new TreeMap<>();
        for(int i:arr){
            map.put(i, 1);
        }

        return map.lastEntry().getKey();
        
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
        System.out.println(largest(arr));
    }
}
