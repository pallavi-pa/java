package day2;
import java.util.*;

public class user_input {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("Enter a number:");
		int n=s.nextInt();
		s.close();
		System.out.println("Value:"+n);
	}

}
