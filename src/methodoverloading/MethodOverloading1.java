package methodoverloading;

public class MethodOverloading1 {

	
	float l,z,r,s;
	 void area(float a, float b) 
	 {
		l=a;
		z=b;
		 
		System.out.println(" Area of rectangle = "  +l*z); 
	 }
	 void area(int x , int y)
	 { 
		 r=x;
		 s=y;
		 
		System.out.println("Area of circle  "  +3.14*r*s); 
	 }
	
	public static void main(String[] args) {
		MethodOverloading1 m= new MethodOverloading1();
		m.area(20, 30);
		m.area(50, 60);

	}

}
