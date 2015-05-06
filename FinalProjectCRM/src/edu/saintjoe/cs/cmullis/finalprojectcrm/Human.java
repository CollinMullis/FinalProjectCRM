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

	public Human(String thisName) {
		name = thisName;
	}
	
}
