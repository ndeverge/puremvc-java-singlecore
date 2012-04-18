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

import org.puremvc.java.patterns.proxy.Proxy;

public class ModelTestProxy extends Proxy {
	
	public static final String NAME = "ModelTestProxy";
	public static final String ON_REGISTER_CALLED = "onRegister Called";
	public static final String ON_REMOVE_CALLED = "onRemove Called";

	public ModelTestProxy()
	{
		super(NAME, "");
	}

	@Override 
	public void onRegister()
	{
		setData(ON_REGISTER_CALLED);
	}		

	@Override 
	public void onRemove()
	{
		setData(ON_REMOVE_CALLED);
	}
}
