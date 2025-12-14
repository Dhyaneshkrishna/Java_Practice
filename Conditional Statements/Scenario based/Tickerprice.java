import java.util.*;
public class Tickerprice{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int age=sc.nextInt();
        int tpc=500;
        int tpa=1000;
        int tps=1500;
        if(age>=5 && age<=18){
            System.out.println("child");
            System.out.println("ticket price:"+tpc);
        }
        else if(age>=18 && age<=50){
            System.out.println("adult");
            System.out.println("ticket price:"+tpa);
        }
        else{
            System.out.println("senior");
            System.out.println("ticket price:"+tps);
    }

       
    }
}