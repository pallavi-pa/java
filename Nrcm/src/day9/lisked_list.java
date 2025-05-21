package day9;
import java.util.LinkedList;
import java.util.List;

public class lisked_list {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 LinkedList <Object>l1=new LinkedList<Object>();
			l1.add(12);
			l1.add("hi");
			l1.add(67);
			LinkedList<Object>l2=new LinkedList<Object>(l1);//adding elements of l1 to l2 within the constructor
			l2.add(12);
			l2.add(45);
			l2.add(67);
			System.out.println(l2);
			l2.addAll(l1);
			System.out.println(l2);
			l2.addFirst(4);
			System.out.println(l2);
			l2.addLast(49);
			System.out.println(l2);
			l2.add(2,4);
			System.out.println(l2);
			l2.removeFirst();
			l2.removeLast();
			l2.removeFirstOccurrence(12);
			l2.removeLastOccurrence(l2);
	}

}
