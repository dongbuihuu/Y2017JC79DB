package Teacher.ADVANCED_TOPICs.ENUMERATIONS;

public class Test {

	public static void main(String[] args) {
		// Selected option in Enumerations
		WeekDays wk = WeekDays.sun;
		System.out.println("Today is " + wk); // Output : Today is sun

		// Value() method
		WeekDays[] arrVM = WeekDays.values();
		System.out.println("--- Value Method ---");
		for (WeekDays weekDays : arrVM) {
			System.out.println("Today is " + weekDays);
		}
	}
}
