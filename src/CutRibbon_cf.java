import java.util.Scanner;

public class CutRibbon_cf {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int[] dp=new int[n+1];
        for(int i=1;i<=n;++i)
        {
            dp[i]=Integer.MIN_VALUE;
            if(i-a>=0)
            {
                dp[i]=Math.max(dp[i],dp[i-a]+1);
            }
            if(i-b>=0) dp[i]=Math.max(dp[i],dp[i-b]+1);
            if(i-c>=0) dp[i]=Math.max(dp[i], dp[i-c]+1);
        }
        System.out.println(dp[n]);
    }
}