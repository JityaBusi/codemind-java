import java.util.Scanner;
import java.util.*;
public class hypotenuse{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        double c;
        c=Math.sqrt((Math.pow(a,2)+(Math.pow(b,2))));
        System.out.printf("%.2f",c);
        
    }
}
