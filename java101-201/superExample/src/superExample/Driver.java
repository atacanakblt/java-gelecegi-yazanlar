package superExample;

public class Driver {

	public static void main(String[] args) {

		Kisi kisi = new Kisi("Ertuğ Çalışkan");
		System.out.println(kisi.getIsim());

		Ogrenci ogrenci = new Ogrenci("Mehmet Tek", 25);
		System.out.println(ogrenci.getIsim());
		System.out.println(ogrenci.getNumara());

		ogrenci.ozet();
	}

}
