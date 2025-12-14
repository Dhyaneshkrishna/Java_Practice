import java.util.*;
public class Discount{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int billamount=sc.nextInt();
        if(billamount>90000){
            int discount=25;
            System.out.println("reduced price:"+(billamount-billamount*discount/100));
        }
        else if(billamount>50000 && billamount<90000){
            int discount=15;
            System.out.println("reduced price:"+(billamount -billamount*discount/100));
        }
        else{
            int discount=5;
            System.out.println("reduced price:"+(billamount -billamount*discount/100));
        }
    }
}