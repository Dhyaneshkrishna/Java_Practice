import java.util.*;
public class ContainsDuplicate {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++) a[i]=sc.nextInt();
        boolean dup=false;
        for(int i=0;i<n;i++)
            for(int j=i+1;j<n;j++)
                if(a[i]==a[j]) dup=true;
        System.out.println(dup);
    }
}
