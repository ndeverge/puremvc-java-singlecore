/*
 PureMVC Java port by Frederic Saunier <frederic.saunier@puremvc.org>
 
 Adapted from sources of thoses different authors :
 	Donald Stinchfield <donald.stinchfield@puremvc.org>
 	Ima OpenSource <opensource@ima.eu>
 	Anthony Quinault <anthony.quinault@puremvc.org>
 
 PureMVC - Copyright(c) 2006-10 Futurescale, Inc., Some rights reserved. 
 Your reuse is governed by the Creative Commons Attribution 3.0 License
*/
package org.puremvc.java.patterns.mediator;

import org.junit.Assert;
import org.junit.Test;
import org.puremvc.java.patterns.mediator.Mediator;

/**
 * Test the PureMVC Mediator class.
 * 
 * @see org.puremvc.java.interfaces.IMediator IMediator
 * @see org.puremvc.java.patterns.mediator.Mediator Mediator
 */
public class MediatorTest {

		/**
		 * Tests getting the name using Mediator class accessor method. 
		 */
		@Test
		public void testNameAccessor() {

		// Create a new Mediator and use accessors to set the mediator name 
			Mediator mediator = new Mediator(null, null);
			
			// test assertions
			Assert.assertEquals( "Expecting mediator.getMediatorName() == Mediator.NAME", mediator.getMediatorName() , Mediator.NAME );
		}

		/**
		 * Tests getting the name using Mediator class accessor method. 
		 */
		@Test
		public void testViewAccessor(){

		// Create a view object
			Object view = new Object();
		
		// Create a new Proxy and use accessors to set the proxy name 
			Mediator mediator = new Mediator( Mediator.NAME, view );
		   			
			// test assertions
			Assert.assertNotNull( "Expecting mediator.getViewComponent() not null", mediator.getViewComponent() );
		}
}
