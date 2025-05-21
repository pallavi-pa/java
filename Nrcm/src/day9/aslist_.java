package day9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class aslist_ {

	public static void main(String[] args) {
		    List <Object>l1=new ArrayList<Object>();
			l1.add(12);
			l1.add(45);
			l1.add(67);
			System.out.println(l1);
			List <Object>extra=Arrays.asList("nikky","bharat","pinky");
			l1.addAll(extra);
			System.out.println(l1);
			l1.addAll(1,extra);
			System.out.println(l1);
			System.out.println(l1.get(6));
			System.out.println(l1.indexOf(45));

	}

}
