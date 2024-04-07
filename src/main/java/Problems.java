public class Problems {
//    Problem 1.
//    You are given a number “n” and an array of “n” elements,
//    write the function that returns minimum of them.
    public static int minOfArr(int[] arr, int n){
        int m = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            if (arr[i] < m){
                m = arr[i];
            }
        }
        return m;
    }
//    Problem 2.
//    You are given a number “n” and an array of “n” elements,
//    write the function that returns average of them.
    public static double averageOfArr(int[] arr, int n){
        int m = 0;
        for (int i = 0; i < n; i++) {
            m += arr[i];
        }
        return (double) m / n;
    }
//    Problem 3.
//    You are given a number “n”,
//    write the function for checking whether“n” is prime.
    public static boolean primeNumCheck(int n){
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
//    Problem 4.
//    You are given a number “n”,
//    write the program using recursion for finding “n!”
    public static int factorial(int n){
        if (n == 1){
            return 1;
        }
        return factorial(n-1)*n;
    }
//    Problem 5.
//    You are given a number “n”,
//    write the function for finding n-th elements in Fibonacci sequence using recursion.
//    (Fn = Fn-1+ Fn-2). F0= 0, F1 = 1.
    public static int fib(int n){
        if (n <= 1){
            return n;
        }
        return fib(n - 1) + fib(n - 2);
    }
//    Problem 6.
//    You are given numbers “a” and “n”,
//    write the function that returns “a^n”.
    public static int power(int a, int n){
        int res = 1;
        for (int i = 0; i < n; i++) {
            res *= a;
        }
        return res;
    }
//    Problem 7.
//    You are given a number “n” and an array of “n” elements,
//    write the program that returns given array in reverse order
//    without using array data structure.
//    (Hint: recursion)
//    public static void reverseArr(int[] arr, int start, int end){
//        if (start >= end){
//            return;
//        }
//        int temp = arr[start];
//        arr[start] = arr[end];
//        arr[end] = temp;
//        reverseArr(arr, start + 1, end - 1);
//    }

    public static String reverse(String str){
        if (str == null || str.length() <= 1) {
            return str;
        }
        return reverse(str.substring(1)) + str.charAt(0);
    }

//    Problem 8.
//    You are given a string “s”,
//    write the function for checking whether “s” is all consists of digits.
    public static boolean isAllDigit(String str){
        for (int i = 0; i < str.length(); i++) {
            if (!Character.isDigit(str.charAt(i))){
                return false;
            }
        }
        return true;
    }
}
