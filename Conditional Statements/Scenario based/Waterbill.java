import java.util.*;
public class Waterbill{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int useltr=sc.nextInt();
        if(useltr<=1000)
            System.out.println("free");
        else if(useltr>=1001 && useltr<=3000)
            System.out.println((useltr-1000)/1000*5);    
        else if(useltr>stdltr){
            int cal=useltr*10/100;
            int fi=cal*stdltr*5/10;
            System.out.println(fi);
        }
            
}
    }
