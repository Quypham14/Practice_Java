import java.util.Arrays;
import java.util.Scanner;

public class The_New_Year_Meeting_Friends_cf
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] friends=new int[3];
        for(int i=0;i<3;++i)
        {
            friends[i]=sc.nextInt();
        }
        Arrays.sort(friends);
        System.out.println(friends[2]-friends[1]+friends[1]-friends[0]);
    }
}