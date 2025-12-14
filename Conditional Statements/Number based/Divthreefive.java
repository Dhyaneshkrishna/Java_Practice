import java.util.*;
public class Divthreefive{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        if((a%3==0 && a%5==0))
            System.out.println("div by 3 and 5");
        else
            System.out.println("not div by 3 and 5");
    }
}