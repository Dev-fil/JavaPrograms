package OOPS;

public class student {

    String name="dev"; //instance variables
    int roll_no=10;
    double cgpa=9.5;
    static int fee; //class variable

    //behaviour
    void studentName(){
        int a; //local variable (only accessed in this function
        System.out.println("name is "+name);
    };
    void studentRoll(){
        System.out.println("roll-no. is "+roll_no);
    };
    void studentcgpa(){
        System.out.println("cgpa is "+cgpa);
    }

    public static void main(String[] args) {
        student obj= new student(); //creating object syntax
        obj.studentName();
        obj.studentRoll();
        obj.studentcgpa();
    }

}
