package day7;
import java.util.InputMismatchException;
import java.util.Scanner;

public class throws_ {

	public static void main(String[] args) throws ArithmeticException,InputMismatchException{
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("enter the values of a,b:");
			int a=s.nextInt();
			int b=s.nextInt();
			int c=a/b;
			System.out.println(c);
		}

	}

