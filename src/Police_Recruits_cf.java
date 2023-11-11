import java.util.Scanner;

public class Police_Recruits_cf {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int dem=0;
        int police_intern=0;
        int[] police=new int[n+1];
        for(int i=1;i<=n;++i)
        {
            police[i]=sc.nextInt();
            if(police[i]==-1)
                if (police_intern == 0)
                {
                    dem++;
                }
                else
                {
                  police_intern-=1;
                }
            else
            {
               police_intern+=police[i];
            }
        }
        System.out.println(dem);
    }
}