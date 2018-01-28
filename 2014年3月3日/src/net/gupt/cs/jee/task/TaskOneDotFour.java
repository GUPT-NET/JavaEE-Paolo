/*

COPYRIGHT (C) 2014 BY GUPT SOFTWARE. ALL RIGHTS RESERVED.

+AMENDMENT HISTORY AS BELOW++++++++
VERSION: 1.4
AUTHOR: PAN JingHong
DATE: 2014年3月2日
DESCRIPTION: 单例模式，目前理解的有懒汉模式，改进的懒汉模式，饿汉模式，双重校验锁，双重校验锁较安全高效。

 */

package net.gupt.cs.jee.task;

/**
 * @author PAN JingHong
 * 
 * @version 1.4
 * @date 2014年3月2日 下午8:43:51
 */
public class TaskOneDotFour {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Singleton s1 = Singleton.getSingleton();
		System.out.println(s1.i);
		Singleton s2 = Singleton.getSingleton();
		System.out.println(s2.i);
		System.out.println("输出是s1地址" + s1 + "输出是s2地址" + s2);
	}

}

/* TaskOneDotFour(3) */
/* 改进的懒汉模式，虽然是安全的，但是效率非常低在一个时候只有一个线程能访问 同时返回一个对象 */
class Singleton {
	private static Singleton instance;
	int i = 0;

	private Singleton() {
		System.out.println("第一次创建对象");
		i = 100;
	}

	public static synchronized Singleton getSingleton() {
		if (instance == null) {
			instance = new Singleton();
		}
		return instance;
	}
}

/* TaskOneDotFour(2) */
/* 懒汉方式的单例模式 但是有多个线程访问时就不是安全的 返回的不是同一个对象 */
// class Singleton {
// private static Singleton instance;
// int i = 0;
//
// private Singleton() {
// System.out.println("第一次创建对象");
// i = 100;
// }
//
// public static Singleton getSingleton() {
// if (instance == null) {
// instance = new Singleton();
// }
// return instance;
// }
// }

/* TaskOneDotFour(1) */
/* 饿汉模式，程序加载的时候先创建了单例，getSingleton方法只是返回加载时创建的对象，因为预先加载，所以启动速度慢 */
// class Singleton {
// private static Singleton instance = null;
// static {
// instance = new Singleton();
// }
// int i =0;
// private Singleton (){
// System.out.println("第一次创建");
// i = 100;
// }
// public static Singleton getSingleton() {
// return instance;
// }
// }

/* TaskOneDotFour */
/* 双重校验锁，验证为第一次创建时，使用synchronized将Singleton.class加锁保证同步，再创建对象，安全高效 -_- */
// class Singleton {
// private static volatile Singleton singleton = null;
// int i = 0;
// private Singleton(){
// System.out.println("第一次创建");
// i = 100;
// }
// public static Singleton getSingleton() {
// if (singleton == null) {
// synchronized (Singleton.class) {
// if (singleton == null) {
// singleton = new Singleton();
// }
// }
// }
// return singleton;
// }
// }
