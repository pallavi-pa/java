package day8;

import java.io.FileWriter;
import java.io.IOException;

public class file_write {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileWriter f1=new FileWriter("C:\\Users\\PALLAVI\\OneDrive\\Desktop\\sem2");
		f1.write("hey pallavi wattsup");
		f1.close();
		System.out.println("success");

	}

}
