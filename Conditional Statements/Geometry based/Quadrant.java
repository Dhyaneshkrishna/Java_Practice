import java.util.*;
public class Quadrant{
public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    int x=sc.nextInt();
    int y=sc.nextInt();

    if(x>0 && y>0)
        System.out.println("1st quadrant");
    else if(x<0 && y>0)
        System.out.println("2nd quadrant");
    else if(x<0 && y<0)
        System.out.println("3rd quadrant");
    else
        System.out.println("4th quadrant");
}
}