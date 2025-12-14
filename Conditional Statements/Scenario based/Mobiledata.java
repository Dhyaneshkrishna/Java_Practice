import java.util.*;
public class Mobiledata{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int datause=sc.nextInt();
        if(datause>=500 && datause<=700)
            System.out.println("half consumed");
        else if(datause>=10 && datause<500)
            System.out.println("Low data consumed");    
        else if(datause==0)
            System.out.println("data over");
        else
            System.out.println("enter crct mb");  
            
    }
    }
