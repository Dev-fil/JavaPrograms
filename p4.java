package OOPS;
import java.util.HashMap;
import java.util.Scanner;

public class p4 {

    public static void main(String[] args) {
        System.out.println("Enter string :");
        Scanner sc = new Scanner((System.in));
        String s = sc.next();

        HashMap<Character, Integer> key = new HashMap< Character, Integer>();
        for (int i=0;i<s.length();i++){
           key.put(s.charAt(i),i);
    }
        System.out.println(key);
}
}


