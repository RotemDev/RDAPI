package io.github.rotemdev.api.animal;

public class Cat extends Animal {

	public Cat() {
		super("Cat", "meow", 5);
	}
	
	@Override
	public void makeSound() {
		System.out.println("Cat goes meow!");
	}

}
