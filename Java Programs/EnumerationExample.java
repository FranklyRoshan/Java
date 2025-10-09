package JavaPackage;

public class EnumerationExample {
	public static void main (String[] args) {
		DayOfWeek day = DayOfWeek.WEDNESDAY;
			
			switch (day) {
				case MONDAY:
				case TUESDAY:
				case WEDNESDAY:
				case THURSDAY:
				case FRIDAY:
				
				System.out.println("It's a weekday.");
				break;
				
				case SATURDAY:
				case SUNDAY:
				System.out.println("It's a weekend.");
				break;
				
			}
		}
	}
