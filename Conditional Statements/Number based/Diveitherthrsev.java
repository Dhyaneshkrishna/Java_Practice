import java.util.*;
public class Diveitherthrsev{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        if((a%3==0 || a%7==0))
            System.out.println("div by 3 or 7");
        else
            System.out.println("not div by 3 or 7");
    }
}