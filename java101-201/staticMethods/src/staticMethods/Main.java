package staticMethods;

public class Main {

	public static void main(String[] args) {

		System.out.println(Math.PI);

		System.out.println(Math.pow(2, 3));
		System.out.println(Math.sqrt(9));
		System.out.println(Math.min(6, 3));
		System.out.println(Math.max(6, 3));

		float f = 1.50f;
		System.out.println(Math.ceil(f)); // Yukarı yuvarlar
		System.out.println(Math.floor(f)); // Aşağı yuvarlar
		System.out.println(Math.round(f)); // Eğer sayı buçuktan küçükse aşağı büyükse veya eşitse yukarı yuvarlar
		System.out.println(Math.random() * 10); // Sıfırla bir arası rastgele sayı üretir

	}

}
