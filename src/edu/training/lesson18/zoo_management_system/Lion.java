package edu.training.lesson18.zoo_management_system;

public class Lion {
	private String name;
	private int age;
	private int energy;

	public Lion(String name, int age) {
		this.name = name;
		this.age = age;
		this.energy = 100;
	}

	public void makeSound() {
		System.out.println("Lion says: rawr!");
		energy -= 35;
	}

	public void eat() {
		System.out.println("Lion eats!");
		energy += 22;
	}

	public void eat(int extraEnergy) {
		System.out.println("Lion eats!");
		energy += extraEnergy;
	}

	public void printEnergy() {
		System.out.println("Lion energy at the ean of the day: " + energy);
	}

	@Override
	public String toString() {
		return "Lion [name=" + name + ", age=" + age + ", energy=" + energy + "]";
	}

}
