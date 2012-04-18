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
 * A MacroCommand subclass used by MacroCommandTest.
 *
	 * @see org.puremvc.java.patterns.command.MacroCommandTest MacroCommandTest
	 * @see org.puremvc.java.patterns.command.MacroCommandTestSub1Command MacroCommandTestSub1Command
	 * @see org.puremvc.java.patterns.command.MacroCommandTestSub2Command MacroCommandTestSub2Command
	 * @see org.puremvc.java.patterns.command.MacroCommandTestVO MacroCommandTestVO
 */
public class MacroCommandTestCommand extends MacroCommand {

	/**
	 * Constructor.
	 */
	public MacroCommandTestCommand()
	{
		super();
	}
	
	/**
	 * Initialize the MacroCommandTestCommand by adding
	 * its 2 SubCommands.
	 */
	@Override 
	protected void initializeMacroCommand()
	{
		addSubCommand( new MacroCommandTestSub1Command() );
		addSubCommand( new MacroCommandTestSub2Command() );
	}
}
