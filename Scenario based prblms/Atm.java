import java.util.*;
    public class Atm{
        public static void main(String[]args){
            Scanner sc=new Scanner(System.in);
            int amount=sc.nextInt();
            int twothos=amount/2000;
            int remaining=amount%2000;
            int fivehun=remaining/500;
            int rem2=remaining%500;
            int hun=rem2/100;
            int rem3=rem2%100;
            System.out.println(twothos);
            System.out.println(fivehun);
            System.out.println(hun);  

            
            
                
            
        }
        
    }