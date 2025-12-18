import java.util.*;
public class FindDuplicateNPlus1 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        boolean[] seen=new boolean[n];
        for(int i=0;i<n+1;i++){
            int x=sc.nextInt();
            if(seen[x]){ System.out.println(x); return; }
            seen[x]=true;
        }
    }
}
