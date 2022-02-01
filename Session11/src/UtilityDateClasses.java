import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class UtilityDateClasses {

	public static void main(String[] args) {
		
		Date date = new Date();
		System.out.println("Today is: "+date);
		
		Calendar calendar = Calendar.getInstance();
		
		System.out.println(calendar.get(Calendar.DAY_OF_MONTH));
		System.out.println((calendar.get(Calendar.MONTH)+1)); // 0-11
		System.out.println(calendar.get(Calendar.YEAR));
		
		//SimpleDateFormat format1 = new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat format1 = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");
		String formattedDate = format1.format(date);
		System.out.println("formattedDate is: "+formattedDate);
		
		
		// We can manipulate Calendar data as well
		calendar.set(Calendar.DAY_OF_MONTH, 20);
		Date date1 = calendar.getTime();
		System.out.println("date1 is: "+date1);
	}
}

// Assignment: Mr. John runs a wheel alignment and balancing company.
//			   A client Mr George comes on 1st Feb, 2022 and his next visit is due after 7 weeks (7 can be taken as an input from User)
//			   Suggest the date on which Mr. George has to come again :)
