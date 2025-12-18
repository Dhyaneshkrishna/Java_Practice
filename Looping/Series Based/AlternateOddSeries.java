import java.util.*;
public class AlternateOddSeries {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        double x=sc.nextDouble();
        int n=sc.nextInt();
        double sum=0;
        for(int i=1;i<=n;i++){
            double t=Math.pow(x,i)/(2*i-1);
            sum+=(i%2==1)?t:-t;
        }
        System.out.println(sum);
    }
}
