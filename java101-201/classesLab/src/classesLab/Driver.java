package classesLab;

public class Driver {

	public static void main(String[] args) {

		Pencil pencil = new Pencil();
		pencil.brand = "A";
		pencil.type = "Lead Pencil";
		pencil.refillable = false;
		pencil.erasable = true;

		pencil.write("Hello");
		pencil.refill();
		pencil.delete();

		Pencil pen = new Pencil();
		pen.brand = "C";
		pen.type = "Stylographic Pen";
		pen.refillable = true;
		pen.erasable = false;

		pen.write("OOP with Java");
		pen.refill();
		pen.delete();

		System.out.println("--------------------------------------");

		Telephone telephone = new Telephone();
		telephone.brand = "X";
		telephone.model = "Y";
		telephone.type = TelephoneType.MOBILEPHONE;
		telephone.mobileData = true;
		telephone.wifi = true;

		telephone.call("554546156513");
		telephone.endCall();
		telephone.sendMessage();

	}

}
