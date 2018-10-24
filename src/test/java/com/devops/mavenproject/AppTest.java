package com.devops.mavenproject;

import java.awt.Dimension;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testBtStart()
    {
    	JXBusyLabelTest j = new JXBusyLabelTest();
        assertEquals("Start",j.btnStart.getLabel());
    }
    
    public void testBtStop()
    {
    	JXBusyLabelTest j = new JXBusyLabelTest();
        assertEquals("Stop",j.btnStop.getLabel());
    }
    
    public void testVisible()
    {
    	JXBusyLabelTest j = new JXBusyLabelTest();
        assertTrue(j.isVisible());
    }
    
    public void testSize()
    {
    	JXBusyLabelTest j = new JXBusyLabelTest();
        assertEquals(new Dimension(400,160), j.getSize());
    }
    
    public void testLol() {
    	JXBusyLabelTest j = new JXBusyLabelTest();
        assertEquals(42, j.justepourtester(42));    	
    }
    
    
    
    
    
    
    
    
    
    
}
