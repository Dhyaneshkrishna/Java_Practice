import java.util.*;
public class Threedigit{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        if(a>=99 & a<=999)
            System.out.println("3 digit num");
        else
            System.out.println("not 3 digit num");
    }
}