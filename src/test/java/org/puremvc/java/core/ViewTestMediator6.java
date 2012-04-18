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
import org.puremvc.java.interfaces.INotification;
import org.puremvc.java.patterns.mediator.Mediator;

/**
 * A Mediator class used by ViewTest.
 * 
 * @see org.puremvc.java.core.view.ViewTest ViewTest
 */
public class ViewTestMediator6 extends Mediator implements IMediator {
	/**
	 * The Mediator name
	 */
	public static final String NAME = "ViewTestMediator6";

	/**
	 * Constructor
	 */
	public ViewTestMediator6(String name, Object view) {
		super(name, view);
	}

	@Override
	public String[] listNotificationInterests() {
		// be sure that the mediator has some Observers created
		// in order to test removeMediator
		return new String[] { ViewTest.NOTE6 };
	}

	@Override
	public void handleNotification(INotification notification) {
		facade.removeMediator(getMediatorName());
	}

	@Override
	public void onRemove() {
		getViewTest().counter++;
	}

	public ViewTest getViewTest() {
		return (ViewTest) viewComponent;
	}

}
