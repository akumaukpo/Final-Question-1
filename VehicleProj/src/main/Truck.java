package main;

public  class Truck extends Vehicle{
	;
	
	private int NumberOfAxels;
	public Person newOwner;

	public Truck(){
	}
	
	public Truck(int NumberOfAxels, Person Owner){
		this.NumberOfAxels=NumberOfAxels;
		this.Owner= Owner;
	}
	
	public int getNumberOfAxels() {
		return NumberOfAxels;
	}

	public void setNumberOfAxels(int numberOfAxels) {
		NumberOfAxels = numberOfAxels;
	}
	
	public Person ownership(Person newOwner){
		super.transferOwnerShip(newOwner);
		 return  newOwner;
	}

	
}