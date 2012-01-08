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
	 * A utility class used by MacroCommandTest.
	 * 
	 * @see org.puremvc.java.patterns.command.MacroCommandTest MacroCommandTest
	 * @see org.puremvc.java.patterns.command.MacroCommandTestCommand MacroCommandTestCommand
	 * @see org.puremvc.java.patterns.command.MacroCommandTestSub1Command MacroCommandTestSub1Command
	 * @see org.puremvc.java.patterns.command.MacroCommandTestSub2Command MacroCommandTestSub2Command
	 */
public class MacroCommandTestVO {
	
	public int input;
	public int result1;
	public int result2;
	
	/**
	 * Constructor.
	 * 
	 * @param input the number to be fed to the MacroCommandTestCommand
	 */
	public MacroCommandTestVO (int input){
		this.input = input;
	}

}
