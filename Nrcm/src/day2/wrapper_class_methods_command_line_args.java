package day2;

public class wrapper_class_methods_command_line_args {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a=args[0];
		int b=Integer.parseInt(args[1]);
		short c=Short.parseShort(args[2]);
		long l=Long.parseLong(args[3]);
		double d=Double.parseDouble(args[4]);
		byte b1=Byte.parseByte(args[5]);
		float f=Float.parseFloat(args[6]);
		char c1=args[7].charAt(0);
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(l);
		System.out.println(b1);
		System.out.println(d);
		System.out.println(f);
		System.out.println(c1);
		

	}

}
