import java.util.*;
public class Cylindrical{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int r=sc.nextInt();
        int h=sc.nextInt();
        double pie=3.14;
        double sa=2*pie*r*r+h;
        double volume=pie*r*r*h;
        System.out.println(volume);
        System.out.println(sa);
        
    }
}