import java.util.Scanner;

public class Problem_1 {
//    You are given a number “n” and an array of “n” elements,
//    write the function that returns minimum of them.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(minOfArr(arr, n));
    }
    public static int minOfArr(int[] arr, int n){
        int m = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            if (arr[i] < m){
                m = arr[i];
            }
        }
        return m;
    }
}
