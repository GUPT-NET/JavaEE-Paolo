/*

COPYRIGHT (C) 2014 BY GUPT SOFTWARE. ALL RIGHTS RESERVED.

+AMENDMENT HISTORY AS BELOW++++++++
VERSION: 1.1
AUTHOR: Lin Mingyue
DATE: 2014��3��4��
DESCRIPTION: ��Apache commons��Ŀ�е�StringUtils�������е��ʵ��������ҳ��ַ�����FORZAMILAN�����м�����A��

*/

package net.gupt.cs.jee.task;

import org.apache.commons.lang3.StringUtils;
/**
 * @author Lin Mingyue
 *
 * @version 1.1
 * @date 2014��3��4�� ����4:01:23
 * @DESCRIPTION: ��Apache commons��Ŀ�е�StringUtils�������е��ʵ��������ҳ��ַ�����FORZAMILAN�����м�����A��
 */
public class TestOneDotTwo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(StringUtils.countMatches("FORZAMILAN", "A"));
	}

}
