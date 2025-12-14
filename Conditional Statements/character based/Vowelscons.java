import java.util.*;
public class Vowelscons{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        char cha=sc.next().charAt(0);
        char ch=Character.toUpperCase(cha);
        if(ch == 'A'||ch == 'E'||ch == 'I'||ch == 'O'||ch == 'U')
            System.out.println("Vowels");
        else
            System.out.println("Consonants");
}
}