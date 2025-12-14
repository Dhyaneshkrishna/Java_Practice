import java.util.*;
public class Mobilenum{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        long mobnum=sc.nextLong();
        if(mobnum >= 1000000000L && mobnum <= 9999999999L)
            System.out.println("valid number");
        else
            System.out.println("not valid");

 
       
    }
}