import java.util.*;
public class Lastdivthree{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int lastdigit=a/10;
        if(lastdigit%3==0)
            System.out.println("last digit is div by 3"+lastdigit);
        else
            System.out.println("last digit is not div by 3"+lastdigit);
    }
}