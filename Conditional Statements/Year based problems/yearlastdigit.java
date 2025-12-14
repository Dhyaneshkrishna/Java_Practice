import java.util.*;
public class yearlastdigit{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int yearone=sc.nextInt();
        int yeartwo=sc.nextInt();
        int x=yearone%100;
        int y=yeartwo%100;
        if(x==y)
            System.out.println("equal");
        else
            System.out.println("not equal");
    }
}