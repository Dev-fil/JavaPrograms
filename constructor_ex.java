package OOPS;

public class constructor_ex {
    private String name;
    private int rollno;
    private int fee;

    constructor_ex(){
        name="dev";
        rollno=10;
        fee=10000;
    }

    constructor_ex(String n,int r, int f){
        name=n;
        rollno=r;
        fee=f;

    }

    constructor_ex(String NAME){
        name=NAME;

    }
    String get_name(){
        return name;
    }

    int get_rollno(){
        return rollno;
    }

    int get_fee(){
        return fee;
    }

    public static void main(String[] args) {
        constructor_ex s=new constructor_ex();

        System.out.println(s.get_name());
        System.out.println(s.get_rollno());
        System.out.println(s.get_fee());

        constructor_ex s1=new constructor_ex("aarti",11,20000);

        System.out.println(s1.get_name());
        System.out.println(s1.get_rollno());
        System.out.println(s1.get_fee());

        constructor_ex s2=new constructor_ex("dahiya");

        System.out.println(s2.get_name());
        System.out.println(s2.get_rollno());
        System.out.println(s2.get_fee());
    }
}
