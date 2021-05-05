
import java.util.Scanner;
public class arrays {
    public static void main(String[] args) {
         int [] num= new int[10];

          for (int i=0;i<num.length;i++){
              System.out.println("Enter "+(i+1)+" st number");
              Scanner sc = new Scanner(System.in);
              int number= sc.nextInt();
             num[i]=number;
          }
          for(int i:num){
              System.out.println(i);
          }
    }
}
