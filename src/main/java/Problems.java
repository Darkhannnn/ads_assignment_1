public class Problems {
//    1
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
//    2
//    You are given a number “n” and an array of “n” elements,
//    write the function that returns average of them.
    public static double averageOfArr(int[] arr, int n){
        int m = 0;
        for (int i = 0; i < n; i++) {
            m += arr[i];
        }
        return (double) m / n;
    }
}
