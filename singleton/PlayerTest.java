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

public class PlayerTest {

    /**
     * @param args
     */
    public static void main(String[] args) {
	Player player1 = new Player();
	Player player2 = new Player();
	System.out.println(player1.getChiefCoach() == player2.getChiefCoach());

    }

}
