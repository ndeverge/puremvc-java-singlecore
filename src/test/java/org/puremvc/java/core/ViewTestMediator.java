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

import org.puremvc.java.interfaces.IMediator;
import org.puremvc.java.patterns.mediator.Mediator;

/**
 * A Mediator class used by ViewTest.
 * 
 * @see org.puremvc.java.core.view.ViewTest ViewTest
 */
public class ViewTestMediator extends Mediator implements IMediator {

	/**
	 * The Mediator name
	 */
	public static final String NAME = "ViewTestMediator";

	/**
	 * Constructor
	 */
	public ViewTestMediator(Object view) {
		super(NAME, view);
	}

	@Override
	public String[] listNotificationInterests() {
		// be sure that the mediator has some Observers created
		// in order to test removeMediator
		return new String[] { "ABC", "DEF", "GHI" };
	}
}
