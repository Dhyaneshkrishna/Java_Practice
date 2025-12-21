import java.util.*;
public class RemoveDuplicatesNoSpace {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++) a[i]=sc.nextInt();
        for(int i=0;i<n;i++){
            if(a[i]==Integer.MIN_VALUE) continue;
            for(int j=i+1;j<n;j++)
                if(a[i]==a[j]) a[j]=Integer.MIN_VALUE;
        }
        for(int i=0;i<n;i++)
            if(a[i]!=Integer.MIN_VALUE) System.out.print(a[i]+" ");
    }
}
