package edu.saintjoe.cs.cmullis.finalprojectcrm;


/* Coded by Collin Mullis
 * CMP112
 * Final Exam
 */
public class Driver {

	public static void main(String[] args) {
		
	Mammal one;
	Human two;
	
	two = new Human("Human", 18, "Collin");
	one = new Mammal("Dolphin", 1);
	
	System.out.println(one.toString());
	System.out.println(two.toString());

	};

}
