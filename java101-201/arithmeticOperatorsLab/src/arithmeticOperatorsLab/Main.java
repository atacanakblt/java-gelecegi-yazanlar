package arithmeticOperatorsLab;

public class Main {

	public static void main(String[] args) {

		int k = 10;
		float l = 20;
		System.out.println(k + l);
		System.out.println(k - l);
		System.out.println(k * l);
		System.out.println(k / l);
		System.out.println(8 % 3);

		int w = 10;
		// w = w+2;
		w += 2;
		System.out.println(w);

		int q = 12;
		System.out.println(++q);
		System.out.println(q);

		// Değişken Tanımlaması:
		int a = 25, b = 3, c = 17;
		String x = "Aritmetik : ", y = "Operatörler";
		// Stringlerde Ekleme Operatörünü Kullanırsak:
		System.out.println("Merhaba!\n" + (x + y));
		// Ekleme ve Çıkarma Operatörleri:
		System.out.println("A + B = " + (a + b) + "\nA - C = " + (a - c));
		// Çarpma ve Bölme Operatörleri:
		System.out.println("A * B = " + (a * b) + "\nA / 5 = " + (a / 5));
		// Mod Alma Operatörü:
		System.out.println("C % B = " + (c % b));

		// Tekil Operatörler
		// Değişken Tanımlaması:
		int f = 87, d = 13;
		boolean kosul = true;
		// Ön Arttırma ve Azalatma Operatörü:
		System.out.println("(A) Değeri: " + f + "\t(++A) Değeri: " + (++f));
		System.out.println("(B) Değeri: " + d + "\t(--B) Değeri: " + (--d));
		// Sonrası Artış ve Azaltma Operatörü
		System.out.println("(A) Değeri: " + f + "\t(A--) Değeri: " + (--f));
		System.out.println("(B) Değeri: " + d + "\t(B++) Değeri: " + (++d));
		// Mantıksal Değil Operatörü:
		System.out.println("Değil (!): " + !kosul);

	}

}
