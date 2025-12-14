import java.util.*;
public class Speedchecbike{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int speedlimit=100;
        int ride=sc.nextInt();
        if(ride>speedlimit)
            System.out.println("Over-speeding! Fine imposed");
        else
            System.out.println("Speed iswithin limit");  
            
    }
    }
