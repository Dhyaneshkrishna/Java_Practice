import java.util.*;
public class SecondMin {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int min=Integer.MAX_VALUE,sec=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            int x=sc.nextInt();
            if(x<min){ sec=min; min=x; }
            else if(x<sec && x!=min) sec=x;
        }
        System.out.println(sec);
    }
}
