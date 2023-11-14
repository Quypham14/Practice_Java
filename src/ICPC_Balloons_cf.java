import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ICPC_Balloons_cf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int sum = 0;
            int n = sc.nextInt();
            sc.nextLine();
            String s = sc.nextLine();
            int result = countballons(n, s);
            System.out.println(result);

        }
    }

    public static int countballons(int n, String s) {
        Set<Character> solved = new HashSet<>();
        int balloons = 0;
        for (int i = 0; i < n; ++i) {
            char problem = s.charAt(i);
            if (!solved.contains(problem)) {
                balloons += 2;
                solved.add(problem);
            } else balloons += 1;
        }
        return balloons;
    }
}