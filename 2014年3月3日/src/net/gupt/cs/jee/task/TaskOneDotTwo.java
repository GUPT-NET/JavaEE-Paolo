/*

COPYRIGHT (C) 2014 BY GUPT SOFTWARE. ALL RIGHTS RESERVED.

+AMENDMENT HISTORY AS BELOW++++++++
VERSION: 1.1
AUTHOR: PAN JingHong
DATE: 2014年3月2日
DESCRIPTION: 用Apache commons项目中的StringUtils工具类中的适当方法，找出字符串“FORZAMILAN”中有几个“A”

*/

package net.gupt.cs.jee.task;

import org.apache.commons.lang3.StringUtils;
/**
 * @author PAN JingHong
 *
 * @version 1.1
 * @date 2014年3月2日 下午4:01:23
 */
public class TaskOneDotTwo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(StringUtils.countMatches("FORZAMILAN", "A"));
	}

}
