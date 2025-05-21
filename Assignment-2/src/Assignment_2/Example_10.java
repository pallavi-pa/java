package Assignment_2;
import java.util.Scanner;
public class Example_10 {

	public static void main(String[] args) throws NullPointerException,NumberFormatException,IllegalArgumentException{

	Scanner sc = new Scanner(System.in);

	System.out.println("enter the name of the student: ");
	String s1 = sc.next();
	System.out.println("enter the score of the student");
	String s2=sc.next();
	int n=Integer.parseInt(s2);
	try {
		if(n>=0&&n<=100)
		{
			System.out.println("The score has been Successfully recorded");
		}
		else
		{
			System.out.println("score must be between 0 and 100");
		}


	}
	catch(NullPointerException e)
		{
			System.out.println("the score is not a integer"+ e.getMessage());
		}

	catch(IllegalArgumentException e)
	{
	System.out.println("the score is not between 0 and 100");
		System.out.println(e.getMessage());
		}
		finally {
			sc.close();
		}
		}
	}

