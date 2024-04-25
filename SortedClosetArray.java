import java.util.*;

public class SortedClosetArray {
    public static void printCloset(int arr[], int n, int x) {
        int res1 = 0;
        int res2 = 0;
        int temp = Integer.MAX_VALUE;

        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (Math.abs(arr[i] + arr[j] - x) < temp) {

                    res1 = i;
                    res2 = j;

                    temp = Math.abs(arr[i] + arr[j] - x);
                }
            }
        }
        System.out.println("Total closet Pair: " + arr[res1] + " and " + arr[res2]);
    }

    public static void main(String[] args) {
        int arr[] = { 1, 3, 4, 7, 10 };
        int x = 15;
        int n = arr.length;

        printCloset(arr, n, x);
    }
}
