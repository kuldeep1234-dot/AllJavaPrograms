package interfac;
import java.util.*;

interface  Client {
	void input();
	void output();
	}

class Raju implements Client 
{
	String Username;
	int salary;
	public void input()
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the input username");
		Username= sc.nextLine();
		System.out.println("Enter the salary");
		salary =sc.nextInt();
	}
	public void output()
	{
		System.out.println(Username+""+salary);
	}
	
	class Test
	{
		public static void main(String args[])
		{
	     
			Raju r1= new Raju();
			r1.output();
	      
	      
		}
	}
	
}
