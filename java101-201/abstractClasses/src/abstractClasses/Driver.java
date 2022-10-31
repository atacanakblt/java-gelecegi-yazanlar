package abstractClasses;

public class Driver {

	public static void main(String[] args) {

		Oyuncu oyuncu = new Basketbolcu();
		oyuncu.setIsim("Arda Turan");
		oyuncu.setNumara(66);
		oyuncu.pasVer();
		oyuncu.sutCek();
	}

}
