import java.util.*;
public class KadaneAlgorithm {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int max=Integer.MIN_VALUE,cur=0;
        for(int i=0;i<n;i++){
            int x=sc.nextInt();
            cur=Math.max(x,cur+x);
            max=Math.max(max,cur);
        }
        System.out.println(max);
    }
}
