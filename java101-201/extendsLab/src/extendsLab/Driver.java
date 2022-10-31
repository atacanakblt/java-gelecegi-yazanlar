package extendsLab;

public class Driver {

	public static void main(String[] args) {

		Person person = new Person();
		person.setFirstName("Ahmet");
		System.out.println(person.getFirstName());

		System.out.println("---------------------------------------");

		Student student = new Student();
		student.setFirstName("Ali Can");
		student.setLesson("Math");
		System.out.println(student.getFirstName());

		System.out.println("---------------------------------------");

		UniversityStudent universityStudent = new UniversityStudent();
		universityStudent.setFirstName("Ahmet");
		universityStudent.setLesson("Software");
		universityStudent.setCampus("Kalkınma");
		System.out.println(universityStudent.getFirstName());
		System.out.println(universityStudent.getLesson());
		System.out.println(universityStudent.getCampus());

		System.out.println("---------------------------------------");

		Teacher teacher = new Teacher();
		teacher.setFirstName("Murat");
		teacher.setSchool("ABC Primary School");
		System.out.println(teacher.getFirstName());
		System.out.println(teacher.getSchool());

		System.out.println("---------------------------------------");

		Doctor doctor = new Doctor();
		doctor.setFirstName("Mehmet");
		doctor.setBranch("Brain Surgeon");
		System.out.println(doctor.getFirstName());
		System.out.println(doctor.getBranch());

	}

}
