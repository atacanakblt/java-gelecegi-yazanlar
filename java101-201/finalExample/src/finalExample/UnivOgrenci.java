package finalExample;

public class UnivOgrenci extends Ogrenci {
	
	public UnivOgrenci(int n) {
		super(n);
	}
	
	public void yazdir() {
		System.out.println("Üniversite Öğrenci " + getNumara());
	}

}
