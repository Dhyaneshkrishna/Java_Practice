import java.util.*;
public class Batterycheck{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int percent=sc.nextInt();
        if(percent>=90 && percent<=100)
            System.out.println("full");
        else if(percent>=20 && percent<90)
            System.out.println("moderate");
        else
            System.out.println("low");

       
    }
}