package day2_assignmet;
import java.util.*;
public class loan_eligibility {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int credit_score=s.nextInt();
		s.close();
		System.out.println("Enter credit score:");
		if(credit_score>600) {
			System.out.print("loan given:"+100000);
		}
		else {
			System.out.println("Nor eligible for loan");
		}

	}

}
