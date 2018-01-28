/*

COPYRIGHT (C) 2014 BY GUPT SOFTWARE. ALL RIGHTS RESERVED.

+AMENDMENT HISTORY AS BELOW++++++++
VERSION: 1.1
AUTHOR: PAN JingHong
DATE: 2014��3��2��
DESCRIPTION: ��java.util.Calendar�ഴ�����ڣ�ʹ�����2000��2��29������8��25�֣��������ӡ������
Ҫ���ʽΪ��2000-02-29 08:25 AM��������Apache Commons��ĿLang���е�DateUtils�࣬
����������޸�Ϊ2013��5��3������8��25�֣��������ӡ������Ҫ���ʽΪ��2000/05/03 20:25�� 
*/

package net.gupt.cs.jee.task;


import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.apache.commons.lang3.time.DateUtils;


/**
 * @author PAN JingHong
 *
 * @version 
 * @date 2014��3��2�� ����4:37:20
 */
public class TaskOneDotThree {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// �½���ʾ��ʽģ��dateFormat
		DateFormat dateFormat = new SimpleDateFormat("YYYY-MM-dd hh:mm a");
		// �½�����ʵ��cal1����õ�ǰʱ��
		Calendar cal = Calendar.getInstance();
		// �޸�ʱ��
		cal.set(2000, 01, 29, 8, 25);
		// ����dateFormat��ʽ��ӡcal1ʱ��
		System.out.println(dateFormat.format(cal.getTime()));
		Date date = new Date();
		// ʹ��DateUtils�޸�date��ֵ
		try {
			date = DateUtils.parseDateStrictly("201305032025","yyyyMMddHHmm");
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// ��date��ֵ����cal1
		cal = DateUtils.toCalendar(date);
		dateFormat = new SimpleDateFormat("YYYY/MM/dd HH:mm");
		System.out.println(dateFormat.format(cal.getTime()));
		}

}
