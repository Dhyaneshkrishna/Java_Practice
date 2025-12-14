import java.util.*;
public class Season{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int month=sc.nextInt();
        switch (month)
        {
            case 3,4,5:
                System.out.println("spring");
                break;

            case 6,7,8:
                System.out.println("summer");
                break; 
              
            case 9,10,11:
                System.out.println("Autumn");
                break;    
            case 12,1,2:
                System.out.println("winter");
                break;

            default:
                System.out.println("enter valid num");    
        }

    }
}