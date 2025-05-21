package day5;
class movie{
	void genre() {
		System.out.println("action or thiller");
	}
}
class hit extends movie{
	void action() {
		System.out.println("investigation");
	}
}
class hero extends hit{
	void name() {
		System.out.println("nani");
	}
}
class heroine extends hit{
	void acting() {
		System.out.println("excellient");
	}
	
}

public class hybrid_ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		hero h=new hero();
		h.name();
		h.genre();
		h.action();
		heroine h1=new heroine();
		h1.acting();

	}

}
