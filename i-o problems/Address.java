import java.util.*;
public class Address{
    public static void main(String[]args){
        Scanner sc=new Scanner (System.in);
        int doorno =sc.nextInt();
        String address=sc.nextLine();
        String state=sc.nextLine();
        String city =sc.nextLine();
        System.out.println(doorno + "\n" + address + "\n" + city + "\n" + state);
    }
}