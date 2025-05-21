package day9;

import java.util.*;
import java.util.Stack;

public class Stack_ {
	public static void main(String[] args) {// TODO Auto-generated method stub
		 Stack<Integer>s1=new Stack<Integer>();
		 s1.push(45);
		 s1.push(40);
		 s1.push(23);
		 System.out.println(s1);
		 Iterator<Integer> i1=s1.iterator();
		 while(i1.hasNext()) {
			 System.out.println(i1.next());
		 }
		 System.out.println(s1.peek());
		 
	}

}
