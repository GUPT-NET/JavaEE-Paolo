/*

COPYRIGHT (C) 2014 BY GUPT SOFTWARE. ALL RIGHTS RESERVED.

+AMENDMENT HISTORY AS BELOW++++++++
VERSION: 1.0
AUTHOR: Lin Mingyue
DATE: 2014��3��4��
DESCRIPTION: ��java.util.Calendar�ഴ�����ڣ�ʹ�����2000��2��29������8��25�֣��������ӡ������
Ҫ���ʽΪ��2000-02-29 08:25 AM��������Apache Commons��ĿLang���е�DateUtils�࣬
����������޸�Ϊ2013��5��3������8��25�֣��������ӡ������Ҫ���ʽΪ��2000/05/03 20:25�� 
*/

package net.gupt.cs.jee.task;

import java.util.Calendar;
import java.util.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import org.apache.commons.lang3.time.DateUtils;


/**
 * @author Lin Mingyue
 *
 * @version 1.0
 * @date 2014��3��4��
 * @DESCRIPTION: ��java.util.Calendar�ഴ�����ڣ�ʹ�����2000��2��29������8��25�֣��������ӡ������
 * Ҫ���ʽΪ��2000-02-29 08:25 AM��������Apache Commons��ĿLang���е�DateUtils�࣬
 * ����������޸�Ϊ2013��5��3������8��25�֣��������ӡ������Ҫ���ʽΪ��2000/05/03 20:25�� 
 */
public class TestOneDotThree {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// �½�����ʵ��cal1����õ�ǰʱ��
		Calendar cal = Calendar.getInstance();
		// �޸�ʱ��
		cal.set(2000, 01, 29, 8, 25);
		// �½���ʾ��ʽdformat
		DateFormat dformat = new SimpleDateFormat("YYYY-MM-dd hh:mm a");
		// ��ӡcal1ʱ��
		System.out.println(dformat.format(cal.getTime()));
		Date date = new Date();
		// ʹ��DateUtils�޸�date��ֵ
		try {
			date = DateUtils.parseDateStrictly("2013-05-03-20-25","yyyy-MM-dd-HH-mm");
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// ��date��ֵ����cal1
		cal = DateUtils.toCalendar(date);
		dformat = new SimpleDateFormat("YYYY/MM/dd HH:mm");
		System.out.println(dformat.format(cal.getTime()));
		}

}
