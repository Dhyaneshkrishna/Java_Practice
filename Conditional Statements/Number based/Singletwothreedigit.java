import java.util.*;
public class Singletwothreedigit{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        if(n1>=0 && n1<=9)
            System.out.println("single digit");
        else if(n1>=10 && n1<=99)
            System.out.println("double digit");
        else
            System.out.println("three digit");
    }
}