import java.util.*;
public class ReplaceNegativeZero {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            int x=sc.nextInt();
            if(x<0) x=0;
            System.out.print(x+" ");
        }
    }
}
