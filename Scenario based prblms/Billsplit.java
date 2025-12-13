import java.util.*;
public class Billsplit {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int members=sc.nextInt();
        int totalbill=sc.nextInt();
        double split=totalbill/members;
        System.out.println(split);
        
        
    }
    
}
