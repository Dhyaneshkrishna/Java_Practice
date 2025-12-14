import java.util.*;
public class Elecbill{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int units=sc.nextInt();
        int surcharge=50;
        if(units>=500)
            System.out.println("total cost after surcharge:"+(units*20+surcharge));
        else if(units>300 && units<500)
            System.out.println("total bill:"+units*10);
        else if(units>101 && units<=300)
            System.out.println("total bill:"+units*5);
        else
            System.out.println("free");
       
    }
}