package OOPS;


class car{
   private String carColor;
   private  int carGears;
   engine E=new engine();

  car(String carColor,int carGears,int carPower,String transmission){
     E.setCarPower(carPower);
     E.setTransmission(transmission);
     this.carColor=carColor;
     this.carGears=carGears;

  }

  public String getCarColor(){
     return carColor;
  }
  public int getCarGears(){
     return carGears;
  }
  public int getcarPower(){
     return E.getCarPower();
  }
  public String getTransmission(){
     return E.getTransmission();
  }
}

public class composition {

   public static void main(String[] args) {
      car c=new car("maroon",5,500,"manual");
      System.out.println(c.getCarColor());
   }
}
