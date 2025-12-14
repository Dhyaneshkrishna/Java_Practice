import java.util.*;
public class Fevercheck{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int temp=sc.nextInt();
        if(temp>100)
            System.out.println("fever");
        else
            System.out.println("no fever");
       
    }
}