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
 * @date 2014-3-10 上午8:16:39
 * @DESCRIPTION:有一个集合，集合中的元素是一组String类对象。根据业务逻辑， 
 *                                               只需读该集合中的元素，不需增删。为使访问集合的效率更高，请选用ArrayList或LinkedList类
 *                                               ，
 *                                               来实现这个集合。并使用工具类Collections中的方法，
 *                                               将集合中的Stirng类对象元素按倒序排列。
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
