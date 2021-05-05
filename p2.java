package OOPS;
import java.util.*;

public class p2 {

    public static void main(String[] args) {
        int x, y, w;// x and y are to swap
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers");
        x = sc.nextInt();
        y = sc.nextInt();
        System.out.println("before swapping: " +x +"  "+ y);
        w = x;
        x = y;
        y = w;
        System.out.println("After swapping: " +x +"   " + y);
    }
}
