import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.apache.commons.lang3.time.DateUtils;

public class test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 新建显示格式模板dateFormat
		DateFormat dateFormat = new SimpleDateFormat("YYYY-MM-dd hh:mm a");
		// 新建日期实体cal1并获得当前时间
		Calendar cal1 = Calendar.getInstance();
		// 修改时间
		cal1.set(2000, 01, 29, 8, 25);
		// 按照dateFormat格式打印cal1时间
		System.out.println(dateFormat.format(cal1.getTime()));
		Date date = new Date();
		// 使用DateUtils修改date的值
		try {
			date = DateUtils.parseDateStrictly("2013年5月3日下午8点25分",
					new String[] { "YYYY年MM月dd日aahh点mm分", "MM-dd-yyyy" });
		} catch (ParseException e) {
			// TODO 自动生成 catch 块
			e.printStackTrace();
		}
		// 将date的值赋给cal1
		cal1 = DateUtils.toCalendar(date);
		dateFormat = new SimpleDateFormat("YYYY/MM/dd HH:mm");
		System.out.println(dateFormat.format(cal1.getTime()));

	}

}
