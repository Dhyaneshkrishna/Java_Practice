import java.util.*;
public class Uplowdigsc{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        char ch=sc.next().charAt(0);
        int c=(int)ch;
        if(c>='A' && c<='Z')
            System.out.println("Uppercase");
        else if(ch>='a' && ch<='z')
            System.out.println("lowercase");
        else if(c>='0' && c<='9')
            System.out.println("digit");
        else
            System.out.println("spec symbols");
}
}