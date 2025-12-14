import java.util.*;
public class Withdrwlcheck{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int balance=sc.nextInt();
        int withdramt=sc.nextInt();
        if(withdramt%100==0){
            System.out.println("validated");
         if(withdramt<=balance)
            System.out.println("you can withdrw");
         else
            System.out.println("insuf balance");
        }
        else
            System.out.println("not validated");
       
    }
}