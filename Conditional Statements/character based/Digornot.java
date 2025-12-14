import java.util.*;
public class Digornot{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        char n=sc.next();
        if(n>='0' && n<='9')
            System.out.println("digit");
        else
            System.out.println("No");
}
}