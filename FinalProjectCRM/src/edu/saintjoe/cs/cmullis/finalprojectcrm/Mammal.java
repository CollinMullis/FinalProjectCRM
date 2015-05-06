package edu.saintjoe.cs.cmullis.finalprojectcrm;

/* Coded by Collin Mullis
 * CMP112 
 * Final Exam
 */
public class Mammal {

	public class Human {

	}

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
	
	// Accessor
	public int getAge() {
		return age;
	}
	
	// Mutator
	public int setType(int newAge) {
		int oldAge = age;
		age = newAge;
		return oldAge;
	}
	
	public String toString() {
		
		return "Type: " + type + " Age: " + age;
	}
}
