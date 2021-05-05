package OOPS;


class animal{
    void eat(){
        System.out.println("all animals eat something");
    }
}
class cow extends animal{
    @Override
    void eat(){
        System.out.println("cow eat grass");
    }
    void colour(){
        System.out.println("color of cow is white");
    }
}
class lion extends animal{
    @Override
    void eat(){
        System.out.println("lion eat meat");
    }
}
class unknown extends animal{

}

public class polymorphism_methodoverriding {
    public static void main(String[] args) {
           animal a;
           a= new cow();
           a.eat();
           a= new lion();
           a.eat();
           a=new unknown();
           a.eat();
           cow c=new cow();
           c.colour();


    }
}
