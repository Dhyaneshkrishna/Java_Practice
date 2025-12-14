import java.util.*;
public class Cuboid{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int s=sc.nextInt();
        int l=sc.nextInt();
        int b=12*s;
        int h=6*s*s;
        int sa=2*(l*b+b*h+h*l);
        int volume=l*b*h;
        System.out.println(volume);
        System.out.println(sa);
        
    }
}