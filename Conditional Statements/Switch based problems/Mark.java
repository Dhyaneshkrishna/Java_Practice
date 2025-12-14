import java.util.*;
public class Mark{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int mark=sc.nextInt();
        int div =mark/10;
        switch (div)
        {
            case 10,9:
                System.out.println("A");
                break;

            case 8,7:
                System.out.println("B");
                break;

            case 6,5:
                System.out.println("C");
                break;        

            default:
                System.out.println("Fail");    
        }

    }
}