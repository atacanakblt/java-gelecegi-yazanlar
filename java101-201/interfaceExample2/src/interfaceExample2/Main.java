package interfaceExample2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Çilek fiyatı hesaplamak için 1\n" + "Armut fiyatı hesaplamak için 2\n"
				+ "Elma fiyatı hesaplamak için 3\n" + "Karpuz fiyatı hesaplamak için 4\n" + "'e basınız ");
		int y = scanner.nextInt();

		switch (y) {
		case 1:
			double n;
			Cilek cilek = new Cilek();
			cilek.meyveAdi();
			System.out.println("Kaç kg çilek alındı?");
			n = scanner.nextDouble();
			cilek.alinanKg(n);
			System.out.println("Çilek fiyat toplamı = " + cilek.fiyat());
			break;
		case 2: {
			Armut armut = new Armut();
			armut.meyveAdi();
			System.out.println("Kaç kg armut alındı?");
			n = scanner.nextDouble();
			armut.alinanKg(n);
			System.out.println("Armut fiyat toplamı = " + armut.fiyat());
			break;
		}
		case 3: {
			Elma elma = new Elma();
			elma.meyveAdi();
			System.out.println("Kaç kg elma alındı?");
			n = scanner.nextDouble();
			elma.alinanKg(n);
			System.out.println("Elma fiyat toplamı = " + elma.fiyat());
			break;
		}
		case 4: {
			Karpuz karpuz = new Karpuz();
			karpuz.meyveAdi();
			System.out.println("Kaç kg karpuz alındı?");
			n = scanner.nextDouble();
			karpuz.alinanKg(n);
			System.out.println("Karpuz fiyat toplamı = " + karpuz.fiyat());
			break;

		}
		}
	}

}
