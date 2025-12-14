import java.util.*;
public class Trianglequiisoscal{
public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    int a=sc.nextInt();
    int b=sc.nextInt();
    int c=sc.nextInt();

    if(a==b&&b==a)
        System.out.println("equilateral");
    else if(a==b||b==c||c==a)
        System.out.println("isosceles");
    else
        System.out.println("Scalene");
}
}