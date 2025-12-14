import java.util.*;
public class Aphaornot{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        char ch=sc.next().charAt(0);
        if((ch>='A' && ch<='Z')||(ch>='a' && ch<='z'))
            System.out.println("aphabhet");
        else
            System.out.println("No");
}
}