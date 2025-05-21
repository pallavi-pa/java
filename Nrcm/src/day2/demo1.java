package day2;

public class demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=11;
		if(a%2==0) {
			System.out.println("divisible by 2");
			if(a%3==0) {
				System.out.println("divisible by 3");
			}
			else {
				System.out.println("Not divisible by 3");
			}
		}
		else {
			if(a>=10) {
				System.out.println("greaterthan or equal to 10");
			}
			else {
				System.out.println("num less then 10");
			}
		}

	}

}
