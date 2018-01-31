/*

COPYRIGHT (C) 2014 BY GUPT SOFTWARE. ALL RIGHTS RESERVED.

+AMENDMENT HISTORY AS BELOW++++++++
VERSION: 1.0
AUTHOR: Lin Mingyue
DATE: 2014��3��4��
DESCRIPTION: 

*/

package net.gupt.cs.jee.test;

import org.apache.commons.lang3.StringUtils;
import junit.framework.TestCase;

/**
 * @author Lin Mingyue
 *
 * @version 1.0
 * @date 2014��3��4�� ����1:33:45
 * @DESCRIPTION: ����IndexOf() �࣬IsEmpty()�࣬equals()�ࡣ
 */
public class TestOneDotFifth extends TestCase {
	
	// indexOf(char c);����ҵ�������index��
	public void testIndexOf1() {
		String Str1 = "abcabcabc";
		int i = Str1.indexOf('b');
		assertSame(1, i);
	}
	
	// indexOf(char c);����Ҳ���������-1��
	public void testIndexOf2() {
		String Str1 = "abcabcabc";
		int i = Str1.indexOf('d');
		assertSame(-1, i);
	}

	// indexOf(char c,int fromIndex)����ҵ�������index��
	public void testIndexOf3() {
		String Str1 = "abcabcabc";
		int i = Str1.indexOf('b', 2);
		assertSame(4, i);
	}
	
	// indexOf(char c,int fromIndex)����Ҳ���������-1��
		public void testIndexOf4() {
			String Str1 = "abcabcabc";
			int i = Str1.indexOf('b', 2);
			assertSame(4, i);
		}

	// indexOf(char c,int fromIndex); ���fromINdexС��0�����0�±꿪ʼ����
	public void testIndexOf5() {
		String Str1 = "abcabcabc";
		int i = Str1.indexOf('b', -2);
		assertSame(1, i);
	}
	
	// indexOf(char c,int fromIndex)���fromIndex����length���򷵻�-1��
	public void testIndexOf6() {
		String Str1 = "abcabcabc";
		int i = Str1.indexOf('b', 11);
		assertSame(-1, i);
	}
	
	// indexOf(String str1);����ҵ����򷵻�index
	public void testIndexOf7() {
		String Str1 = "abcabcabc";
		int i = Str1.indexOf("bc");
		assertSame(1, i);
	}

	// indexOf(String str1);���û�ҵ����򷵻�-1
	public void testIndexOf8() {
		String Str1 = "abcabcabc";
		int i = Str1.indexOf("bcd");
		assertSame(-1, i);
	}
	
	// indexOf(String str1��int fromIndex);����ҵ����򷵻�index
		public void testIndexOf9() {
			String Str1 = "abcabcabc";
			int i = Str1.indexOf("bc",2);
			assertSame(4, i);
		}
	
		// indexOf(String str1��int fromIndex);���û�ҵ����򷵻�-1
		public void testIndexOf10() {
			String Str1 = "abcabcabc";
			int i = Str1.indexOf("bcd",2);
			assertSame(-1, i);
		}
		
		// indexOf(String str1��int fromIndex); ���fromINdexС��0�����0�±꿪ʼ����
		public void testIndexOf11() {
			String Str1 = "abcabcabc";
			int i = Str1.indexOf("bc", -2);
			assertSame(1, i);
		}
		
		// indexOf(String str1,int fromIndex)���fromIndex����length���򷵻�-1��
		public void testIndexOf12() {
			String Str1 = "abcabcabc";
			int i = Str1.indexOf("bc", 11);
			assertSame(-1, i);
		}
    
	//������ֵΪnullʱ������ֵΪTrue��
    public void testIsEmpty() {
	String singer = null;
	boolean result = StringUtils.isEmpty(singer);
	assertTrue("True",result);
    }

  //������ֵΪ("abc","abc")��ʱ������ֵΪTrue��
    public void testequals() {
	String singer = "abc";
	String singer1 = "abc";
	boolean result = StringUtils.equals(singer, singer1);
	assertTrue("True",result);
    }
}
