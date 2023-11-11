import java.util.Scanner;

public class Vasya_the_Hipster_cf {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int red_socks=sc.nextInt();
        int blue_socks=sc.nextInt();
        int fashionable=Math.min(red_socks,blue_socks);
        int same_socks=(Math.max(red_socks,blue_socks)-Math.min(red_socks,blue_socks))/2;
       System.out.print(fashionable);
       System.out.print(" ");
       System.out.print(same_socks);
    }
}