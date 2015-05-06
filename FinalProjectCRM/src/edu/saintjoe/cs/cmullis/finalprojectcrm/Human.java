package edu.saintjoe.cs.cmullis.finalprojectcrm;


/* Coded by Collin Mullis
 * CMP112 
 * Final Exam
 */
public class Human {

	// Data members
	private final String name;
	private int type; // 1 = Sea 2 = Land 

	}
/*----------------------------------------------------------------------------*/

	// Constructor
	public Human(String thisName, int thisType) {
		name = thisName;
		type = thisType;
	}
	
	// Constructor
	public Human(String thisName) {
		name = thisName;
	}
	// Constructor
	public Human(int thisType) {
		type = thisType
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
}
