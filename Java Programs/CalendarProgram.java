package JavaPackage;
import java.util.*;

public class CalendarProgram {

	public static void main(String[] args) {
				
				Calendar calendar = Calendar.getInstance();
				
				System.out.println(calendar.getTime());
				System.out.print(calendar.get(Calendar.DATE)+ ":\t");
				System.out.print(calendar.get(Calendar.MONTH)+ ":\t");
				System.out.print(calendar.get(Calendar.YEAR)+ "\t");
				
				

	}

}
