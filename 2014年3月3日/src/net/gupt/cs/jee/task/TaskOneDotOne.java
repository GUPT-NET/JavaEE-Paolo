/*

COPYRIGHT (C) 2014 BY GUPT SOFTWARE. ALL RIGHTS RESERVED.

+AMENDMENT HISTORY AS BELOW++++++++
VERSION: 1.1
AUTHOR: PAN JingHong
DATE: 2014年3月2日
DESCRIPTION: 用java.lang.String中的方法，比较两字符串“MILAN”和
“milan"是否相等（忽略大小写）。再选用StringBuffer或StringBuilder，
将两个字符串合并。再把合并后的字符串中全部变成小写。再把“lan”全替换成“ckey”
 */

package net.gupt.cs.jee.task;

import java.lang.String;
import java.lang.StringBuilder;

/**
 * @author PAN JingHong
 * 
 * @version
 * @date 2014年3月2日 下午3:06:44
 */
public class TaskOneDotOne {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "MILAN";
		String str2 = "milan";
		// String。equalsIgnoreCase忽略大小写判断
		if (str1.equalsIgnoreCase(str2)) {
			System.out.println("相等");
		} else {
			System.out.println("不相等");
		}
		// 使用StringBuilder.append方法合并字符串
		StringBuilder strbder = new StringBuilder(str1);
		strbder.append(str2);
		System.out.println(strbder);
		// 使用String。tolowerCase方法大小写转换
		str1 = strbder.toString();
		str1 = str1.toLowerCase();
		System.out.println(str1);
		// String。replace方法替换子串
		str1 = str1.replace("lan", "ckey");
		System.out.println(str1);
	}

}
