/*
 PureMVC Java port by Frederic Saunier <frederic.saunier@puremvc.org>
 
 Adapted from sources of thoses different authors :
 	Donald Stinchfield <donald.stinchfield@puremvc.org>
 	Ima OpenSource <opensource@ima.eu>
 	Anthony Quinault <anthony.quinault@puremvc.org>
 
 PureMVC - Copyright(c) 2006-10 Futurescale, Inc., Some rights reserved. 
 Your reuse is governed by the Creative Commons Attribution 3.0 License
*/
package org.puremvc.java.patterns.command;

/**
 * A utility class used by SimpleCommandTest.
 * 
 * @see org.puremvc.java.patterns.command.SimpleCommandTest SimpleCommandTest
 * @see org.puremvc.java.patterns.command.SimpleCommandTestCommand SimpleCommandTestCommand
 */
public class SimpleCommandTestVO {

	public int input;

	public int result;

	/**
	 * Constructor.
	 * 
	 * @param input the number to be fed to the SimpleCommandTestCommand
	 */
	public SimpleCommandTestVO(int input) {
		this.input = input;
	}

}
