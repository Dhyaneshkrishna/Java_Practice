import java.util.*;
public class Distbttwopnt{
public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    int x1=sc.nextInt();
    int y1=sc.nextInt();
    int x2=sc.nextInt();
    int y2=sc.nextInt();
    int xpart=(x2-x1)*(x2-x1);
    int ypart=(y2-y1)*(y2-y1);
    int add=xpart + ypart;
    double sqrt=Math.sqrt(add);
    System.out.println(sqrt);


}
} 