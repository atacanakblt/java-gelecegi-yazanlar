package polymorphism3;

public class Main {

	public static void main(String[] args) {

//		Employee employee = new Employee("Mehmet", "Software Developer", 20000);
//		employee.ozet();

		Employee employee = new Officer("Mehmet", "Software Developer", 20000, "E-Ticaret");
		employee.ozet();
	}

}
