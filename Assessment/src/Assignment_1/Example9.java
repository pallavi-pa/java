package Assignment_1;
interface Student1{
	void branch1();
}
interface Student2{
	void section();
}
interface Student3{
	void branch2();
}
interface Student4{
	void Section1();
}
class Department implements Student1,Student2,Student3{
	void display() {	
		System.out.println("Different student belongs to different branches");
	}
	public void branch1() {
		System.out.println("Student1 belongs to Cse department");
	}
	public void section() {
		System.out.println("Studen2 belongs to cse-a section");
	}
	public void branch2() {
		System.out.println("Student1 belongs to Cse department");
	}
	
}
class College extends Department implements Student4{
	void print() {
		System.out.println("-------College details--------");
	}
	public void Section1() {
		System.out.println("Studen4 belongs to cse-a section");
		
	}
	
}

public class Example9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		College d=new College();
		d.print();
		d.display();
		d.branch1();
		d.section();
		d.branch2();
		d.Section1();

	}

}
