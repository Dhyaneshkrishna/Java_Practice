import java.util.*;
public class num_octal_Dec {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter:");
        int a=sc.nextInt();
        String format=Integer.toOctalString(a);
        System.out.println(format);
    }
    
}
