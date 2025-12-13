import java.util.*;
public class Candies{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int candies=sc.nextInt();
        int students=sc.nextInt();
        int candiesgiven=candies/students;
        int remaining=candies%students;
        System.out.println(candiesgiven);
        System.out.println(remaining);
        
        
    }
    
}
