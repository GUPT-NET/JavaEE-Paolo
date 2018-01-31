/*

COPYRIGHT (C) 2014 BY GUPT SOFTWARE. ALL RIGHTS RESERVED.

+AMENDMENT HISTORY AS BELOW++++++++
VERSION: 1.0
AUTHOR: Lin Mingyue
DATE: 2014年3月4日
DESCRIPTION: 单例模式
 */

package net.gupt.cs.jee.task;

/**
 * @author Lin Mingyue
 * @version 1.0
 * @date 2014年3月4日
 * @DESCRIPTION: 单例模式
 */
public class TestOneD0tFour {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Singleton s1 = Singleton.getSingleton();
		System.out.println(s1);
		Singleton s2 = Singleton.getSingleton();
		System.out.println(s2);
	}

	class Singleton {
		private static volatile Singleton singleton = null;

		private Singleton() {
			System.out.println("init");
		}

		public static Singleton getSingleton() {
			if (singleton == null) {
				synchronized (Singleton.class) {
					if (singleton == null) {
						singleton = new Singleton();
					}
				}
			}
			return singleton;
		}
	}

}
