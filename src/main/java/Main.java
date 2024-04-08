import java.util.Scanner;

// Main class, the entry point of the program
public class Main extends Problems {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("List of the problems: ");
        System.out.println(
                """
                        1. Find the minimum of an array.
                        2. Calculate the average of elements in an array.
                        3. Check if a number is prime.
                        4. Calculate factorial of a number.
                        5. Find the nth Fibonacci number.
                        6. Calculate power of a number.
                        7. Reverse a string.
                        8. Check if a string consists only of digits.
                        9. Calculate binomial coefficient.
                        10. Find the greatest common divisor (GCD) of two numbers.
                        """
        );
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
                System.out.println("Insert length of an array:");
                n = sc.nextInt();
                arr = new int[n];
                System.out.println("An array:");
                for (int i = 0; i < n; i++) {
                    arr[i] = sc.nextInt();
                }
                System.out.println("Result: " + minOfArr(arr, n));
                break;
            case 2:
                complexity = "O(n)";
                System.out.println("Insert length of an array:");
                n = sc.nextInt();
                arr = new int[n];
                System.out.println("An array:");
                for (int i = 0; i < n; i++) {
                    arr[i] = sc.nextInt();
                }
                System.out.println("Result: " + averageOfArr(arr, n));
                break;
            case 3:
                complexity = "O(sqrt(n))";
                System.out.println("Insert the number:");
                n = sc.nextInt();
                System.out.println("Result: " + primeNumCheck(n));
                break;
            case 4:
                complexity = "O(n)";
                System.out.println("Insert the number:");
                n = sc.nextInt();
                System.out.println("Result: " + factorial(n));
                break;
            case 5:
                complexity = "O(2^n)";
                System.out.println("Insert the number:");
                n = sc.nextInt();
                System.out.println("Result: " + fib(n));
                break;
            case 6:
                complexity = "O(n)";
                System.out.println("Insert the base number:");
                a = sc.nextInt();
                System.out.println("Insert the power number:");
                n = sc.nextInt();
                System.out.println("Result: " + power(a, n));
                break;
            case 7:
                complexity = "O(n)";
                System.out.println("Insert the number:");
                n = sc.nextInt();
                System.out.println("An array:");
                while(n != 0){
                    storageString += sc.next();
                    if (n > 1){
                        storageString += " ";
                    }
                    n--;
                }
                System.out.println("Result: " + reverse(storageString));
                break;
            case 8:
                complexity = "O(n)";
                System.out.println("Insert the string:");
                storageString = sc.nextLine();
                System.out.println("Result: " + (isAllDigit(storageString) ? "Yes": "No"));
                break;
            case 9:
                complexity = "O(2^n)";
                System.out.println("Insert n:");
                n = sc.nextInt();
                System.out.println("Insert k:");
                k = sc.nextInt();
                System.out.println("Result: " + binomicalCoef(n, k));
                break;
            case 10:
                complexity = "O(log(min(a, b))";
                System.out.println("Insert two numbers:");
                n = sc.nextInt();
                k = sc.nextInt();
                System.out.println("Result: " + gcd(n, k));
                break;
            default:
                System.out.println("there is no such number");
        }
        long endTime = System.nanoTime(); // Record end time

        // Calculate and display runtime and complexity
        System.out.println("Runtime in nanoseconds: "+ (endTime - startTime)/ 1000000 + " Complexity: " + complexity);
    }
}

