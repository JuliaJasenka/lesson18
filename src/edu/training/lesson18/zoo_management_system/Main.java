package edu.training.lesson18.zoo_management_system;

public class Main {

	public static void main(String[] args) {

		Zoo zoo = new Zoo();
			
		zoo.addAnimal(new Lion("Leo", 5));
		zoo.addAnimal(new Elephant("Dumbo", 10));
		zoo.addAnimal(new Monkey("George", 3));
		
		zoo.simulateDay();

		zoo.displayEnergy();
	}


}
