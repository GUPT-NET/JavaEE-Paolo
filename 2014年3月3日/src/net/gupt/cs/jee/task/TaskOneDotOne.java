/*

COPYRIGHT (C) 2014 BY GUPT SOFTWARE. ALL RIGHTS RESERVED.

+AMENDMENT HISTORY AS BELOW++++++++
VERSION: 1.1
AUTHOR: PAN JingHong
DATE: 2014��3��2��
DESCRIPTION: ��java.lang.String�еķ������Ƚ����ַ�����MILAN����
��milan"�Ƿ���ȣ����Դ�Сд������ѡ��StringBuffer��StringBuilder��
�������ַ����ϲ����ٰѺϲ�����ַ�����ȫ�����Сд���ٰѡ�lan��ȫ�滻�ɡ�ckey��
 */

package net.gupt.cs.jee.task;

import java.lang.String;
import java.lang.StringBuilder;

/**
 * @author PAN JingHong
 * 
 * @version
 * @date 2014��3��2�� ����3:06:44
 */
public class TaskOneDotOne {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "MILAN";
		String str2 = "milan";
		// String��equalsIgnoreCase���Դ�Сд�ж�
		if (str1.equalsIgnoreCase(str2)) {
			System.out.println("���");
		} else {
			System.out.println("�����");
		}
		// ʹ��StringBuilder.append�����ϲ��ַ���
		StringBuilder strbder = new StringBuilder(str1);
		strbder.append(str2);
		System.out.println(strbder);
		// ʹ��String��tolowerCase������Сдת��
		str1 = strbder.toString();
		str1 = str1.toLowerCase();
		System.out.println(str1);
		// String��replace�����滻�Ӵ�
		str1 = str1.replace("lan", "ckey");
		System.out.println(str1);
	}

}
