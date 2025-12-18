import java.util.*;
public class SumA2Series {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        double a=sc.nextDouble(),sum=0;
        for(int i=1;i<=10;i++)
            sum+=a*a/i;
        System.out.println(sum);
    }
}
