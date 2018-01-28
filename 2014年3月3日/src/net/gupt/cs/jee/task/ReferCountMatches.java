/*

COPYRIGHT (C) 2014 BY GUPT SOFTWARE. ALL RIGHTS RESERVED.

+AMENDMENT HISTORY AS BELOW++++++++
VERSION: 1.0
AUTHOR: PAN JingHong
DATE: 2014年3月2日
DESCRIPTION: 用java.lang.String中的方法,找出字符串“FORZAMILAN”中有几个“A”。P s: 参考CountMatches
 */

package net.gupt.cs.jee.task;

/**
 * @author PAN JingHong
 * 
 * @version 1.0
 * @date 2014年3月2日 下午4:14:29
 */
public class ReferCountMatches {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(countMatches("FORZAMILANSSA", "A"));
	}

	public static int countMatches(String str, String sub) {
		//调用isEmpty方法判断是否为空
		if (isEmpty(str) || isEmpty(sub)) {
			return 0;
		}
		int count = 0;
		int idx = 0;
		//如果调用String.indexOf找到子串则计数count+1；查找索引加子串长度以跳过已查到索引
		while ((idx = str.indexOf(sub, idx)) != INDEX_NOT_FOUND) {
			count++;
			idx += sub.length();
		}
		return count;
	}

	//如果返回索引为-1表示未找到
	public static final int INDEX_NOT_FOUND = -1;

	//判空方法
	public static boolean isEmpty(String str) {
		return str == null || str.length() == 0;
	}
}
