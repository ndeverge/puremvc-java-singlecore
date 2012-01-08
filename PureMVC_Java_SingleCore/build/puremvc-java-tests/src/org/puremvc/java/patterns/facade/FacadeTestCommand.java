/*
 PureMVC Java port by Frederic Saunier <frederic.saunier@puremvc.org>
 
 Adapted from sources of thoses different authors :
 	Donald Stinchfield <donald.stinchfield@puremvc.org>
 	Ima OpenSource <opensource@ima.eu>
 	Anthony Quinault <anthony.quinault@puremvc.org>
 
 PureMVC - Copyright(c) 2006-10 Futurescale, Inc., Some rights reserved. 
 Your reuse is governed by the Creative Commons Attribution 3.0 License
*/
package org.puremvc.java.patterns.facade;

import org.puremvc.java.interfaces.INotification;
import org.puremvc.java.patterns.command.SimpleCommand;

/**
 * A SimpleCommand subclass used by FacadeTest.
 *
 * @see org.puremvc.java.patterns.facade.FacadeTest FacadeTest
 * @see org.puremvc.java.patterns.facade.FacadeTestVO FacadeTestVO
 */
public class FacadeTestCommand extends SimpleCommand {
	/**
	 * Constructor.
	 */
	public FacadeTestCommand() {
		super();
	}

	/**
	 * Fabricate a result by multiplying the input by 2
	 * 
	 * @param note the Notification carrying the FacadeTestVO
	 */
	@Override
	public void execute(INotification note) {

		FacadeTestVO vo = (FacadeTestVO) note.getBody();

		// Fabricate a result
		vo.result = 2 * vo.input;

	}
}
