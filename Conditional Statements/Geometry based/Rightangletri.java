import java.util.*;
public class Rightangletri{
public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    int a=sc.nextInt();
    int b=sc.nextInt();
    int c=sc.nextInt();
    int add=a*a+b*b;
    int mul=c*c;

    if(add==mul)
        System.out.println("right angle");
    else
        System.out.println("no");
}
}