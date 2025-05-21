package day2;
import java.util.*;

public class user_input1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the color:");
		String color=sc.next();
		sc.close();
		switch(color) {
		case "red":
			System.out.println("celebrate holi");
			break;
		case "green":
			System.out.println("celebrate ramazan");
			break;
		case "white":
			System.out.println("celebrate christmas");
			break;
		default:
			System.out.println("no celebration`");
			break;
		}

	}

}
