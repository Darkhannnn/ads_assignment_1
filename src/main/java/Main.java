import java.util.Scanner;

public class Main extends Problems {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insert the problem number:");
        int y = sc.nextInt();
        int n;
        int[] arr;
        switch (y){
            case 1:
                n = sc.nextInt();
                arr = new int[n];
                for (int i = 0; i < n; i++) {
                    arr[i] = sc.nextInt();
                }
                System.out.println(minOfArr(arr, n));
                break;
            default:
                System.out.println("there is no such number");
        }
    }
}