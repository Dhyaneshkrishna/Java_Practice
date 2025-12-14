import java.util.*;
public class Sumoddeven{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int add=a+b;
        if(add%2==0)
            System.out.println("even");
        else
            System.out.println("odd");
    }
}