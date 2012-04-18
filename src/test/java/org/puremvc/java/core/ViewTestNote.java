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
import org.puremvc.java.patterns.observer.Notification;

/**
 * A Notification class used by ViewTest.
 * 
 * @see org.puremvc.java.core.view.ViewTest ViewTest
 */
public class ViewTestNote extends Notification implements INotification {
	/**
	 * The name of this Notification.
	 */
	public static final String NAME = "ViewTestNote";

	/**
	 * Constructor.
	 * 
	 * @param name
	 *            Ignored and forced to NAME.
	 * @param body
	 *            the body of the Notification to be constructed.
	 */
	public ViewTestNote(String name, Object body) {
		super(NAME, body, null);
	}

	/**
	 * Factory method.
	 * 
	 * <P>
	 * This method creates new instances of the ViewTestNote class,
	 * automatically setting the note name so you don't have to. Use this as an
	 * alternative to the constructor.
	 * </P>
	 * 
	 * @param name
	 *            the name of the Notification to be constructed.
	 * @param body
	 *            the body of the Notification to be constructed.
	 */
	public static INotification create(Object body) {
		return new ViewTestNote(NAME, body);
	}
}
