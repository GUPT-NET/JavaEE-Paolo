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
		// �½���ʾ��ʽģ��dateFormat
		DateFormat dateFormat = new SimpleDateFormat("YYYY-MM-dd hh:mm a");
		// �½�����ʵ��cal1����õ�ǰʱ��
		Calendar cal1 = Calendar.getInstance();
		// �޸�ʱ��
		cal1.set(2000, 01, 29, 8, 25);
		// ����dateFormat��ʽ��ӡcal1ʱ��
		System.out.println(dateFormat.format(cal1.getTime()));
		Date date = new Date();
		// ʹ��DateUtils�޸�date��ֵ
		try {
			date = DateUtils.parseDateStrictly("2013��5��3������8��25��",
					new String[] { "YYYY��MM��dd��aahh��mm��", "MM-dd-yyyy" });
		} catch (ParseException e) {
			// TODO �Զ����� catch ��
			e.printStackTrace();
		}
		// ��date��ֵ����cal1
		cal1 = DateUtils.toCalendar(date);
		dateFormat = new SimpleDateFormat("YYYY/MM/dd HH:mm");
		System.out.println(dateFormat.format(cal1.getTime()));

	}

}
