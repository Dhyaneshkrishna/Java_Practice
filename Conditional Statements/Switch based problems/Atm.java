import java.util.*;
public class Atm{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int cash=sc.nextInt();
        int balance=12000;
        System.out.println("what process should select:");
        int process=sc.nextInt();
        switch (process)
        {
            case 1:
                System.out.println("Deposit");
                balance += cash;
                System.out.println("Deposited amt:"+cash);
                System.out.println("total:"+balance);
                break;

            case 2:
                System.out.println("withdraw");
                balance -= cash;
                System.out.println("withdrawed amt:"+cash);
                System.out.println("balance aftr withdrawl:"+balance);
                break; 
              
            case 3:
                System.out.println("bank balance check:12000");
                break;    
                
            case 4:
                if(cash>balance)
                System.out.println("insuffient balance");
                else
                    System.out.println(balance);
                break;
            default:
                System.out.println("enter valid num");    
        }

    }
}