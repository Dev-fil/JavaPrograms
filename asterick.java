import java.util.Scanner;
public class asterick {
    public static void main(String[] args) {
        System.out.println("ENTER ROWS");
        Scanner r=new Scanner(System.in);
        int rows=r.nextInt();
        int space=rows-1;

        int i,j;
        for (j=1;j<=rows;j++){

            for(i=1;i<=space;i++){
                System.out.print(" ");
            }
            space--;


            for(i=1;i<=2*j-1;i++){
                System.out.print("*");
            }
            System.out.println(" ");


        }
        space=1;
        for( j=1;j<=rows-1;j++){

            for(i=1;i<=space;i++){
                System.out.print(" ");
            }
            space++;

            for(i=1;i<=2*(rows-j)-1;i++){
                System.out.print("*");
            }
            System.out.println(" ");
        }


    }
}
