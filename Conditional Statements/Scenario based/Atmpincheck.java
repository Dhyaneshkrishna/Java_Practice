import java.util.*;
public class Atmpincheck{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int pin=sc.nextInt();
        int storedpin=1568;
        if(pin==storedpin)
            System.out.println("pin matches");
        else
            System.out.println("doesnot match");
       
    }
}