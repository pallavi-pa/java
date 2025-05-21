package Assignment_2;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Example_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("enter the values of a,b:");
		try {
			int a=s.nextInt();
			int b=s.nextInt();
			int c=a/b;
			System.out.println(c);
		}catch(ArithmeticException |InputMismatchException e) {
			System.out.println(e.getMessage());
		}

	}

}
