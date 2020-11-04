package esercitazione.ListaNumeri;

import java.util.ArrayList;
import java.util.Scanner;

public class MyListUtil {
	
	public static boolean ordinaCrescente(ArrayList<Integer> l)
	{
		if(l.isEmpty())
			return false;
		else
		{
			java.util.Collections.sort(l);
			return true;
		}
	}
	
	public static boolean ordinaDecrescente(ArrayList<Integer> l)
	{
		if(l.isEmpty())
			return false;
		else
		{
			java.util.Collections.reverse(l);
			return true;
		}
	}
	
	public static void main(String[] args) {
		
		ArrayList<Integer> a= new ArrayList<Integer>();
		a.add(10);
		a.add(2);
		a.add(0);
		a.add(13);
		a.add(23);
		a.add(145);
		a.add(89);
		a.add(24);
		a.add(890);
		
		Scanner i= new Scanner(System.in);
		System.out.println("premi 1 per quella crescente, 2 per quella decrescente");
		int x= i.nextInt();
		
		if(x==1)
			ordinaCrescente(a);
		else if (x==2)
			ordinaDecrescente(a);
	}
}
