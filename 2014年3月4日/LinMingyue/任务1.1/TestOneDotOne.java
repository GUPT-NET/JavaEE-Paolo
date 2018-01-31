/*

COPYRIGHT (C) 2014 BY GUPT SOFTWARE. ALL RIGHTS RESERVED.

+AMENDMENT HISTORY AS BELOW++++++++
VERSION: 1.0
AUTHOR: Lin Mingyue
DATE: 2014��3��4��
DESCRIPTION: ��java.lang.String�еķ������Ƚ����ַ�����MILAN���͡�milan"�Ƿ���ȣ����Դ�Сд����
��ѡ��StringBuffer��StringBuilder���������ַ����ϲ����ٰѺϲ�����ַ�����ȫ�����Сд���ٰѡ�lan��ȫ�滻�ɡ�ckey��
*/

package net.gupt.cs.jee.task;

import java.lang.String;
import java.lang.StringBuilder;

/**
 * @author Lin Mingyue
 * 
 * @version 1.0
 * @date 2014��3��4��
 * DESCRIPTION: ��java.lang.String�еķ������Ƚ����ַ�����MILAN���͡�milan"�Ƿ���ȣ����Դ�Сд����
 * ��ѡ��StringBuffer��StringBuilder���������ַ����ϲ����ٰѺϲ�����ַ�����ȫ�����Сд���ٰѡ�lan��ȫ�滻�ɡ�ckey��
 */
public class TestOneDotOne {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String st1 = "MILAN";
		if (st1.equalsIgnoreCase("milan")) {
			System.out.println("���");
		} else {
			System.out.println("�����");
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
