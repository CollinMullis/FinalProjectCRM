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
	
	
	public String toString() {
		
		return "Type: " + type + " Age: " + age;
	}
}
