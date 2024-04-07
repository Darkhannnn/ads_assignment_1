import java.util.Scanner;

public class Main extends Problems {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insert the problem number:");
        int y = sc.nextInt();
        sc.nextLine();
        int n;
        int a;
        int k;
        int[] arr;

        String storageString = "";

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
            case 6:
                a = sc.nextInt();
                n = sc.nextInt();
                System.out.println(power(a, n));
                break;
            case 7:
                n = sc.nextInt();
                while(n != 0){
                    storageString += sc.next();
                    if (n > 1){
                        storageString += " ";
                    }
                    n--;
                }
                System.out.println(reverse(storageString));
                break;
            case 8:
                storageString = sc.nextLine();
                System.out.println(isAllDigit(storageString) ? "Yes": "No");
            case 9:
                n = sc.nextInt();
                k = sc.nextInt();
                System.out.println(binomicalCoef(n, k));
            case 10:
                n = sc.nextInt();
                k = sc.nextInt();
                System.out.println(gsd(n, k));
            default:
                System.out.println("there is no such number");
        }
    }
}

