package edu.training.lesson18.zoo_management_system;

public class Monkey {
	private String name;
	private int age;
	private int energy;
	
	public Monkey (String name,int age) {
		this.name = name;
		this.age = age;
		this.energy = 100;
	}

	public void makeSound() {
		System.out.println("Monkey says: ooh ooh ah ah!");
		energy -=20;
	}
	
	public void eat() {
		System.out.println("Monkey eats!");
		energy += 10;
	}
	public void eat(int extraEnergy) {
		System.out.println("Monkey eats!");
		System.out.println();
		energy += extraEnergy;
	}
	
	public void printEnergy() {
		System.out.println("Monkey energy at the ean of the day: " + energy);
	}

	@Override
	public String toString() {
		return "Monkey [name=" + name + ", age=" + age + ", energy=" + energy + "]";
	}

	

}
