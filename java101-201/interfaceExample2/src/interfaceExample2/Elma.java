package interfaceExample2;

public class Elma implements Meyve {

	double n;
	double kgFiyat = 8.80;

	@Override
	public void meyveAdi() {
		System.out.println("Elma");

	}

	@Override
	public void alinanKg(double n) {
		this.n = n;
	}

	@Override
	public double fiyat() {
		return n * kgFiyat;
	}

}