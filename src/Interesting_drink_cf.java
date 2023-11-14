import java.util.Arrays;
import java.util.Scanner;

public class Interesting_drink_cf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; ++i) {
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);
        int q = sc.nextInt();

        while (q-- > 0) {
            int result = 0;
            int m = sc.nextInt();
            int solve = binarysearch(a, m);
            System.out.println(solve);
        }
    }

    private static int binarysearch(int[] a, int m) {
        int left = 0;
        int right = a.length - 1;
        int result = 0;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (a[mid] <= m) {
                result = mid + 1;
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return result;
    }
}