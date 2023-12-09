package inheritance;

public class Kuldeep extends SimpleInheritance {
	
	void display()
	
	{
		
		roll=20;
		marks=30;
		{
			System.out.println(roll+" "+marks);
		}
	}
	
	

	public static void main(String[] args) {
	   Kuldeep r= new Kuldeep();
	   r.input();
	   r.display();
 
	}

}
