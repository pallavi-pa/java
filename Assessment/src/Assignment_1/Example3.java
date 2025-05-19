package Assignment_1;
interface Shape {
	void Calculatearea();
}
class Shapes_2D{
	void show() {
		System.out.println("-------2D-shapes--------");
	}
}
class Square extends Shapes_2D implements Shape{
	void print() {
		System.out.println("Square is a 2D-shape");
	}

	public void Calculatearea() {
		System.out.println("Area of Square:side*side");
	}
}
class circle extends Square{
	void circle_area() {
		System.out.println("Area of circle:3.14*r*r");
	}
}
public class Example3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		circle c=new circle();
		c.show();
		c.print();
		c.Calculatearea();
		c.circle_area();
		

	}

}
