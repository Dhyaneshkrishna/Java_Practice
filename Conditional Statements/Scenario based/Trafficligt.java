import java.util.*;
public class Trafficligt{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        String clr=sc.nextLine();
        if(clr.equalsIgnoreCase("Green"))
            System.out.println("GO");
        else if(clr.equalsIgnoreCase("Yellow"))
            System.out.println("ready");
        else if(clr.equalsIgnoreCase("red"))
            System.out.println("stop");
        else 
            System.out.println("enter valid clr");
    }
}