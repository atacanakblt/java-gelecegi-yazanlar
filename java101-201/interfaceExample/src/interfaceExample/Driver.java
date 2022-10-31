package interfaceExample;

public class Driver {

	public static void main(String[] args) {

		Surebilir surebilir = new Sofor();
		surebilir.sur();

		Surebilir surebilir2 = new Pilot();
		surebilir2.sur();

		Surebilir surebilir3 = new Kaptan();
		surebilir3.sur();
	}

}
