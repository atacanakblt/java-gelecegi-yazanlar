package interfaceExample2;

public class Cilek implements Meyve {

	double n;
	double kgFiyat = 9.80;

	@Override
	public void meyveAdi() {
		System.out.println("Çilek");

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
