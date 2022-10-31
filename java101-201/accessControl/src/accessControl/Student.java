package accessControl;

public class Student {

	public int number = 7;
	public String firstName;
	public String lastName;
	private int age;

	public void setAge(int y) {
		if (y > 0) {
			age = y;
		} else {
			System.out.println("Age value can't be less than zero");

		}
	}

	public void printInformation() {

		System.out.println("Number : " + number);
		System.out.println("First Name : " + firstName);
		System.out.println("Last Name : " + lastName);
		System.out.println("Age : " + age);

	}
}
