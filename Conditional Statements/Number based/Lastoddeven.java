import java.util.*;
public class Lastoddeven{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int th=a/10;;
        if(th%2==0)
            System.out.println("even");
        else
            System.out.println("odd");
    }
}