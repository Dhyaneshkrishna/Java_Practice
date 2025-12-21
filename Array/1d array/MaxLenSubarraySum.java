import java.util.*;
public class MaxLenSubarraySum {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++) a[i]=sc.nextInt();
        int sum=sc.nextInt(),max=0;
        for(int i=0;i<n;i++){
            int s=0;
            for(int j=i;j<n;j++){
                s+=a[j];
                if(s==sum) max=Math.max(max,j-i+1);
            }
        }
        System.out.println(max);
    }
}
