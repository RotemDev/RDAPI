package io.github.rotemdev.api.animal;
/**
 * I CAN HAZ CHEESEBURGER or something...
 * @author RotemDev
 */
public class Cat extends Animal {

	public Cat() {
		super("Cat", "meow", 5);
	}
	
	/**
	 * {@code}
	 */
	@Override
	public void makeSound() {
		System.out.println("Cat goes meow!");
	}

}
