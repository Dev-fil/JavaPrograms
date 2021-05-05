package OOPS;

 class A{

    A(){
        System.out.println("constructor of A");
    }
}
class B extends A{

     B(){
         this(5);
        // super();//java adds this by default which means first the constructor of the super class i.e the extended class will run
         System.out.println("constructor of B");
     }
     B(int a){
         super();
         System.out.println(a);
     }
}


public class constructor_chaing {
    public static void main(String[] args) {
    B b1=new B();
   // System.out.println(b1);
    }
}

