import java.util.Scanner;

public class CON5_26 {

  public static void output() {
    int t, c, n;
    Scanner sc = new Scanner(System.in);
    t = sc.nextInt();
    while (t-- > 0) {
      c = sc.nextInt();
      n = sc.nextInt();
      int[] a = new int[n + 1];
      int[][] l = new int[n + 1][c + 1];
      for (int i = 1; i <= n; ++i) {
        a[i] = sc.nextInt();
      }
      for (int i = 1; i <= n; ++i) {
        for (int j = 1; j <= c; ++j) {
          if (a[i] <= j) {
            l[i][j] = Math.max(l[i - 1][j - a[i]] + a[i], l[i - 1][j]);
          } else {
            l[i][j] = l[i - 1][j];
          }
        }
      }
      System.out.println(l[n][c]);
    }
  }

  public static void main(String[] args) {
    output();
  }
}


