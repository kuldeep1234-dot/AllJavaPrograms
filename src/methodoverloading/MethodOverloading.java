package methodoverloading;

public class MethodOverloading {

	void add()
	{
		int a=30, b=20,c;
		c=a+b;
		System.out.println(c);
		
		
	}
	void add( int x, int y)
	{
		int c= x+y;
		System.out.println(c);
	}
	
	
	
	public static void main(String[] args) {
		MethodOverloading r=new MethodOverloading();
		
		r.add(10, 20);
		r.add();
		

	}

}
