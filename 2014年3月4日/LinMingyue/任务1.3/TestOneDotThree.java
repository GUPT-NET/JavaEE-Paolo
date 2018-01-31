/*

COPYRIGHT (C) 2014 BY GUPT SOFTWARE. ALL RIGHTS RESERVED.

+AMENDMENT HISTORY AS BELOW++++++++
VERSION: 1.0
AUTHOR: Lin Mingyue
DATE: 2014年3月4日
DESCRIPTION: 用java.util.Calendar类创建日期，使其等于2000年2月29日上午8点25分，并将其打印出来，
要求格式为“2000-02-29 08:25 AM”。再用Apache Commons项目Lang包中的DateUtils类，
将这个日期修改为2013年5月3日下午8点25分，并将其打印出来，要求格式为“2000/05/03 20:25” 
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
 * @date 2014年3月4日
 * @DESCRIPTION: 用java.util.Calendar类创建日期，使其等于2000年2月29日上午8点25分，并将其打印出来，
 * 要求格式为“2000-02-29 08:25 AM”。再用Apache Commons项目Lang包中的DateUtils类，
 * 将这个日期修改为2013年5月3日下午8点25分，并将其打印出来，要求格式为“2000/05/03 20:25” 
 */
public class TestOneDotThree {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// 新建日期实体cal1并获得当前时间
		Calendar cal = Calendar.getInstance();
		// 修改时间
		cal.set(2000, 01, 29, 8, 25);
		// 新建显示格式dformat
		DateFormat dformat = new SimpleDateFormat("YYYY-MM-dd hh:mm a");
		// 打印cal1时间
		System.out.println(dformat.format(cal.getTime()));
		Date date = new Date();
		// 使用DateUtils修改date的值
		try {
			date = DateUtils.parseDateStrictly("2013-05-03-20-25","yyyy-MM-dd-HH-mm");
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// 将date的值赋给cal1
		cal = DateUtils.toCalendar(date);
		dformat = new SimpleDateFormat("YYYY/MM/dd HH:mm");
		System.out.println(dformat.format(cal.getTime()));
		}

}
