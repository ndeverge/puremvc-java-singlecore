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

import org.junit.Assert;
import org.junit.Test;
import org.puremvc.java.interfaces.IFacade;
import org.puremvc.java.interfaces.IMediator;
import org.puremvc.java.interfaces.IProxy;
import org.puremvc.java.patterns.mediator.Mediator;
import org.puremvc.java.patterns.proxy.Proxy;

/**
 * Test the PureMVC Facade class.
 *
 * @see org.puremvc.java.patterns.facade.FacadeTestVO FacadeTestVO
 * @see org.puremvc.java.patterns.facade.FacadeTestCommand FacadeTestCommand
 */
public class FacadeTest
{
	/**
	 * Tests the Facade Singleton Factory Method 
	 */
	@Test
	public void testGetInstance()
	{

		// Test Factory Method
		IFacade facade = Facade.getInstance();

		// test assertions
		Assert.assertNotNull("Expecting instance not null", facade);
		Assert.assertNotNull("Expecting instance implements IFacade", (IFacade) facade);

	}

	/**
	 * Tests Command registration and execution via the Facade.
	 * 
	 * <P>
	 * This test gets a Singleton Facade instance 
	 * and registers the FacadeTestCommand class 
	 * to handle 'FacadeTest' Notifcations.<P>
	 * 
	 * <P>
	 * It then sends a notification using the Facade. 
	 * Success is determined by evaluating 
	 * a property on an object placed in the body of
	 * the Notification, which will be modified by the Command.</P>
	 * 
	 */
	@Test
	public void testRegisterCommandAndSendNotification() {

		// Create the Facade, register the FacadeTestCommand to 
		// handle 'FacadeTest' notifications
		IFacade facade = Facade.getInstance();
		facade.registerCommand("FacadeTestNote", new FacadeTestCommand());

		// Send notification. The Command associated with the event
		// (FacadeTestCommand) will be invoked, and will multiply 
		// the vo.input value by 2 and set the result on vo.result
		FacadeTestVO vo = new FacadeTestVO(32);
		facade.sendNotification("FacadeTestNote", vo, null);

		// test assertions 
		Assert.assertEquals("Expecting vo.result == 64", vo.result, 64);
	}

	/**
	 * Tests Command removal via the Facade.
	 * 
	 * <P>
	 * This test gets a Singleton Facade instance 
	 * and registers the FacadeTestCommand class 
	 * to handle 'FacadeTest' Notifcations. Then it removes the command.<P>
	 * 
	 * <P>
	 * It then sends a Notification using the Facade. 
	 * Success is determined by evaluating 
	 * a property on an object placed in the body of
	 * the Notification, which will NOT be modified by the Command.</P>
	 * 
	 */
	@Test
	public void testRegisterAndRemoveCommandAndSendNotification() {

		// Create the Facade, register the FacadeTestCommand to 
		// handle 'FacadeTest' events
		IFacade facade = Facade.getInstance();
		facade.registerCommand("FacadeTestNote", new FacadeTestCommand());
		facade.removeCommand("FacadeTestNote");

		// Send notification. The Command associated with the event
		// (FacadeTestCommand) will NOT be invoked, and will NOT multiply 
		// the vo.input value by 2 
		FacadeTestVO vo = new FacadeTestVO(32);
		facade.sendNotification("FacadeTestNote", vo, null);

		// test assertions 
		Assert.assertFalse("Expecting vo.result != 64", vo.result == 64);
	}

	/**
	 * Tests the regsitering and retrieving Model proxies via the Facade.
	 * 
	 * <P>
	 * Tests <code>registerProxy</code> and <code>retrieveProxy</code> in the same test.
	 * These methods cannot currently be tested separately
	 * in any meaningful way other than to show that the
	 * methods do not throw exception when called. </P>
	 */
	@Test
	public void testRegisterAndRetrieveProxy() {

		// register a proxy and retrieve it.
		IFacade facade = Facade.getInstance();
		facade.registerProxy(new Proxy("colors", new String[] { "red", "green", "blue" }));
		Proxy proxy = (Proxy) facade.retrieveProxy("colors");
		// test assertions
		Assert.assertNotNull("Expecting proxy is IProxy", (IProxy) proxy);

		// retrieve data from proxy
		String[] data = (String[]) proxy.getData();

		// test assertions
		Assert.assertNotNull("Expecting data not null", data);
		Assert.assertNotNull("Expecting data is Array", (String[]) data);
		Assert.assertEquals("Expecting data.length == 3", data.length, 3);
		Assert.assertEquals("Expecting data[0] == 'red'", data[0], "red");
		Assert.assertEquals("Expecting data[1] == 'green'", data[1], "green");
		Assert.assertEquals("Expecting data[2] == 'blue'", data[2], "blue");
	}

