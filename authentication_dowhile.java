import java.util.Scanner;

public class authentication_dowhile {
    public static void main(String[] args) {
        int i=1;
        do{
            System.out.println("Enter Username");
            Scanner u=new Scanner(System.in);
            String username=u.nextLine();

            System.out.println("Enter Password");
            Scanner p=new Scanner(System.in);
            String Password=u.next();

            if(username.contains("aarti") && Password.contains("dahiya") ){
                System.out.println("YOU ARE LOGGED IN");
            }
            else {
                System.out.println("PLEASE ENTER CORRECT USERNAME AND PASSWORD");
            }
            i++;
        }while(i<=3);
    }
}
