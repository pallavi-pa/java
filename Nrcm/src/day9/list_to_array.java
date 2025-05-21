package day9;

import java.util.ArrayList;
import java.util.List;

public class list_to_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List <Object>l1=new ArrayList<Object>();
		l1.add(12);
		l1.add(45);
		l1.add(67);
		System.out.println(l1);
		Object[] arr=l1.toArray();
		for(Object a1:arr) {
			System.out.println(a1);
		}

	}

}
