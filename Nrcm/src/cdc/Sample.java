package cdc;

public class Sample {
    int x=67,y=89;
    static int p=45,q=12;
	void mod() {
		System.out.println(x%y);
	}
	void mul() {
		System.out.println(p*q);
	}
	void div() {
		int a=8,b=4;
		System.out.println(a/b);
	}

	public static void main(String[] args) {

		Sample s=new Sample();
		s.mod();
		s.mul();
		s.div();
		
	}

}
