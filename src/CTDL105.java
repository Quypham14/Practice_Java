import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class CTDL105 {

  public static void directedgraph() {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while (t-- > 0) {
      int n = sc.nextInt();
      int m = sc.nextInt();
      ArrayList<Integer>[] road = new ArrayList[1005];
      for (int i = 1; i <= n; ++i) {
        road[i] = new ArrayList<>();
      }
      for (int i = 0; i < m; ++i) {
        int x = sc.nextInt();
        int y = sc.nextInt();
        road[x].add(y);
      }
      for (int i = 1; i <= n; ++i) {
        Collections.sort(road[i]);
        System.out.print(i + ": ");
        for (int x : road[i]) {
          System.out.print(x + " ");
        }
        System.out.println();
      }
    }
  }

  public static void main(String[] args) {
    directedgraph();
  }
}
