import java.time.DayOfWeek;
import java.time.Month;

public class Main {

	public static void main(String[] args) {

		Months month = Months.OCAK;
		System.out.println(month);

		month = Months.EKIM;
		System.out.println(month);

		Months[] values = Months.values();
		for (int i = 0; i < values.length; i++) {
			System.out.println(values[i]);

		}
		Months valueOf = Months.valueOf("SUBAT");
		System.out.println(valueOf);

		DayOfWeek sunday = DayOfWeek.SUNDAY;
		System.out.println(sunday);

		DayOfWeek of = DayOfWeek.of(3);
		System.out.println(of);

		Month february = Month.FEBRUARY;
		System.out.println(february);

	}

}
