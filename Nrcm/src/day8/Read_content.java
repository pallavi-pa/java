package day8;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Read_content {

	public static void main(String[] args) {
		try {
			File obj=new File("C:\\Users\\PALLAVI\\OneDrive\\Desktop\\sem");
			Scanner R=new Scanner(obj);
			while(R.hasNextLine()) {
				String data=R.nextLine();
				System.out.println(data);
			}
			R.close();
		}
		catch(FileNotFoundException e) {
			System.out.println("An error has occurred");
			e.printStackTrace();
		}

	}

}
