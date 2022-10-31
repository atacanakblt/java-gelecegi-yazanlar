package methodOverriding;

public class Main {

	public static void main(String[] args) {

		Araba araba = new Araba("X Marka", "Y Model", 2000);
		System.out.println(araba.toString());
		
		araba.setMarka("Q Marka");
		System.out.println(araba.toString());
	}

}
