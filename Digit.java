import java.util.*;
public class Digit {
    public static void main(String args[]) {
        int n,count=0;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        while(n>0)
        {
            count++;
            n=n/10;
        }
        System.out.println(count);
    }
}
