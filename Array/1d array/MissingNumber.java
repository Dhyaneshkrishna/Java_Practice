import java.util.*;
public class DutchFlag {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++) a[i]=sc.nextInt();
        int l=0,m=0,h=n-1;
        while(m<=h){
            if(a[m]==0){ int t=a[l]; a[l]=a[m]; a[m]=t; l++; m++; }
            else if(a[m]==1) m++;
            else{ int t=a[m]; a[m]=a[h]; a[h]=t; h--; }
        }
        for(int x:a) System.out.print(x+" ");
    }
}
