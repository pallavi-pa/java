package Assignment_2;
import java.util.*;

public class Example_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer as a string: ");
        String input = sc.nextLine();

        try {
            int parsedInt = Integer.parseInt(input);
            System.out.println("Parsed integer: " + parsedInt);
        } catch (NumberFormatException e) {
            System.out.println("Error: The input is not a valid integer.");
        }
        sc.close();
	}

}
