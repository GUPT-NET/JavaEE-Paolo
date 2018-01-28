/*

COPYRIGHT (C) 2014 BY GUPT SOFTWARE. ALL RIGHTS RESERVED.

VERSION: 1.0
AUTHOR: 潘静宏
DATE: 2014年2月27日08:38:33 
DESCRIPTION: xxxxxxxxxxxxxxxxx

*/

import java.lang.String;
import java.lang.StringBuilder;
public class Test1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "MILAN";
		String str2 = "milan";
		if(str1.equalsIgnoreCase(str2))
		{
			System.out.println("相等");
		}
		else
		{
			System.out.println("不相等");
		}
		StringBuilder sbd1= new StringBuilder(str1);
		sbd1.append(str2);
		System.out.println(sbd1);
		str1 = sbd1.toString();
		str1=str1.toLowerCase();
		System.out.println(str1);
		str1=str1.replace("lan", "ckey");
		System.out.println(str1);
	}

}
