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

import org.junit.Assert;
import org.junit.Test;
import org.puremvc.java.patterns.observer.Notification;

/**
 * Test the PureMVC SimpleCommand class.
 *
 * @see org.puremvc.java.patterns.command.SimpleCommandTestVO SimpleCommandTestVO
 * @see org.puremvc.java.patterns.command.SimpleCommandTestCommand SimpleCommandTestCommand
 */
public class SimpleCommandTest {

	/**
	 * Tests the <code>execute</code> method of a <code>SimpleCommand</code>.
	 * 
	 * <P>
	 * This test creates a new <code>Notification</code>, adding a 
	 * <code>SimpleCommandTestVO</code> as the body. 
	 * It then creates a <code>SimpleCommandTestCommand</code> and invokes
	 * its <code>execute</code> method, passing in the note.</P>
	 * 
	 * <P>
	 * Success is determined by evaluating a property on the 
	 * object that was passed on the Notification body, which will
	 * be modified by the SimpleCommand</P>.
	 * 
	 */
	@Test
	public void testSimpleCommandExecute() {

		// Create the VO
		SimpleCommandTestVO vo = new SimpleCommandTestVO(5);

		// Create the Notification (note)
		Notification note = new Notification("SimpleCommandTestNote", vo, null);

		// Create the SimpleCommand  			
		SimpleCommandTestCommand command = new SimpleCommandTestCommand();

		// Execute the SimpleCommand
		command.execute(note);

		// test assertions
		Assert.assertEquals("Expecting vo.result == 10", vo.result, 10);

	}
}
