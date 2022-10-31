package ifBlockLab;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("Lütfen öğrencinin aldığı notu giriniz: ");
		int note = scanner.nextInt();

		if (note >= 90 && note <= 100) {
			System.out.println("Dersi AA ile geçtiniz");
		} else if (note >= 85 && note < 90) {
			System.out.println("Dersi BA ile geçtiniz");
		} else if (note >= 80 && note < 85) {
			System.out.println("Dersi BB ile geçtiniz");
		} else if (note >= 75 && note < 80) {
			System.out.println("Dersi CB ile geçtiniz");
		} else if (note >= 65 && note < 75) {
			System.out.println("Dersi CC ile geçtiniz");
		} else if (note >= 55 && note < 65) {
			System.out.println("Dersi DC ile koşullu geçtiniz");
		} else if (note >= 50 && note < 55) {
			System.out.println("Dersten FD notu ile kaldınız");
		} else if (note >= 0 && note < 50) {
			System.out.println("Dersten FF notu ile kaldınız");
		} else {
			System.out.println("Lütfen 0 ile 100 arasında bir sayı giriniz");
		}
	}

}
