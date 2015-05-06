package edu.saintjoe.cs.cmullis.finalprojectcrm;

/* Coded by Collin Mullis
 * CMP112 
 * Final Exam
 */
public class Mammal {

	// Data members
	private final String name;
	private int type; // 1 = Sea 2 = Land 

/*----------------------------------------------------------------------------*/

	// Constructor
	public Mammal(String thisName, int thisType) {
		name = thisName;
		type = thisType;
	}
	
	// Constructor
	public Mammal(String thisName) {
		name = thisName;
	}
	
	// Accessor
	public String getName() {
		return name;
	}
	
	// Accessor
	public int getType() {
		return type;
	}
	
	// Mutator
	public int setType(int newType) {
		int oldType = type;
		type = newType;
		return oldType;
	}
	
	public String toString() {
		
		return "Name: " + name + " Type: " + type;
	}
}
