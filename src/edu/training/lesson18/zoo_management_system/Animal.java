package edu.training.lesson18.zoo_management_system;

public class Animal {
	private String name;
	private int age;
	private int energy;
	
	public Animal (String name,int age) {
		this.name = name;
		this.age = age;
		this.energy = 100;
	}

	public void makeSound() {
		energy -=10;
	}
	
	public void eat() {
		energy += 15;
	}
	
	public void eat(int extraEnergy) {
		energy += extraEnergy;
	}

	@Override
	public String toString() {
		return "Animal [name=" + name + ", age=" + age + ", energy=" + energy + "]";
	}
	
	
}
