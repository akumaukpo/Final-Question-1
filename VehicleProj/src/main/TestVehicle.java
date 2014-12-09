package main;

public class TestVehicle {
    public static void main(String[] args){
   	 
   	 Person a = new Person();
   	 a.setFirstName("a");
   	 
   	 Car new_car= new Car();
   	 new_car.Owner= a;
   	 new_car.setNumberOfDoors(4);
   	 System.out.println(new_car.Owner.getFirstName());

   	 Truck new_truck= new Truck();
   	 new_truck.Owner=a;
   	 new_truck.setNumberOfAxels(2);
   	 System.out.println(new_truck.Owner.getFirstName());

   	 Person b= new Person();
   	 b.setFirstName("b");
   	 new_truck.Owner=b;


   	 
   	 
   	 MotorCycle new_motorcycle= new MotorCycle();
   	 new_motorcycle.setHasSideCar(false);
   
   	 System.out.println(new_truck.Owner.getFirstName());
   	 System.out.println(new_car.getNumberOfDoors());
   	 System.out.println(new_motorcycle.isHasSideCar());

   	 
    }
}