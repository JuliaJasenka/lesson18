package edu.training.lesson18.zoo_management_system;

public class Elephant {
	private String name;
	private int age;
	private int energy;
	
	public Elephant (String name,int age) {
		this.name = name;
		this.age = age;
		this.energy = 100;
	}

	public void makeSound() {
		System.out.println("Elephant says: y-o-o-o-o-o-h!");
		energy -= 40;
	}
	
	public void eat() {
		System.out.println("Elephant eats!");
		energy += 25;
	}
	public void eat(int extraEnergy) {
		System.out.println("Elephant eats!");
		energy += extraEnergy;
	}
	
	public void printEnergy() {
		System.out.println("Elephant energy at the ean of the day: " + energy);
	}

	
	
	@Override
	public String toString() {
		return "Elephant [name=" + name + ", age=" + age + ", energy=" + energy + "]";
	}

	
}
