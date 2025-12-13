import java.util.*;
    public class Mango{
        public static void main(String[]args){
            Scanner sc=new Scanner(System.in);
            int mangoes=sc.nextInt();
            int price=sc.nextInt();
            int offer=mangoes/3;
            int totalmang=offer+mangoes;
            int totalprice=mangoes*price;
            System.out.println(totalmang);
            System.out.println(totalprice);
                
            
        }
        
    }