public class IncreasingGapSeries {
    public static void main(String[] args){
        int t=1,inc=1;
        for(int i=1;i<=10;i++){
            System.out.print(t+" ");
            inc++;
            t+=inc-1;
        }
    }
}
