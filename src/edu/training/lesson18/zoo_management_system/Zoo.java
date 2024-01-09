package edu.training.lesson18.zoo_management_system;

import java.util.ArrayList;

public class Zoo {
	private ArrayList<Object> animals = new ArrayList<>();

	public void addAnimal(Object animal) {
		animals.add(animal);
	}

	public void simulateDay() {
		for (Object animal : animals) {
			if (animal instanceof Lion) {
				Lion lion = (Lion) animal;
				lion.makeSound();
				lion.eat();
			} else if (animal instanceof Monkey) {
				Monkey monkey = (Monkey) animal;
				monkey.makeSound();
				monkey.eat(13);
			} else if (animal instanceof Elephant) {
				Elephant elephant = (Elephant) animal;
				elephant.makeSound();
				elephant.eat();
			}
		}
	}

	public void displayEnergy() {
		for (Object animal : animals) {
			if (animal instanceof Lion) {
				((Lion) animal).printEnergy();

			} else if (animal instanceof Monkey) {
				((Monkey) animal).printEnergy();

			} else if (animal instanceof Elephant) {
				((Elephant) animal).printEnergy();
			}
		}
	}

}
