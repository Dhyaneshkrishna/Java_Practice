import java.util.*;
public class Ticprweekweekend{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int mon=1000;
        int tue=1100;
        int wed=1800;
        int thr=1150;
        int fri=1200;
        int sat=2000;
        int sun=2300;
        int day=sc.nextInt();
        switch(day)
        {
            case 1:
                System.out.println("monday:"+mon);
                break;
            
            case 2:
                System.out.println("tue:"+tue);
                break; 

            case 3:
                System.out.println("wed:"+wed);
                break;     
           
            case 4:
                System.out.println("thurs:"+thr);
                break; 

            case 5:
                System.out.println("fri:"+fri);
                break;

            case 6:
                System.out.println("sat:"+sat);
                break;
              
            case 7:
                System.out.println("sun:"+sun);
                break;    
        } 
        }
    
       
    }
