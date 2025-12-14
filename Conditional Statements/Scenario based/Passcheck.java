import java.util.*;
public class Passcheck{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int mark=sc.nextInt();
        if(mark>=35)
            System.out.println("pass");
        else
            System.out.println("fail");
       
    }
}