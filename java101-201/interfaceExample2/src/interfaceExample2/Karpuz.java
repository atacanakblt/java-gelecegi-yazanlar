package interfaceExample2;

public class Karpuz implements Meyve {

	double n;
	double kgFiyat = 3;

	@Override
	public void meyveAdi() {
		System.out.println("Karpuz");

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
