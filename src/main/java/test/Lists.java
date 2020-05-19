package test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import java.util.TreeSet;

public class Lists {
	
	public static void max() {
		
		Set set = new HashSet();
		
		set.add("Deepak");
		set.add(1);
		set.add("Tall");
		System.out.println(set);	
		
	}
	
	public static void trees() {
		TreeSet<Integer> tr =  new TreeSet<Integer>();
		tr.add(10);
		tr.add(5);
		tr.add(6);
		tr.add(16);
		System.out.println(tr);
		System.out.println(tr.headSet(10));
		System.out.println(tr.tailSet(10));
		
		
	}
		
		public static void main(String[] args) {		
		//ArrayList<String> ts = new ArrayList<String>();
			max();
			trees();
		
		/*
		 * List<String> ts = new ArrayList<String>();
		 * 
		 * ts.add("Deepak"); ts.add("Selvi"); ts.add("Deepak");
		 * 
		 * System.out.println(ts);
		 * 
		 * for (String string : ts) { System.out.println(string); }
		 * 
		 * ts.set(1, "Raj");
		 * 
		 * ListIterator<String> iterator = ts.listIterator();
		 * 
		 * while(iterator.hasNext()) { System.out.println(iterator.next());
		 * 
		 * }
		 */
		
		
	

}
}
