package day8;
import java.io.File;
import java.io.IOException;

public class Files_ {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File f1=new File("C:\\Users\\PALLAVI\\OneDrive\\Desktop\\sem");
		if(f1.createNewFile()) {
			System.out.println("file creates successfully");
		}
		else {
			System.out.println("not created");
		}

	}
}