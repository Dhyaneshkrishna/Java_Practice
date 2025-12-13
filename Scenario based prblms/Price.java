import java.util.*;
    public class Price{
        public static void main(String[]args){
            Scanner sc=new Scanner(System.in);
            int pen=sc.nextInt();
            int penprice=sc.nextInt();
            int offerset=pen/5;//2
            int remaining=pen%5;//2
            int payfor=offerset*3+remaining;
            int Tm=payfor*penprice;
            System.out.println("pay for:"+payfor );
            System.out.println("total amount:"+Tm);
                
            
        }
        
    }