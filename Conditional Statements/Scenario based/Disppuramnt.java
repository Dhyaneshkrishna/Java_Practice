import java.util.*;
public class Disppuramnt{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int puramt=sc.nextInt();
        int dispa=10;
        int dispb=20;
        int dispc=30;
        if(puramt>=10000 && puramt<20000)
            System.out.println("discounted price:"+(puramt-puramt*dispa/100));
        else if(puramt>=20000 && puramt<=30000)
            System.out.println("discounted price:"+(puramt-puramt*dispb/100));
        else if(puramt>=30000)
            System.out.println("discounted price:"+(puramt-puramt*dispc/100));
        else 
            System.out.println("enter proper amt");
    }
}