import java.util.*;
public class Difftwooddeven{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int minus=a-b;
        if(minus%2==0)
            System.out.println("even");
        else
            System.out.println("odd");
    }
}