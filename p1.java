package OOPS;
import java.util.Scanner;

//Write a Java Program to reverse a string without using String inbuilt function.
public class p1 {

    String reverse(String a){
        String r="";
        if (a.length()!=0){
        int length=a.length();
        for(int i=length-1;i>=0;i--){
            r = r + a.charAt(i);
        }
            System.out.print("reversed string : " +r);
        }
            return r;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER STRING TO BE REVERSED");
        String input=sc.next();
        System.out.println("entered string : "+ input);
         p1 obj=new p1();
         obj.reverse(input);
    }
}
