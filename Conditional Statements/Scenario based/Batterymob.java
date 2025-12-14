import java.util.*;
public class Batterymob{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int batper=sc.nextInt();
        if(batper>=0 && batper<=20)
            System.out.println("low battery");
        else if(batper>=20 && batper<=90)
            System.out.println("50% consumed");
        else
            System.out.println("Battery full");
       
    }
}