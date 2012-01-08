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

import org.puremvc.java.interfaces.INotification;

/**
 * A SimpleCommand subclass used by MacroCommandTestCommand.
 *
 * @see org.puremvc.java.patterns.command.MacroCommandTest MacroCommandTest
 * @see org.puremvc.java.patterns.command.MacroCommandTestCommand MacroCommandTestCommand
 * @see org.puremvc.java.patterns.command.MacroCommandTestVO MacroCommandTestVO
 */
public class MacroCommandTestSub2Command extends SimpleCommand {

	public MacroCommandTestSub2Command()
	{
		super();
	}
	
	/**
	 * Fabricate a result by multiplying the input by 2
	 * 
	 * @param event the <code>IEvent</code> carrying the <code>MacroCommandTestVO</code>
	 */
	@Override 
	public void execute( INotification note ) 
	{
		
		MacroCommandTestVO vo = (MacroCommandTestVO)note.getBody();
		
		// Fabricate a result
		vo.result1 = 2 * vo.input;

	}
}
