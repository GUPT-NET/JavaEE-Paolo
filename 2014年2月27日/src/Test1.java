/*

COPYRIGHT (C) 2014 BY GUPT SOFTWARE. ALL RIGHTS RESERVED.

VERSION: 1.0
AUTHOR: �˾���
DATE: 2014��2��27��08:38:33 
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
			System.out.println("���");
		}
		else
		{
			System.out.println("�����");
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
