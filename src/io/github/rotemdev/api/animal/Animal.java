package io.github.rotemdev.api.animal;

/**
 * This is just an animal
 * @author RotemDev
 *
 */
public class Animal {
	private String name;
	private String sound;
	private double ageInYears;
	
	/**
	 * To be Overriden by <code>super(name, sound, ageInYears)</code>
	 * @param name
	 * @param sound
	 * @param ageInYears
	 */
	public Animal(String name, String sound, double ageInYears) {
		this.name = name;
		this.sound = sound;
		this.ageInYears = ageInYears;
	}

	/**
	 * to be Overriden
	 */
	public void makeSound() {
		System.out.println("...");
	}
}
