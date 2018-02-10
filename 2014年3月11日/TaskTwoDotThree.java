/*

COPYRIGHT (C) 2014 BY GUPT SOFTWARE. ALL RIGHTS RESERVED.

+AMENDMENT HISTORY AS BELOW++++++++
VERSION: 1.0
AUTHOR: PAN JingHong
DATE: 2014年3月11日
DESCRIPTION: 

*/

package net.gupt.cs.jee.task;

import java.util.Iterator;
import java.util.TreeSet;
import java.util.TreeMap;

/**
 * @author PAN JingHong
 *
 * @version 
 * @date 2014年3月11日 下午11:28:48
 */
public class TaskTwoDotThree {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Student zhanshan = new Student(1001,"啊三");
		Student lishi = new Student(1002,"李四");
		Student linlin3= new Student(1003,"小三");
		Student linlin4 = new Student(1004,"啊四");
		Student linlin5 = new Student(1005,"啊五 ");
		TreeMap<Long, String> students = new TreeMap<Long, String>();
		students.put(zhanshan.getClassmark(), zhanshan.getName());
		students.put(lishi.getClassmark(), lishi.getName());
		students.put(linlin3.getClassmark(), linlin3.getName());
		students.put(linlin4.getClassmark(), linlin4.getName());
		students.put(linlin5.getClassmark(), linlin5.getName());
		Iterator iter = students.entrySet().iterator(); 
		 while (iter.hasNext()) { 
		    Object key = iter.next(); 
		    System.out.println(key);
		} 
		 TreeSet<Student> studenths = new TreeSet<Student>();
		 studenths.add(zhanshan);
		 studenths.add(lishi);
		 studenths.add(linlin3);
		 studenths.add(linlin4);
		 studenths.add(linlin5);
		 iter = studenths.iterator();
		 while (iter.hasNext()) { 
			    Object key = iter.next(); 
			    System.out.println(key);
			} 

	}

}
