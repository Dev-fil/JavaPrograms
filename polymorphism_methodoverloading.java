package OOPS;

public class polymorphism_methodoverloading {
    void add(int a,int b){
        System.out.println((a+b));
    }
    void add(int a,int b,int c){      //different in number
         System.out.println((a+b+c));
    }
    void add(double a,int b){           //different in datatype
        System.out.println((a+b));
    }
    void add(int a,double b){           //different in sequence
        System.out.println((a+b));
    }

    public static void main(String[] args) {
        polymorphism_methodoverloading p=new polymorphism_methodoverloading();
        p.add(5,20,80);
    }
}
