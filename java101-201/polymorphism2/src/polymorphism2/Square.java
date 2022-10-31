package polymorphism2;

public class Square extends Shape {

	private int kenarUzunlugu;

	public Square(int u) {
		kenarUzunlugu = u;
	}
	
	public int getKenarUzunlugu() {
		return kenarUzunlugu;
	}

	public void setKenarUzunlugu(int u) {
		kenarUzunlugu = u;
	}

	public void alan() {
		System.out.println("Kare Alan : " + (Math.pow(kenarUzunlugu, 2)));


	}

}
