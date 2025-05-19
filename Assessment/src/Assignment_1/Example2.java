package Assignment_1;
interface Shape3D {
    void calculateVolume();
}

interface AdvancedShape3D extends Shape3D {
    void calculateSurfaceArea();
}

class Cube implements AdvancedShape3D {
	void print_details() {
		System.out.println("--------Cube details--------");
	}
    
   public void calculateVolume() {
        System.out.println("Formula for Volume of cube is:side*side*side");
    }

    public void calculateSurfaceArea() {
        System.out.println("Formula for Surfacearea of cube is:6*a*a");
    }
}

class Sphere  implements AdvancedShape3D {
	void show() {
		System.out.println("--------Sphere details---------");
	}

    public void calculateVolume() {
        System.out.println("Volume of Sphere:4*3.14*r*r" );
    }

    public void calculateSurfaceArea() {
        System.out.println("Surfacearea of Sphere is:4/3*3.14*r*r*r");
    }
}

public class Example2 {
    public static void main(String[] args) {
        Cube cube = new Cube();
        Sphere sphere = new Sphere();
         cube.print_details();
         cube.calculateVolume();
         cube.calculateSurfaceArea();
         sphere.show();
         sphere.calculateVolume();
         sphere.calculateSurfaceArea();
         
         
    }
}
