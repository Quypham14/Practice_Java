import java.util.Scanner;

public class SUM_cf {
    public static boolean checkSum(int a, int b, int c)
    {
        return(a+b==c||a+c==b||c+b==a);
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int a= sc.nextInt();
            int b= sc.nextInt();
            int c=sc.nextInt();
            if(checkSum(a,b,c))
            {
                System.out.println("YES");
            }
            else
            {
                System.out.println("NO");
            }
        }
    }
}