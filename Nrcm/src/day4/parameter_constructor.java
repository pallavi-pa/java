package day4;

public class parameter_constructor {
	int a=90;
	parameter_constructor(int b){
		a=b;
		System.out.println("hello world"+ b);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		parameter_constructor p1=new parameter_constructor(45);

	}

}
