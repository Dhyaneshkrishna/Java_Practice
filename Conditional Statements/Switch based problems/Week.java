import java.util.*;
public class Week{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int day=sc.nextInt();
        switch (day)
        {
            case 1,2,3,4,5:
                System.out.println("weekday");
                break;

            case 6,7:
                System.out.println("weekend");
                break; 

            default:
                System.out.println("enter valid num");    
        }

    }
}