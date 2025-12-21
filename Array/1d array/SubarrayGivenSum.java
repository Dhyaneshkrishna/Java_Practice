import java.util.*;
public class SubarrayGivenSum {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++) a[i]=sc.nextInt();
        int sum=sc.nextInt(),cur=0,l=0;
        for(int r=0;r<n;r++){
            cur+=a[r];
            while(cur>sum && l<=r) cur-=a[l++];
            if(cur==sum){ System.out.println(l+" "+r); return; }
        }
        System.out.println(-1);
    }
}
