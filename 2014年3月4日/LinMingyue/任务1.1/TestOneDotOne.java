/*

COPYRIGHT (C) 2014 BY GUPT SOFTWARE. ALL RIGHTS RESERVED.

+AMENDMENT HISTORY AS BELOW++++++++
VERSION: 1.0
AUTHOR: Lin Mingyue
DATE: 2014年3月4日
DESCRIPTION: 用java.lang.String中的方法，比较两字符串“MILAN”和“milan"是否相等（忽略大小写）。
再选用StringBuffer或StringBuilder，将两个字符串合并。再把合并后的字符串中全部变成小写。再把“lan”全替换成“ckey”
*/

package net.gupt.cs.jee.task;

import java.lang.String;
import java.lang.StringBuilder;

/**
 * @author Lin Mingyue
 * 
 * @version 1.0
 * @date 2014年3月4日
 * DESCRIPTION: 用java.lang.String中的方法，比较两字符串“MILAN”和“milan"是否相等（忽略大小写）。
 * 再选用StringBuffer或StringBuilder，将两个字符串合并。再把合并后的字符串中全部变成小写。再把“lan”全替换成“ckey”
 */
public class TestOneDotOne {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String st1 = "MILAN";
		if (st1.equalsIgnoreCase("milan")) {
			System.out.println("相等");
		} else {
			System.out.println("不相等");
		}
		StringBuilder strbder = new StringBuilder(st1);
		strbder.append("milan");
		System.out.println(strbder);
		st1 = strbder.toString();
		st1 = st1.toLowerCase();
		System.out.println(st1);
		st1 = st1.replace("lan", "ckey");
		System.out.println(st1);
	}

}
