import java.util.Scanner;

// Main class, the entry point of the program
public class Main extends Problems {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insert the problem number:");
        int y = sc.nextInt(); // Get the problem number from user input
        sc.nextLine();

        // Declare all variables
        int n;
        int a;
        int k;
        int[] arr;
        String storageString = "";
        String complexity = "";

        long startTime = System.nanoTime(); // Record start time

        // Switch case to select and execute the problem based on user input
        switch (y){
            case 1:
                complexity = "O(n)";
                n = sc.nextInt();
                arr = new int[n];
                for (int i = 0; i < n; i++) {
                    arr[i] = sc.nextInt();
                }
                System.out.println(minOfArr(arr, n));
                break;
            case 2:
                complexity = "O(n)";
                n = sc.nextInt();
                arr = new int[n];
                for (int i = 0; i < n; i++) {
                    arr[i] = sc.nextInt();
                }
                System.out.println(averageOfArr(arr, n));
                break;
            case 3:
                complexity = "O(sqrt(n))";
                n = sc.nextInt();
                System.out.println(primeNumCheck(n));
                break;
            case 4:
                complexity = "O(n)";
                n = sc.nextInt();
                System.out.println(factorial(n));
                break;
            case 5:
                complexity = "O(2^n)";
                n = sc.nextInt();
                System.out.println(fib(n));
                break;
            case 6:
                complexity = "O(n)";
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
                complexity = "O(n)";
                storageString = sc.nextLine();
                System.out.println(isAllDigit(storageString) ? "Yes": "No");
                break;
            case 9:
                complexity = "O(2^n)";
                n = sc.nextInt();
                k = sc.nextInt();
                System.out.println(binomicalCoef(n, k));
                break;
            case 10:
                complexity = "O(log(min(a, b))";
                n = sc.nextInt();
                k = sc.nextInt();
                System.out.println(gcd(n, k));
                break;
            default:
                System.out.println("there is no such number");
        }
        long endTime = System.nanoTime(); // Record end time

        // Calculate and display runtime and complexity
        System.out.println("runtime in nanoseconds: "+ (endTime - startTime)/ 1000000 + " Complexity: " + complexity);
    }
}

