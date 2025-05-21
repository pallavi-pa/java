package day2_assignmet;
import java.util.Scanner;
public class clock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.print("Enter time:");
		String time=s.next();
		switch(time) {
		case "7am":
			System.out.println("wakeup time");
			break;
		case "8am":
			System.out.println("breakfast  time");
			break;
		case "9":
			System.out.println("school time");
			break;
		case "12:30pm":
			System.out.println("lunch time");
			break;
		case "5pm":
			System.out.println("play time");
			break;
		case "7pm":
			System.out.println("Home work time");
			break;
		case "8pm":
			System.out.println("dinner time");
			break;
		case "9pm":
			System.out.println("bed time");
			break;
		default:
			System.out.println("enter correct time");
			break;
		}

	}

}
