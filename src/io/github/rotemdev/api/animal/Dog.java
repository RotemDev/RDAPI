package io.github.rotemdev.api.animal;

public class Dog extends Animal {
	/**
	 * Such code, much wow
	 */
	public Dog() {
		super("Dog", "woof", 12.7);
	}
	
	/**
	 * {@code}
	 */
	@Override
	public void makeSound() {
		System.out.println("Dog goes woof!");
	}

}
