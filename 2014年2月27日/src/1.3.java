import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import org.apache.commons.lang3.time.DateUtils;
public class test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DateFormat dateFormat = new SimpleDateFormat("YYYY年MM月dd日aahh时mm分");
		Calendar cal1 = Calendar.getInstance();
		cal1.set(2000, 01, 29, 8, 25);
		//System.out.println(dateFormat.format(cal1.getTime()));
		System.out.println(dateFormat.format(cal1.getTime()));
		dateFormat = new SimpleDateFormat("YYYY-MM-dd hh:mm aa");
		System.out.println(dateFormat.format(cal1.getTime()));
		
	}

}
