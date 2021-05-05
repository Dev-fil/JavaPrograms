import java.util.Scanner;
public class input {

//    public static void main(String[] args){
//        Scanner s1=new Scanner(System.in);
//        System.out.println("Enter the input");
//        String num =s1.next();
//
//        System.out.println("input entered by user is " + num);
//    }
public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);
    int i = scan.nextInt();

    double d = scan.nextDouble();

    String s = scan.nextLine();


    // Write your code here.

    System.out.println("String: " + s);
    System.out.println("Double: " + d);
    System.out.println("Int: " + i);
}



}

//other methods of scanner class are:

//next()--for one word input
//nextLine()---for the entire line input
//nextBoolean()
//nextByte()
//nextLong()
//nextShort()
//nextFloat()