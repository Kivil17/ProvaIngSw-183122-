package esercitazione.ListaNumeri;


import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Arrays;


import org.junit.BeforeClass;
import org.junit.Test;

public class MyListUtilTest {

	
	static MyListUtil cl;
	@BeforeClass
	public void inizializza() {
		 cl= new MyListUtil();
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
	
}
