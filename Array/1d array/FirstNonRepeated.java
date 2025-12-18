import java.util.*;
public class FirstNonRepeated {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++) a[i]=sc.nextInt();
        for(int i=0;i<n;i++){
            boolean ok=true;
            for(int j=0;j<n;j++)
                if(i!=j && a[i]==a[j]) ok=false;
            if(ok){ System.out.println(a[i]); return; }
        }
        System.out.println(-1);
    }
}
