package Assignment_2;

public class Example_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=Integer.parseInt(args[0]);
		int b=Integer.parseInt(args[1]);
		int c=Integer.parseInt(args[2]);
		int d=Integer.parseInt(args[3]);
		System.out.println(args[3]);
		
		
		try {
			System.out.println(args[6]);
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("The mentioned index is out of bounds");
		}
		

	}

}
