import java.util.*;
public class Discount {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int AP=sc.nextInt();
        int discount=sc.nextInt();
        int da=AP*discount/100;
        int finalamount=AP-da;
        System.out.println("Discount amount:"+da+"finalamount:"+finalamount);
    }
    
}
