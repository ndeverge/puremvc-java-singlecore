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
 * A SimpleCommand subclass used by SimpleCommandTest.
 * 
 * @see org.puremvc.java.patterns.command.SimpleCommandTest
 *      SimpleCommandTest
 * @see org.puremvc.java.patterns.command.SimpleCommandTestVO
 *      SimpleCommandTestVO
 */
public class SimpleCommandTestCommand extends SimpleCommand {

	/**
	 * Constructor.
	 */
	public SimpleCommandTestCommand() {
		super();
	}

	/**
	 * Fabricate a result by multiplying the input by 2
	 * 
	 * @param event
	 *            the <code>INotification</code> carrying the
	 *            <code>SimpleCommandTestVO</code>
	 */
	@Override
	public void execute(INotification note) {

		SimpleCommandTestVO vo = (SimpleCommandTestVO) note.getBody();

		// Fabricate a result
		vo.result = 2 * vo.input;

	}
}
