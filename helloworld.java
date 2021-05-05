public class helloworld {

    public int sum(int a,int b){
        int result = a+b;
        return result;

    };

    public static void main(String[] args) {
        System.out.println("hello user..!!");

        helloworld h=new helloworld();
        System.out.println(h.sum(1,2));

    }
}

