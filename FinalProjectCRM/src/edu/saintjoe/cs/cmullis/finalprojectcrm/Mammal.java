package edu.saintjoe.cs.cmullis.finalprojectcrm;

/* Coded by Collin Mullis
 * CMP112 
 * Final Exam
 */
public class Mammal {

	// Data members
	private final String type;
	private int age;

/*----------------------------------------------------------------------------*/

	// Constructor
	public Mammal(String thisType, int thisAge) {
		type = thisType;
		age = thisAge;
	}
	
	// Constructor
	public Mammal(String thisType) {
		type = thisType;
	}
	
	// Accessor
	public String getType() {
		return type;
	}
	
	public int getAge() {
		return age;
	}
	
	public int setAge(int newAge) {
		int oldAge = age;
		age = newAge;
		return oldAge;
	}
	
	public String toString() {
		
		return "Type: " + type + " Age: " + age;
	}
}
