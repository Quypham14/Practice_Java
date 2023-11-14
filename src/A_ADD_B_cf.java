import java.util.Scanner;

public class A_ADD_B_cf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while (t-- > 0) {
            int sum = 0;
            String s = sc.nextLine();
            // sc.nextLine();
            for (int i = 0; i < s.length(); ++i)
                if (s.charAt(i) != '+') {
                    sum += Character.getNumericValue(s.charAt(i));
                }
            System.out.println(sum);
        }
    }
}