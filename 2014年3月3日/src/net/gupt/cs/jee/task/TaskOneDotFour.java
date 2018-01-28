/*

COPYRIGHT (C) 2014 BY GUPT SOFTWARE. ALL RIGHTS RESERVED.

+AMENDMENT HISTORY AS BELOW++++++++
VERSION: 1.4
AUTHOR: PAN JingHong
DATE: 2014��3��2��
DESCRIPTION: ����ģʽ��Ŀǰ����������ģʽ���Ľ�������ģʽ������ģʽ��˫��У������˫��У�����ϰ�ȫ��Ч��

 */

package net.gupt.cs.jee.task;

/**
 * @author PAN JingHong
 * 
 * @version 1.4
 * @date 2014��3��2�� ����8:43:51
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
		System.out.println("�����s1��ַ" + s1 + "�����s2��ַ" + s2);
	}

}

/* TaskOneDotFour(3) */
/* �Ľ�������ģʽ����Ȼ�ǰ�ȫ�ģ�����Ч�ʷǳ�����һ��ʱ��ֻ��һ���߳��ܷ��� ͬʱ����һ������ */
class Singleton {
	private static Singleton instance;
	int i = 0;

	private Singleton() {
		System.out.println("��һ�δ�������");
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
/* ������ʽ�ĵ���ģʽ �����ж���̷߳���ʱ�Ͳ��ǰ�ȫ�� ���صĲ���ͬһ������ */
// class Singleton {
// private static Singleton instance;
// int i = 0;
//
// private Singleton() {
// System.out.println("��һ�δ�������");
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
/* ����ģʽ��������ص�ʱ���ȴ����˵�����getSingleton����ֻ�Ƿ��ؼ���ʱ�����Ķ�����ΪԤ�ȼ��أ����������ٶ��� */
// class Singleton {
// private static Singleton instance = null;
// static {
// instance = new Singleton();
// }
// int i =0;
// private Singleton (){
// System.out.println("��һ�δ���");
// i = 100;
// }
// public static Singleton getSingleton() {
// return instance;
// }
// }

/* TaskOneDotFour */
/* ˫��У��������֤Ϊ��һ�δ���ʱ��ʹ��synchronized��Singleton.class������֤ͬ�����ٴ������󣬰�ȫ��Ч -_- */
// class Singleton {
// private static volatile Singleton singleton = null;
// int i = 0;
// private Singleton(){
// System.out.println("��һ�δ���");
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
