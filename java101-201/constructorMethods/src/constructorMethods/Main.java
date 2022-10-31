package constructorMethods;

public class Main {

	int x;

	public Main() {
		System.out.println("ctor");
		x = 20;

	}

	public static void main(String[] args) {

		/*
		 * Main driver = new Main(); System.out.println(driver.x);
		 */

		Student student = new Student("Mehmet", "Karaca", 14);
		System.out.println(student.firstName);
		System.out.println(student.lastName);
		System.out.println(student.age);

		Student student2 = new Student();
		System.out.println(student2.firstName);
		System.out.println(student2.lastName);
		System.out.println(student2.age);
	}

}