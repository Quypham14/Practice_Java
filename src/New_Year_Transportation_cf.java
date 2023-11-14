import java.util.Scanner;

public class New_Year_Transportation_cf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t = sc.nextInt();
        int[] a = new int[n];
        boolean check_number = true;
        for (int i = 1; i <= n - 1; ++i) {
            a[i] = sc.nextInt();
        }
        int place = 1;
        while (place < t) {
            place += a[place];
        }
        if (place == t) System.out.println("YES");
        else System.out.println("NO");
    }
}