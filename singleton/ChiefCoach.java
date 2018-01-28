/*
COPYRIGHT (C) 2014 BY GUPT SOFTWARE. ALL RIGHTS RESERVED.

+AMENDMENT HISTORY AS BELOW++++++++
VERSION: 
AUTHOR: 
DATE: 
DESCRIPTION: 
 */

package org.milan.lab.pattern.singleton;

/**
 * 
 * @author Paolo Weng
 * @version 1.0
 * @date Mar 2, 2014
 */

public class ChiefCoach {
    private static ChiefCoach myInstance;

    private ChiefCoach() {

    }

    public static ChiefCoach getInstance() {
	if (myInstance == null) {
	    myInstance = new ChiefCoach();
	}

	return myInstance;
    }

       

}
