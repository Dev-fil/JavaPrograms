import java.util.Scanner;
import java.lang.Math;

public class areahexa {
    public static void main(String[] args) {

        System.out.println("Enter the length of side of a hexagon (in m)");
        Scanner side= new Scanner(System.in);
        double s =side.nextDouble();

        double area=6*(s*s)/(4*Math.tan(Math.PI/6));

        System.out.println("AREA OF THE HEXAGON WITH SIDE " +s+ " m is " +area+ " meter square ");

    }
}
