package interfaceExample2;

public class Armut implements Meyve {

	double n;
	double kgFiyat = 12;

	@Override
	public void meyveAdi() {
		System.out.println("Armut");

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
