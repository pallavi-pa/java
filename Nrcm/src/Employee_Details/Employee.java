package Employee_Details;
import java.util.*;
class Employee_test{
	int Eid;
	String Name;
	float Salary;
	long Mobile_number;
	public Employee_test(int Eid,String Name,float Salary,long Mobile_number) {
		this.Eid=Eid;
		this.Name=Name;
		this.Salary=Salary;
		this.Mobile_number=Mobile_number;
	}
	void print_employee_details() {
		System.out.println("EMPLOYEE DETAILS");
		System.out.println("Employee ID:"+Eid);
		System.out.println("Employee Name:"+Name);
		System.out.println("Employee Salary:"+Salary);
		System.out.println("Employee Mobile_number"+Mobile_number);
	}
}

public class Employee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		//Scanner s1=new Scanner(System.in);
		
		System.out.print("Enter Employee Id:");
		int Eid=s.nextInt();
		System.out.print("Enter Employee Name:");
		String Name=s.next();
		System.out.print("Enter Employee Salary:");
		float Salary=s.nextFloat();
		System.out.print("Enter Employee Mobile_number:");
		long Mobile_number=s.nextLong();
		Employee_test e=new Employee_test(Eid,Name,Salary,Mobile_number);
		
		
		System.out.print("Enter Employee Id:");
		Eid=s.nextInt();
		System.out.print("Enter Employee Name:");
		Name=s.next();
		System.out.print("Enter Employee Salary:");
		Salary=s.nextFloat();
		System.out.print("Enter Employee Mobile_number:");
		Mobile_number=s.nextLong();
		Employee_test e1=new Employee_test(Eid,Name,Salary,Mobile_number);
		
		e.print_employee_details();
		
		e1.print_employee_details();
//		Employee_test e2=new Employee_test(Eid,Name,Salary,Mobile_number);
//		e2.print_employee_details();
		
		
		
		

	}

}
