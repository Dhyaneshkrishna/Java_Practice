import java.util.*;
public class Squarec{
public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    int a=sc.nextInt();
    int b=sc.nextInt();
    int c=sc.nextInt();
    int d=sc.nextInt();


    if(a==b && b==c && c==d)
        System.out.println("Squre");
    else if(a==c && b==d)
        System.out.println("Rectangle");
    else
        System.out.println("not square or Rectangle");


}
}