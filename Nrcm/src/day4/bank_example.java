package day4;
class FixedAmount{
	int initial_amount=10000;
}
abstract class WithdrawAmount{
	abstract void withdraw(int a);
}


public class bank_example extends WithdrawAmount {
		FixedAmount f1=new FixedAmount();
		void withdraw(int a) {
			f1.initial_amount-=a;
			System.out.println("withdrawn:"+a);
			System.out.println("Available balance:"+f1.initial_amount);
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=Integer.parseInt(args[0]);
		bank_example b=new bank_example();
		b.withdraw(a);
		

	}

}
