package edu.saintjoe.cs.cmullis.finalprojectcrm;

/* Coded by Collin Mullis
 * CMP112
 * Final Exam
 */
// SubClass for Mammal
public class Human extends Mammal {

	private String name;
	
	public Human(String type, int age) {
		super(type, age);
		
	} 

	public Human(String thisType, int thisAge, String thisName) {
		super(thisType, thisAge);
		name = thisName;
		
	}
	
	public void getType() {
		
	}
	public int setAge(int newAge) {
		int anAge = super.setAge(newAge);
		return anAge;
	}
	
	public String toString() {
		return super.toString() + " Name: " + name;
	}
	
	
}
