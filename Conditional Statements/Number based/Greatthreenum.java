import java.util.*;
public class Greatthreenum{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        if(a>b & a>c)
            System.out.println("greater a:"+a);
        else if(b>c)
            System.out.println("greater b:"+b);   
        else
            System.out.println("greater c:"+c);
    }
}