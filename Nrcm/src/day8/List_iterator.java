package day8;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class List_iterator {

	public static void main(String[] args) {
		List<Integer>l1=new ArrayList<Integer>();
		l1.add(12);
		l1.add(45);
		l1.add(78);
		System.out.println(l1);
		ListIterator i1=l1.listIterator();
		while(i1.hasNext()) {
			System.out.println(i1.next());
		}
		while(i1.hasPrevious()) {
			System.out.println(i1.previous());
		}


	}

}
