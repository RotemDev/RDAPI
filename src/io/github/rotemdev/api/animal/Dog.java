package io.github.rotemdev.api.animal;

public class Dog extends Animal {

	public Dog() {
		super("Dog", "woof", 12.7);
	}
	
	@Override
	public void makeSound() {
		System.out.println("Dog goes woof!");
	}

}
