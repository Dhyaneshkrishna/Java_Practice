import java.util.*;
public class Cube{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int s=sc.nextInt();
        int peri=12*s;
        int sa=6*s*s;
        int volume=s*s*s;
        int add=peri+sa+volume;
        
        
        
        System.out.println(add);
    }
}