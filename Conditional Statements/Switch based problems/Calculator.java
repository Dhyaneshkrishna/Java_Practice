import java.util.*;
public class Calculator{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        System.out.println("Addition(1):"+"subtraction(2):"+"Division(3)"+"Multiply(4)");
        int option=sc.nextInt();
        switch (option)
        {
            case 1:
                System.out.println(num1+num2);
                break;

            case 2:
                System.out.println(num1-num2);
                break;

            case 3:
                if(num2==0)
                    System.out.println("not div by 0");
                else
                    System.out.println(num1/num2);
                break;

            case 4:
                System.out.println(num1*num2);
                break;
        

        default:
                System.out.println("success");    
        }

    }
}