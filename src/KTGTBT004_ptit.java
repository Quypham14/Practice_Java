import java.util.Scanner;
import java.text.DecimalFormat;

public class KTGTBT004_ptit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            float x = sc.nextFloat();

            float result = calculateS(x, n);

            // Sử dụng DecimalFormat để làm tròn giá trị result với 3 số sau dấu phẩy
            DecimalFormat df = new DecimalFormat("#.###");
            String formattedResult = df.format(result);

            System.out.println(formattedResult);
        }
    }

    private static float calculateS(float x, int n) {
        float s = 0;
        float tich = 1;

        for (int i = 1; i <= n; ++i) {
            tich *= x;
            s += tich;
        }

        return s;
    }
}
