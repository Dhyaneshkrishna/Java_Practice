import java.util.*;
public class SecondMax {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int max=Integer.MIN_VALUE,sec=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            int x=sc.nextInt();
            if(x>max){ sec=max; max=x; }
            else if(x>sec && x!=max) sec=x;
        }
        System.out.println(sec);
    }
}
