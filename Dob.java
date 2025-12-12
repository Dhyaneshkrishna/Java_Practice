import java.util.*;
public class Dob{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter date:");
        int date =sc.nextInt();
        System.out.println("enter month:");
        int month =sc.nextInt();
        System.out.println("enter year:");
        int year =sc.nextInt();

        System.out.println(date + "/" + month + "/" + year);
    }
}