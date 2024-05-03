import java.util.List;
import java.util.Scanner;
import java.util.Vector;

public class CTDL099 {

  public static void output() {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    int n;
    while (t-- > 0) {
      n = sc.nextInt();
      int[] arr = new int[n + 1];
      for (int i = 1; i <= n; ++i) {
        arr[i] = sc.nextInt();
      }
      List<Integer> v = new Vector<>();
      for (int i = 1; i <= n - 1; ++i) {
        Boolean check = true;
        for (int j = i + 1; j <= n; ++j) {
          if (arr[i] < arr[j]) {
            v.add(arr[j]);
            check = false;
            break;
          }
        }
        if (check) {
          v.add(-1);
        }
      }
      v.add(-1);
      for (int i = 0; i < v.size(); ++i) {
        System.out.print(v.get(i) + " ");
      }
      System.out.println();
    }
  }

  public static void main(String[] args) {
    output();
  }
}
