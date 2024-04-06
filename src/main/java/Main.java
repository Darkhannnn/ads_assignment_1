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
            case 2:
                n = sc.nextInt();
                arr = new int[n];
                for (int i = 0; i < n; i++) {
                    arr[i] = sc.nextInt();
                }
                System.out.println(averageOfArr(arr, n));
                break;
            case 3:
                n = sc.nextInt();
                System.out.println(primeNumCheck(n));
                break;
            case 4:
                n = sc.nextInt();
                System.out.println(factorial(n));
                break;
            case 5:
                n = sc.nextInt();
                System.out.println(fib(n));
                break;
            default:
                System.out.println("there is no such number");
        }
    }
}
