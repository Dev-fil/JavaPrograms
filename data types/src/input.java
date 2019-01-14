import java.util.Scanner;
class input{
	public static void main(String args[]){
	Scanner input = new Scanner(System.in);
	int a,b,total;
	System.out.println("Enter Two numbers (a>b)");
	a = input.nextInt();
	b = input.nextInt();
	int c = a+b;
	System.out.print("Addition of the numbers is "+ c);
	int d = a-b;
	System.out.print("Subtraction of the numbers is "+ d);
	System.out.print("multiplication of the numbers is "+ a*b);
	System.out.print("division of the numbers is "+ a/b);
	System.out.print("modulus of the numbers is "+ a%b);
	}
}