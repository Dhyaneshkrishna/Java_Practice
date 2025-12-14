import java.util.*;
public class Samelastdigit{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        int num1=n1%100;
        int num2=n2%100;
        if(num1==num2)
            System.out.println("same");
        else
            System.out.println("not same");
    }
}