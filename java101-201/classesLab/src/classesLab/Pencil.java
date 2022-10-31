package classesLab;

public class Pencil {

	String brand;
	String type;
	boolean refillable;
	boolean erasable;

	void write(String text) {
		System.out.println(text);

	}

	void refill() {
		if (refillable) {
			System.out.println("Pen filled");

		} else {
			System.out.println("This pen is not refillable");

		}
	}

	void delete() {
		if (erasable) {
			System.out.println("Post deleted");

		} else {
			System.out.println("This post can't be deleted");

		}

	}
}
