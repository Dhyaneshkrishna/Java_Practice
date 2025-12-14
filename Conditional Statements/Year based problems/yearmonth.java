import java.util.*;
public class yearmonth{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int year=sc.nextInt();
        int month=sc.nextInt();
        if(month>=1 && month<=12)
            System.out.println("valid");
        else{
            System.out.println("not valid");
            return;
        }
       if(month==2){
        if(year%4==0 && year%100!=0 || year%400==0)
            System.out.println("29 days");
        else
            System.out.println("28 days");
    }
       else if(month == 1||month ==3||month ==5||month ==7||month ==8||month ==10||month ==12)
            System.out.println("31 days");
       else
            System.out.println("30 days");

    }
}