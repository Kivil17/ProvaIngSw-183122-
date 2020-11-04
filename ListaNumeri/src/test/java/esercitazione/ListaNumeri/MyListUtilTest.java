package esercitazione.ListaNumeri;


import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Arrays;

import org.joda.time.DateTime;
import org.joda.time.Duration;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class MyListUtilTest {

	
	static MyListUtil cl;
	static DateTime s;
	static DateTime e;
	static DateTime fine;
	static Duration d;
	
	@BeforeClass
	public static void inizializza() {
		 cl= new MyListUtil();
		 System.out.println("inizio:"+s);
	}
	
	@Before
	public void start()
	{
		s= new DateTime(2004,11,20,0,0);
		
	}
	
	@After
	public void end()
	{
		e= new DateTime(2005,11,20,0,0);
		d= new Duration(s,e);
	}
	
	@Test
	public void crescenteIsCorrect()
	{
		assertFalse(cl.ordinaCrescente(new ArrayList<Integer>()));
		assertTrue(cl.ordinaCrescente((ArrayList<Integer>) Arrays.asList(3,2,5,1,9)));
	
	}
	
	@Test
	public void decrescenteIsCorrect()
	{
		assertFalse(cl.ordinaDecrescente(new ArrayList<Integer>()));
		assertTrue(cl.ordinaDecrescente((ArrayList<Integer>) Arrays.asList(5,40,32,223,111)));
	}
	
	@AfterClass
	public static void fineTest()
	{
		fine= s.plus(d);
		System.out.println("fine:"+fine);
	}
	
}
