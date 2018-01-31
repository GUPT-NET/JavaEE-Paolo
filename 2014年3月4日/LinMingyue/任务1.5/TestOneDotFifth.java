/*

COPYRIGHT (C) 2014 BY GUPT SOFTWARE. ALL RIGHTS RESERVED.

+AMENDMENT HISTORY AS BELOW++++++++
VERSION: 1.0
AUTHOR: Lin Mingyue
DATE: 2014年3月4日
DESCRIPTION: 

*/

package net.gupt.cs.jee.test;

import org.apache.commons.lang3.StringUtils;
import junit.framework.TestCase;

/**
 * @author Lin Mingyue
 *
 * @version 1.0
 * @date 2014年3月4日 下午1:33:45
 * @DESCRIPTION: 测试IndexOf() 类，IsEmpty()类，equals()类。
 */
public class TestOneDotFifth extends TestCase {
	
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
    
	//当传入值为null时，返回值为True；
    public void testIsEmpty() {
	String singer = null;
	boolean result = StringUtils.isEmpty(singer);
	assertTrue("True",result);
    }

  //当传入值为("abc","abc")串时，返回值为True；
    public void testequals() {
	String singer = "abc";
	String singer1 = "abc";
	boolean result = StringUtils.equals(singer, singer1);
	assertTrue("True",result);
    }
}
