package day5;
class sample45{
	int x=10;
	
}
public class super_var extends sample45 {
	void print() {
		System.out.println(super.x);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		super_var s=new super_var();
		s.print();

	}

}
