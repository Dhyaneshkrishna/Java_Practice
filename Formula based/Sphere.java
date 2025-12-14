import java.util.*;
public class Sphere{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int r=sc.nextInt();
        double pie=3.14;
        double sa=4*pie*r*r;
        double volume=4/3*pie*r*r*r;
        System.out.println(volume);
        System.out.println(sa);
        
    }
}