import java.util.*;
public class Prodtwonumposneg{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        int prod=n1*n2;
        if(prod>0)
            System.out.println("positive");
        else if(prod<0)
            System.out.println("negative");
        else
            System.out.println("zero");
    }
}