import java.util.Scanner;
public class two_strings {

     public boolean equals(String a,String b) {
         int l1 = a.length();
         int l2 = b.length();
         boolean isEqual = false;

         if (l1 != l2) {
             isEqual = false;
         } else {

             for (int i = 0; i < l1; i++) {

                 if (a.charAt(i) != b.charAt(i)) {
                     isEqual = false;
                     break;
                 }
                 else{
                     isEqual = true;
                 }
             }
         }
         return  isEqual;

     }



    public static void main(String[] args) {
        System.out.println("ENTER FIRST STRING");
        Scanner sc=new Scanner(System.in);
        String s1=sc.nextLine();
        System.out.println("ENTER SECOND STRING");
        Scanner sc2=new Scanner(System.in);
        String s2=sc2.nextLine();

       two_strings t=new two_strings();
       System.out.println(t.equals(s1,s2));
//        System.out.println(t.equals(s1,s2));
//        if(s1.equals(s2)){
//            System.out.println("both are same");
//        }else{
//            System.out.println("not same ");
//        }

    }
}
