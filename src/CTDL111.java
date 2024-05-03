import java.util.Scanner;

public class CTDL111 {

  public static void output() {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while (t-- > 0) {
      long n = sc.nextLong();
      System.out.println(2 * (n - 1));
    }

  }

  public static void main(String[] args) {
    output();
  }
}

