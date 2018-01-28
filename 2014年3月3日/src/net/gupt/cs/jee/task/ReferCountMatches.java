/*

COPYRIGHT (C) 2014 BY GUPT SOFTWARE. ALL RIGHTS RESERVED.

+AMENDMENT HISTORY AS BELOW++++++++
VERSION: 1.0
AUTHOR: PAN JingHong
DATE: 2014��3��2��
DESCRIPTION: ��java.lang.String�еķ���,�ҳ��ַ�����FORZAMILAN�����м�����A����P s: �ο�CountMatches
 */

package net.gupt.cs.jee.task;

/**
 * @author PAN JingHong
 * 
 * @version 1.0
 * @date 2014��3��2�� ����4:14:29
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
		//����isEmpty�����ж��Ƿ�Ϊ��
		if (isEmpty(str) || isEmpty(sub)) {
			return 0;
		}
		int count = 0;
		int idx = 0;
		//�������String.indexOf�ҵ��Ӵ������count+1�������������Ӵ������������Ѳ鵽����
		while ((idx = str.indexOf(sub, idx)) != INDEX_NOT_FOUND) {
			count++;
			idx += sub.length();
		}
		return count;
	}

	//�����������Ϊ-1��ʾδ�ҵ�
	public static final int INDEX_NOT_FOUND = -1;

	//�пշ���
	public static boolean isEmpty(String str) {
		return str == null || str.length() == 0;
	}
}
