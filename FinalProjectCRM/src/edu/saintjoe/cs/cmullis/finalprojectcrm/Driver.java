package edu.saintjoe.cs.cmullis.finalprojectcrm;

public class Driver {

	public static void main(String[] args) {
		
	Mammal one;
	Human two;
	
	one = new Mammal("Dolphin", 1);
	two = new Human("Human", 18, "Collin");
	System.out.println(one.toString());
	System.out.println(two.toString());

	};

}
