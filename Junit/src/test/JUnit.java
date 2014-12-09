package test;

import static org.junit.Assert.*;

import org.junit.Test;


import main.Car;
import main.MotorCycle;
import main.Person;
import main.Truck;



public class JUnit {

	@Test
	public void test() {
		Person a = new Person();
		
   	 a.setFirstName("a");

   	 Car new_car= new Car();
   	 new_car.setOwner(a);
   	 new_car.setNumberOfDoors(4);
  	assertEquals("First name of the Person a","a",a.getFirstName());

  	
   	 Truck new_truck= new Truck();
   	 new_truck.setOwner(a);
   	 new_truck.setNumberOfAxels(2);
  	assertEquals("the new truck owned by person a","a",new_truck.getOwner().getFirstName());


   	 Person b= new Person();
   	 b.setFirstName("b");
   	 new_truck.setOwner(b);
   	assertEquals("the new truck owned by person b","b",new_truck.getOwner().getFirstName());


   	 
   	 
   	 MotorCycle new_motorcycle= new MotorCycle();
   	 new_motorcycle.setHasSideCar(false);
   
   	 
  	assertEquals("The car owned by person (a) has 4 doors",4,new_car.getNumberOfDoors());
  	assertEquals("The truch owned by person (a) has 2 axels",2,new_truck.getNumberOfAxels());

 	assertEquals("Motorcycle with no sidecar",false,new_motorcycle.isHasSideCar());

	}

}