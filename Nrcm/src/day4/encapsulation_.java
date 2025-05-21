package day4;

public class encapsulation_ {
	private String firstname;
	private String lastname;
	private String email;
	private long  Phone_number;
	
	

	public String getFirstname() {
		return firstname;
	}



	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}



	public String getLastname() {
		return lastname;
	}



	public void setLastname(String lastname) {
		this.lastname = lastname;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	public long getPhone_number() {
		return Phone_number;
	}



	public void setPhone_number(long phone_number) {
		Phone_number = phone_number;
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		encapsulation_ e=new encapsulation_();
		e.setFirstname("Pallavi");
		e.setLastname("patil");
		e.setEmail("pallavipallavi65892@gmail.com");
		e.setPhone_number(7330908606l);
		System.out.println(e.getFirstname());
		System.out.println(e.getLastname());
		System.out.println(e.getEmail());
		System.out.println(e.getPhone_number());

	}

}
