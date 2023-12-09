package inheritance;

import java.util.*;
public class Emplyoees extends Student{
	
	String Destination;
	int salary;
	Scanner sc =new Scanner (System.in);
	
	void get()
	{
		System.out.println("Enter Salary and Destination");
		Destination =sc.nextLine();
	     salary= sc.nextInt();
	}
	void display() {
		System.out.println(Destination+""+salary);
	}
	
	



	}


