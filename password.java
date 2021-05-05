import  java.util.Scanner;
public class password {

    public static int password_length=10;

    public static boolean password_valid(String pass) {

        if (pass.length() < password_length)
            return false;

        int digit_length = 0;
        int letter_length = 0;

        for (int i = 0; i < pass.length(); i++) {
            char ch = pass.charAt(i);

            if(char_isNumber(ch)){
                digit_length++;
            }
            else if (char_isletter(ch)){
                letter_length++;
            }
            else{
                return  false;
            }
        }
        return (letter_length>=2 && digit_length>=2);
    }
        public static boolean char_isletter(char ch){
             ch=Character.toUpperCase(ch);
             return (ch>='A' && ch<='Z');
        }
        public static boolean char_isNumber(char ch){
            return(ch<='9' && ch>='0');

    };

    public static void main(String[] args) {
        System.out.println(
                "RULES FOR THE PASSWORD TO BE STRONG:\n"
                        + "1. A password must have at least ten characters.\n"
                        + "2. A password consists of only letters and digits.\n"
                        + "3. A password must contain at least two digits.\n\n"
                        + "ENTER PASSWORD: ");
        Scanner sc=new Scanner(System.in);
        String Password =sc.nextLine();

        if (password_valid(Password)){
            System.out.println("Your password is strong");
        }
        else{
            System.out.println("Your password is weak");
        }
    }
}
