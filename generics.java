class Example<E>{
    E i;
    public void setI(E i1){
        i=i1;
    }
    public E getI(){
        return i;
    }
}

public class generics {
    public static void main(String[] args) {
        Example <Integer> e=new Example<Integer>();
        Example <String> e1=new Example<String>();

        Integer i2= new Integer(10);
        String s=new String("dev");

        e1.setI(s);
        System.out.println(e1.getI());
        e.setI(i2);
        System.out.println(e.getI());

        int arr[]=new int[5];
        System.out.println(arr);

        int array_variable [] = new int[10];
        for (int i = 0; i < 10; ++i)
        {
            array_variable[i] = i;
            System.out.print(array_variable[i] + " ");
            i++;
        }
    }
}
