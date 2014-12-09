package main;

public  class Car extends Vehicle implements Drivable  {
	
	private int NumberOfDoors;
	
	public Car(){
		
	}
	public Car(int NumberOfDoors){
		this.NumberOfDoors= NumberOfDoors;
	}

	
	public void setNumberOfDoors(int numberOfDoors) {
		NumberOfDoors = numberOfDoors;
	}
	@Override
	public void transferOwnerShip(Person newOwner){
		Owner = newOwner;
	}
	public int getNumberOfDoors() {
		
		return NumberOfDoors;
	}
	

}