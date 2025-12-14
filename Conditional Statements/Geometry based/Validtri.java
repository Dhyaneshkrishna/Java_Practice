import java.util.*;
public class Validtri{
public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    int x=sc.nextInt();
    int y=sc.nextInt();
    int z=sc.nextInt();
    int deg=180;
    int add=x+y+z;

    if(add==deg)
        System.out.println("traingle");
    else
        System.out.println("No");

}
}