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

/**
* A utility class used by ControllerTest.
* 
* @see org.puremvc.java.core.controller.ControllerTest ControllerTest
* @see org.puremvc.java.core.controller.ControllerTestCommand ControllerTestCommand
*/
public class ControllerTestVO {
	
	public int input = 0;
	public int result = 0;
	
	/**
	 * Constructor.
	 * 
	 * @param input the number to be fed to the ControllerTestCommand
	 */
	public ControllerTestVO (int input){
		this.input = input;
	}

}
