package day2;

public class switch_case {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String color=args[0];
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
