package OOPS;
import java.util.Scanner;

public class p3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter two numbers :");
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        System.out.println("before swaping : "+n1+" "+n2);

        n1=n1 +n2;
        n2=n1-n2;
        n1=n1-n2;

        System.out.println("after swaping : "+n1+" "+n2);

    }
}
