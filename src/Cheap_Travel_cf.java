import java.util.Scanner;

public class Cheap_Travel_cf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int result = (n / m) * b;
        if (n % m < m && n % m > 0)
            result += Math.min(b, (n % m) * a);
        System.out.println(Math.min(result, n * a));
    }
}