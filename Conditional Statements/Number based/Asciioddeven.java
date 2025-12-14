import java.util.*;
public class Asciioddeven{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        char n1=sc.next().charAt(0);
        int b=(int)n1;
        if(b%2==0)
            System.out.println("Even");
        else
            System.out.println("odd");
}
}