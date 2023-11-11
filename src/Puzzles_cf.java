import java.util.Arrays;
import java.util.Scanner;

public class Puzzles_cf
{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int m=sc.nextInt();
        int[] f=new int[m+1];
        for(int i=1;i<=m;++i)
        {
            f[i]= sc.nextInt();
        }
        Arrays.sort(f);
        int min_diffi= Integer.MAX_VALUE;
        for(int i=1;i<=m-n+1;++i)
        {
            int diffi=f[i+n-1]-f[i];
            min_diffi=Math.min(min_diffi,diffi);
        }
        System.out.println(min_diffi);
    }
}