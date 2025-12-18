import java.util.*;
public class MenuSeries {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int ch=sc.nextInt();
        if(ch==1){
            int x=2;
            int sign=1;
            for(int i=1;i<=20;i++){
                System.out.print(sign*Math.pow(x,i)+" ");
                sign*=-1;
            }
        }else{
            int n=0;
            for(int i=1;i<=5;i++){
                n=n*10+1;
                System.out.print(n+" ");
            }
        }
    }
}
