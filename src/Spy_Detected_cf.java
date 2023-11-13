import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Spy_Detected_cf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            int check_number = 0;
            Map<Integer, Integer> mymap = new HashMap<>();
            for (int i = 0; i < n; ++i) {
                a[i] = sc.nextInt();
                mymap.put(a[i], mymap.getOrDefault(a[i], 0) + 1);
            }
            for (Map.Entry<Integer, Integer> entry : mymap.entrySet()) {
                if (entry.getValue() == 1) {
                    check_number = entry.getKey();
                    break;
                }
            }
            for (int i = 0; i < n; ++i) {
                if (a[i] == check_number) {
                    System.out.println(i + 1);
                    break;
                }
            }
        }
    }
}