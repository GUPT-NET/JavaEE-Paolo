/*

COPYRIGHT (C) 2014 BY GUPT SOFTWARE. ALL RIGHTS RESERVED.

+AMENDMENT HISTORY AS BELOW++++++++
VERSION: 1.0
AUTHOR: PAN JingHong
DATE: 2014年3月3日
DESCRIPTION: 用JUnit做单元测试，以测试String类的indexOf()、
StringUtils类的isEmpty(CharSequence)和
equals(CharSequence, CharSequence)，
创建测试用例类（Test Case），并运行之
 */

package net.gupt.cs.jee.task;

import junit.framework.TestCase;

/**
 * @author PAN JingHong
 * 
 * @version 1.0
 * @date 2014年3月3日 下午4:30:50
 */
public class TaskOneDotFifthIndexOf extends TestCase {

	// indexOf(char c);如果找到，返回index；
	public void testIndexOf1() {
		String Str1 = "abcabcabc";
		int i = Str1.indexOf('b');
		assertSame(1, i);
	}
	
	// indexOf(char c);如果找不到，返回-1；
	public void testIndexOf2() {
		String Str1 = "abcabcabc";
		int i = Str1.indexOf('d');
		assertSame(-1, i);
	}

	// indexOf(char c,int fromIndex)如果找到，返回index；
	public void testIndexOf3() {
		String Str1 = "abcabcabc";
		int i = Str1.indexOf('b', 2);
		assertSame(4, i);
	}
	
	// indexOf(char c,int fromIndex)如果找不到，返回-1；
		public void testIndexOf4() {
			String Str1 = "abcabcabc";
			int i = Str1.indexOf('b', 2);
			assertSame(4, i);
		}

	// indexOf(char c,int fromIndex); 如果fromINdex小于0；则从0下标开始查找
	public void testIndexOf5() {
		String Str1 = "abcabcabc";
		int i = Str1.indexOf('b', -2);
		assertSame(1, i);
	}
	
	// indexOf(char c,int fromIndex)如果fromIndex大于length，则返回-1；
	public void testIndexOf6() {
		String Str1 = "abcabcabc";
		int i = Str1.indexOf('b', 11);
		assertSame(-1, i);
	}
	
	// indexOf(String str1);如果找到，则返回index
	public void testIndexOf7() {
		String Str1 = "abcabcabc";
		int i = Str1.indexOf("bc");
		assertSame(1, i);
	}

	// indexOf(String str1);如果没找到，则返回-1
	public void testIndexOf8() {
		String Str1 = "abcabcabc";
		int i = Str1.indexOf("bcd");
		assertSame(-1, i);
	}
	
	// indexOf(String str1，int fromIndex);如果找到，则返回index
		public void testIndexOf9() {
			String Str1 = "abcabcabc";
			int i = Str1.indexOf("bc",2);
			assertSame(4, i);
		}
	
		// indexOf(String str1，int fromIndex);如果没找到，则返回-1
		public void testIndexOf10() {
			String Str1 = "abcabcabc";
			int i = Str1.indexOf("bcd",2);
			assertSame(-1, i);
		}
		
		// indexOf(String str1，int fromIndex); 如果fromINdex小于0；则从0下标开始查找
		public void testIndexOf11() {
			String Str1 = "abcabcabc";
			int i = Str1.indexOf("bc", -2);
			assertSame(1, i);
		}
		
		// indexOf(String str1,int fromIndex)如果fromIndex大于length，则返回-1；
		public void testIndexOf12() {
			String Str1 = "abcabcabc";
			int i = Str1.indexOf("bc", 11);
			assertSame(-1, i);
		}
}
