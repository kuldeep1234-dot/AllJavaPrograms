package practice;
import java.util.*;
public class Userdefined {
	  
	int roll;
	String name;
	float marks;
	Scanner sc= new Scanner(System.in);
	
	void input()
	{
		System.out.println("Enter roll no , name and marks");
		roll=sc.nextInt();
		name=sc.next();
		marks= sc.nextFloat();	
		
	}
	void display()
	{
		System.out.println("Roll no " +roll);
		System.out.println("Name " +name);
		System.out.println("Marks "+marks);
	}

	public static void main(String[] args) {
	
   Userdefined r2= new Userdefined();
    r2.input();
    r2.display();
    
	}

}
