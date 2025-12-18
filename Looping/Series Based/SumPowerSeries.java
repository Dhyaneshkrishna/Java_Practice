import java.util.*;
public class SumPowerSeries {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        double a=sc.nextDouble(),sum=0;
        for(int i=1;i<=10;i++)
            sum+=Math.pow(a,i)/i;
        System.out.println(sum);
    }
}
