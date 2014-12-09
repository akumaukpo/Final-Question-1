package main;

import java.util.UUID;

public class Person{
	String FirstName;
	String LastName;
	static UUID PersonID;
	
	public void setFirstName(String fName){
		FirstName = fName;
	}
	
	public void setLastName(String lName){
		LastName = lName;
	}
	
	public static void setPersonID(){
		PersonID = UUID.randomUUID();
	}
	
	public String getLastName(){
		return LastName;
	}
	
	public String getFirstName(){
		return FirstName;
	}
	
	public UUID getPersonID( ){
		return PersonID;
	}
}