	/**
	 * Tests the removing Proxies via the Facade.
	 */
	@Test
	public void testRegisterAndRemoveProxy() {

		// register a proxy, remove it, then try to retrieve it
		IFacade facade = Facade.getInstance();
		IProxy proxy = new Proxy("sizes", new String[] { "7", "13", "21" });
		facade.registerProxy(proxy);

		// remove the proxy
		IProxy removedProxy = facade.removeProxy("sizes");

		// assert that we removed the appropriate proxy
		Assert.assertEquals("Expecting removedProxy.getProxyName() == 'sizes'", removedProxy.getProxyName(), "sizes");

		// make sure we can no longer retrieve the proxy from the model
		proxy = facade.retrieveProxy("sizes");

		// test assertions
		Assert.assertNull("Expecting proxy is null", proxy);
	}

	/**
	 * Tests registering, retrieving and removing Mediators via the Facade.
	 */
	@Test
	public void testRegisterRetrieveAndRemoveMediator() {

		// register a mediator, remove it, then try to retrieve it
		IFacade facade = Facade.getInstance();
		facade.registerMediator(new Mediator(Mediator.NAME, null));

		// retrieve the mediator
		Assert.assertNotNull("Expecting mediator is not null", facade.retrieveMediator(Mediator.NAME));

		// remove the mediator
		IMediator removedMediator = facade.removeMediator(Mediator.NAME);

		// assert that we have removed the appropriate mediator
		Assert.assertEquals("Expecting removedMediator.getMediatorName() == Mediator.NAME", removedMediator.getMediatorName(), Mediator.NAME);

		// assert that the mediator is no longer retrievable
		Assert.assertNull("Expecting facade.retrieveMediator( Mediator.NAME ) == null )", facade.retrieveMediator(Mediator.NAME));

	}

	/**
	 * Tests the hasProxy Method
	 */
	@Test
	public void testHasProxy() {

		// register a Proxy
		IFacade facade = Facade.getInstance();
		facade.registerProxy(new Proxy("hasProxyTest", new int[] { 1, 2, 3 }));

		// assert that the model.hasProxy method returns true
		// for that proxy name
		Assert.assertTrue("Expecting facade.hasProxy('hasProxyTest') == true", facade.hasProxy("hasProxyTest"));

	}

	/**
	 * Tests the hasMediator Method
	 */
	@Test
	public void testHasMediator() {

		// register a Mediator
		IFacade facade = Facade.getInstance();
		facade.registerMediator(new Mediator("facadeHasMediatorTest", null));

		// assert that the facade.hasMediator method returns true
		// for that mediator name
		Assert.assertTrue("Expecting facade.hasMediator('facadeHasMediatorTest') == true", facade.hasMediator("facadeHasMediatorTest"));

		facade.removeMediator("facadeHasMediatorTest");

		// assert that the facade.hasMediator method returns false
		// for that mediator name
		Assert.assertFalse("Expecting facade.hasMediator('facadeHasMediatorTest') == false", facade.hasMediator("facadeHasMediatorTest"));

	}

	/**
	 * Test hasCommand method.
	 */
	@Test
	public void testHasCommand() {

		// register the ControllerTestCommand to handle "hasCommandTest" notes
		IFacade facade = Facade.getInstance();
		facade.registerCommand("facadeHasCommandTest", new FacadeTestCommand());

		// test that hasCommand returns true for hasCommandTest notifications 
		Assert.assertTrue("Expecting facade.hasCommand('facadeHasCommandTest') == true", facade.hasCommand("facadeHasCommandTest"));

		// Remove the Command from the Controller
		facade.removeCommand("facadeHasCommandTest");

		// test that hasCommand returns false for hasCommandTest notifications 
		Assert.assertFalse("Expecting facade.hasCommand('facadeHasCommandTest') == false", facade.hasCommand("facadeHasCommandTest"));

	}
}