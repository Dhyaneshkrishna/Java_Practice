public class AlternateEvenSum {
    public static void main(String[] args){
        int sum=0,sign=1;
        for(int i=2;i<=20;i+=2){
            sum+=sign*i;
            sign*=-1;
        }
        System.out.println(sum);
    }
}
