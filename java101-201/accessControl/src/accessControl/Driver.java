package accessControl;

import example.Car;

public class Driver {

	public static void main(String[] args) {

//		Student student = new Student();
//		/*
//		 * student.firstName = "Atacan"; 
//		 * student.lastName = "Akbulut"; 
//		 * student.number = 7;
//		 * 
//		 */
//	
//		student.printNumber();

//		Car car = new Car();
//		car.brand = "BMV";

		Student student = new Student();
		student.number = 7;
		student.firstName = "Ali";
		student.lastName = "Karabulut";
		student.setAge(12);

		student.printInformation();
	}

}
