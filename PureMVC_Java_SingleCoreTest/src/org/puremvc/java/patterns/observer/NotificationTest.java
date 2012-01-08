/*
 PureMVC Java port by Frederic Saunier <frederic.saunier@puremvc.org>
 
 Adapted from sources of thoses different authors :
 	Donald Stinchfield <donald.stinchfield@puremvc.org>
 	Ima OpenSource <opensource@ima.eu>
 	Anthony Quinault <anthony.quinault@puremvc.org>
 
 PureMVC - Copyright(c) 2006-10 Futurescale, Inc., Some rights reserved. 
 Your reuse is governed by the Creative Commons Attribution 3.0 License
*/
package org.puremvc.java.patterns.observer;

import org.junit.Assert;
import org.junit.Test;
import org.puremvc.java.interfaces.INotification;

/**
 * Test the PureMVC Notification class.
 * 
 * @see org.puremvc.java.patterns.observer.Notification Notification
 */
public class NotificationTest {
	/**
	 * Tests setting and getting the name using Notification class accessor
	 * methods.
	 */
	@Test
	public void testNameAccessors() {

		// Create a new Notification and use accessors to set the note name
		INotification note = new Notification("TestNote");

		// test assertions
		Assert.assertEquals("Expecting note.getName() == 'TestNote'", note.getName(), "TestNote");
	}

	/**
	 * Tests setting and getting the body using Notification class accessor
	 * methods.
	 */
	@Test
	public void testBodyAccessors() {

		// Create a new Notification and use accessors to set the body
		INotification note = new Notification(null);
		note.setBody(5);

		// test assertions
		Assert.assertTrue("Expecting note.getBody()as Number == 5", (Integer) note.getBody() == 5);
	}

	/**
	 * Tests setting the name and body using the Notification class Constructor.
	 */
	@Test
	public void testConstructor() {

		// Create a new Notification using the Constructor to set the note name
		// and body
		INotification note = new Notification("TestNote", 5, "TestNoteType");

		// test assertions
		Assert.assertEquals("Expecting note.getName() == 'TestNote'", note.getName(), "TestNote");
		Assert.assertTrue("Expecting note.getBody()as Number == 5", (Integer) note.getBody() == 5);
		Assert.assertEquals("Expecting note.getType() == 'TestNoteType'", note.getType(), "TestNoteType");
	}

	/**
	 * Tests the toString method of the notification
	 */
	@Test
	public void testToString() {

		// Create a new Notification and use accessors to set the note name
		INotification note = new Notification("TestNote", "1,3,5", "TestType");
		String ts = "Notification Name: TestNote Body:1,3,5 Type:TestType";

		// test assertions
		Assert.assertEquals("Expecting note.testToString() == '" + ts + "'", note.toString(), ts);
	}
}
