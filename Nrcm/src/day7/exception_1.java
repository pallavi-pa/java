package day7;
import java.util.*;
public class exception_1 {

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
		}/*catch(InputMismatchException e) {
			System.out.println(e.getMessage());
		}*/

	}

}
