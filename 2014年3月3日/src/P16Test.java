import junit.framework.TestCase;

/*

COPYRIGHT (C) 2014 BY GUPT SOFTWARE. ALL RIGHTS RESERVED.

+AMENDMENT HISTORY AS BELOW++++++++
VERSION: 1.0
AUTHOR: PAN JingHong
DATE: 2014��3��3��
DESCRIPTION: 

 */

/**
 * @author PAN JingHong
 *
 * @version 
 * @date 2014��3��3�� ����4:00:46
 */
public class P16Test extends TestCase {

	/**
	 * Test method for {@link P16#main(java.lang.String[])}.
	 */
//    public void testIsEmpty() {
//	String singer = "";
//	boolean result = singer.isEmpty();
//	assertTrue(result);
//    }
    
	  public void testSubstringInt() {
			String singer = "I am a singer";
			String result = singer.substring(7, singer.length());
			assertEquals("singer", result);
			System.out.println("����ͨ��");
		    }



}
