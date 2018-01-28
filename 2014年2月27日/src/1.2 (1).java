

public class test1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(countMatches("FORZAMILAN", "A"));
	}
	
	
	
	
	public static int countMatches(String str, String sub) {  
	    if (isEmpty(str) || isEmpty(sub)) {  
	        return 0;  
	    }  
	    int count = 0;  
	    int idx = 0;  
	    while ((idx = str.indexOf(sub, idx)) != INDEX_NOT_FOUND) {  
	        count++;  
	        idx += sub.length();  
	    }  
	    return count;  
	}  
	  
	public static final int INDEX_NOT_FOUND = -1;  
	  
	public static boolean isEmpty(String str) {  
	    return str == null || str.length() == 0;  
	}  

}
