package io.github.rotemdev.api.animal;

public class Animal {
	private String name;
	private String sound;
	private double ageInYears;
	
	public Animal(String name, String sound, double ageInYears) {
		this.name = name;
		this.sound = sound;
		this.ageInYears = ageInYears;
	}
	
	public void makeSound() {
		System.out.println("...");
	}
}
