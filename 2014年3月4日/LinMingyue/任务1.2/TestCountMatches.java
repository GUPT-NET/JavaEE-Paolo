/*

COPYRIGHT (C) 2014 BY GUPT SOFTWARE. ALL RIGHTS RESERVED.

+AMENDMENT HISTORY AS BELOW++++++++
VERSION: 1.0
AUTHOR: Lin Mingyue
DATE: 2014��3��4��
DESCRIPTION: ��java.lang.String�еķ���,�ҳ��ַ�����FORZAMILAN�����м�����A��
 */

package net.gupt.cs.jee.task;

/**
 * @author Lin Mingyue
 * @version 1.0
 * @date 2014��3��4��
 * @DESCRIPTION: ��java.lang.String�еķ���,�ҳ��ַ�����FORZAMILAN�����м�����A��
 */
public class TestCountMatches {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(countMatches("FORZAMILANSSA", "A"));
	}

	public static int countMatches(String str, String sub) {
		if (isEmpty(str) || isEmpty(sub)) {
			return 0;
		}
		int count = 0;
		int idx = 0;
		while ((idx = str.indexOf(sub, idx)) != INDEX_NOT_FOUND) {
			count++;
			idx += sub.length();
		}
		return count;
	}

	public static final int INDEX_NOT_FOUND = -1;

	public static boolean isEmpty(String str) {
		return str == null || str.length() == 0;
	}
}
