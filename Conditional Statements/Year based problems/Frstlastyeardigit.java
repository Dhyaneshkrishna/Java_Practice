import java.util.*;
public class Frstlastyeardigit{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int year=sc.nextInt();
        int frst=year/100;
        int second=year%100;
        if(frst==second)
            System.out.println("equal");
        else
            System.out.println("not equal");
    }
}