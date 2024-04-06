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
}
