/*

COPYRIGHT (C) 2014 BY GUPT SOFTWARE. ALL RIGHTS RESERVED.

+AMENDMENT HISTORY AS BELOW++++++++
VERSION: 1.0
AUTHOR: PAN JingHong
DATE: 2014-3-10
DESCRIPTION: 

 */

package net.gupt.cs.jee.task;

import java.util.Collections;
import java.util.ArrayList;

/**
 * @author PAN JingHong
 * 
 * @version 1.0
 * @date 2014-3-10 ����8:16:39
 * @DESCRIPTION:��һ�����ϣ������е�Ԫ����һ��String����󡣸���ҵ���߼��� 
 *                                               ֻ����ü����е�Ԫ�أ�������ɾ��Ϊʹ���ʼ��ϵ�Ч�ʸ��ߣ���ѡ��ArrayList��LinkedList��
 *                                               ��
 *                                               ��ʵ��������ϡ���ʹ�ù�����Collections�еķ�����
 *                                               �������е�Stirng�����Ԫ�ذ��������С�
 */
public class TaskTwoDotOne {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ArrayList alist = new ArrayList();
		alist.add("a1");
		alist.add("a2");
		alist.add("a3");
		alist.add("a4");
		Collections.sort(alist);
		System.out.println(alist);
		Collections.reverse(alist);
		System.out.println(alist);

	}

}
