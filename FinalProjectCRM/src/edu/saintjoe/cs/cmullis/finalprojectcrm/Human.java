package edu.saintjoe.cs.cmullis.finalprojectcrm;

/* Coded by Collin Mullis
 * CMP112
 * Final Exam
 */
public class Human extends Mammal {
	
	private String name;
	
	public Human(String thisType, int thisAge) {
		super(thisType, thisAge);
	}
	
	public Human(String thisType, int thisAge, String thisName) {
		super(thisType, thisAge);
		name = thisName;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String toString() {
		return super.toString() + " Name: " + name;
	}
}
