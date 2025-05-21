package day2_assignmet;
import java.util.*;

public class password_validation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter password:");
		String password=s.nextLine();
		s.close();
		int length=password.length();
		if(length>=8&& Character.isUpperCase(password.charAt(0))&&password.matches(".*[^a-zA-Z0-9 ].*")) {
			System.out.println("Valid Password");
		}
		else {
			System.out.println("Invalid Password");
		}
		

	}

}
