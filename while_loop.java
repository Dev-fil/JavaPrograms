import java.util.Scanner;
public class while_loop {
    public static void main(String[] args) {
        System.out.println("Enter lower limit of range");
        Scanner l=new Scanner(System.in);
        int r1=l.nextInt();
        System.out.println("Enter upper limit of range");
        Scanner u=new Scanner(System.in);
        int r2=u.nextInt();
        System.out.println("THE RANGE ENTERED BY USER IS "+r1+" - "+r2);
        System.out.println("Positive integers between them are :");
        int i=r1;
        while(i<=r2){
            if(i%2==0){
                System.out.println(i);
            }
            i++;
        }
    }
}
