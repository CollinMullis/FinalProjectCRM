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

	public Human(String thisName, int thisType) {
		name = thisName;
		type = thisType;
	}
	
	public Human(String thisName) {
		name = thisName;
	}
	
	public Human(int thisType) {
		type = thisType
	}
