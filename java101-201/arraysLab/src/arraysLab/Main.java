package arraysLab;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		/*
		 * int[] numbers = new int[5];
		 * 
		 * numbers[0] = 5; numbers[1] = 10; numbers[2] = 20; numbers[3] = 30; numbers[4]
		 * = 40;
		 * 
		 * System.out.println(numbers.length);
		 * System.out.println(Arrays.toString(numbers));
		 * 
		 * System.out.println("-----------------");
		 * 
		 * for (int i =0;i<5;i++) { System.out.println(numbers[i]); }
		 */

		/*
		 * Scanner scanner = new Scanner(System.in); System.out.print("Dizi Uzunluğu:");
		 * int length = scanner.nextInt(); int[] numbers = new int[length]; for (int i =
		 * 0; i < numbers.length; i++) { System.out.print((i + 1) + ". Sayı:");
		 * numbers[i] = scanner.nextInt(); }
		 * System.out.println(Arrays.toString(numbers));
		 * 
		 * int total = 0; for (int i=0;i<numbers.length;i++) { total = total +
		 * numbers[i]; } System.out.println(total/numbers.length);
		 */

//		int total = 0;
//		int[] numbers = { 1, 5, -5, 9, 2, 8, 9 };
//
//		int[] numbers2 = new int[numbers.length];
//		for (int i = 0; i < numbers.length; i++) {
//			numbers2[i] = numbers[i];
//
//		}

//		System.out.println(Arrays.toString(numbers));
//		System.out.println(Arrays.toString(numbers2));

//		for (int i = 0; i < numbers.length; i++) {
//			total = total + numbers[i];
//		}
//		System.out.println(total);

		int[] numbers = { 20, 32, 12, 46, 4 };
		System.out.println(Arrays.toString(numbers));
		System.out.println(Arrays.binarySearch(numbers, 12)); // Arama yapar

		int[] copyOf = Arrays.copyOf(numbers, 3);
		System.out.println(Arrays.toString(copyOf));
		int[] copyOfRange = Arrays.copyOfRange(numbers, 2, 4); // Aralıktaki (2 ve 3) karakterleri söyler
		System.out.println(Arrays.toString(copyOfRange));

//		Arrays.fill(numbers, 44); // Herşeyi yazılan değere çevirir
//		System.out.println(Arrays.toString(numbers));

		Arrays.sort(numbers);
		System.out.println(Arrays.toString(numbers)); // Küçükten büyüğe sıralar

	}

}