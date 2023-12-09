package practice;
import java.util.*;

public class ArrayofObject {

	int id;
	String name;
	int Salary;
	
	Scanner sc= new Scanner(System.in);
	void getdata() {
		
	System.out.println("Enter the id ,name and salary ");
	id =sc.nextInt();
	sc.nextLine();
	name= sc.nextLine();
     Salary =sc.nextInt();
     
	}
	void display() {
		System.out.println("Id="+id);
		System.out.println("name+"+name);
		System.out.println("Salary"+Salary);
	}
	
	public static void main(String[] args) {
		ArrayofObject arr[]=new ArrayofObject[3];
			for (int i=0; i<3;i++)
			{
				arr[i]= new ArrayofObject();
				arr[i].getdata();
				
			}
			for (int i=0; i<3;i++)
			{
				
				arr[i].display();
				
			}


	}

}
