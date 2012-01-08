/*
 PureMVC Java port by Frederic Saunier <frederic.saunier@puremvc.org>
 
 Adapted from sources of thoses different authors :
 	Donald Stinchfield <donald.stinchfield@puremvc.org>
 	Ima OpenSource <opensource@ima.eu>
 	Anthony Quinault <anthony.quinault@puremvc.org>
 
 PureMVC - Copyright(c) 2006-10 Futurescale, Inc., Some rights reserved. 
 Your reuse is governed by the Creative Commons Attribution 3.0 License
*/
package org.puremvc.java.core;

import org.puremvc.java.interfaces.INotification;
import org.puremvc.java.patterns.command.SimpleCommand;

/**
 * A SimpleCommand subclass used by ControllerTest.
 *
	 * @see org.puremvc.java.core.controller.ControllerTest ControllerTest
	 * @see org.puremvc.java.core.controller.ControllerTestVO ControllerTestVO
 */
public class ControllerTestCommand2 extends SimpleCommand {
	
	/**
	 * Constructor.
	 */
	public ControllerTestCommand2()
	{
		super();
	}
	
	/**
	 * Fabricate a result by multiplying the input by 2 and adding to the existing result
	 * <P>
	 * This tests accumulation effect that would show if the command were executed more than once.
	 * @param note the note carrying the ControllerTestVO
	 */
	@Override 
	public void execute( INotification note )
	{
		
		ControllerTestVO vo = (ControllerTestVO)note.getBody();
		
		// Fabricate a result
		vo.result = vo.result+(2 * vo.input);

	}
}
