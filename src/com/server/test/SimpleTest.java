  

package com.server.test;

import junit.framework.TestCase;

import java.util.Collection;
import java.util.LinkedList;

import com.server.bank.Simple;

public class SimpleTest extends TestCase
{

	final Simple simple = new Simple();

	public SimpleTest(String nm)
	{
		super(nm);
		System.out.println("SimpleTest()");
	}

	public void testSquare()
	{
		assertEquals(1, simple.square(1));
		assertEquals(1, simple.square(-1));
	}

	public void testF()
	{
		assertEquals(1, simple.f(-1));
		assertEquals(12, simple.f(6));
	}

	public void testSum()
	{
		Collection c = new LinkedList();
		c.add(new Integer(3));
		c.add(new Integer(5));
		c.add(new Integer(8));
		assertEquals(16, simple.sum(c));
	}
}