package day8;

import java.util.*;
import java.util.Vector;

public class vector_ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Vector<Integer>s1=new Vector<Integer>();
		 s1.add(45);
		 s1.add(40);
		 s1.add(23);
		 System.out.println(s1);
		 Enumeration i1=s1.elements();
		 while(i1.hasMoreElements()) {
			 System.out.println(i1.nextElement());
		 }
		 

	}

}
