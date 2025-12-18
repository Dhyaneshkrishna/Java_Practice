import java.util.*;
public class CountOddArray {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),c=0;
        for(int i=0;i<n;i++) if(sc.nextInt()%2!=0) c++;
        System.out.println(c);
    }
}
