package polymorphism;

public class Main {

	public static void main(String[] args) {

		/*
		 * Animal animal = new Animal(); animal.voice();
		 * 
		 * Cat cat = new Cat(); cat.voice();
		 * 
		 * Dog dog = new Dog(); dog.voice();
		 */

		Animal animal = new Bird();
		animal.voice();
	}

}
