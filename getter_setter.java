package OOPS;

public class getter_setter {
    private  String name="dev";
    private int rollno;
    private int fee;

    public void setName(String Name){

        this.name=Name;
        System.out.println(Name);
    }
    public void setRollno(int rollno){
        this.rollno=rollno;
    }
    public void setFee(int fee){
        this.fee=fee;
    }

    public String getName(){
        return name;
    }
    public int getRollno()
    {
        return rollno;
    }
    public int getFee(){
        return fee;
    }


    public static void main(String[] args) {
        getter_setter s=new getter_setter();
        s.setName("peema");
System.out.println(s.name);
    }
}
