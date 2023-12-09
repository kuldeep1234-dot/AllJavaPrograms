package practice;
import java.util.*;
public class Greaternum {

	public static void main(String[] args) {
		int a, b;
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter first number and second number");
		a= sc.nextInt();
		b=sc.nextInt();
		
		if(a>b)
		{
			System.out.println("first number  is greater");
		}
		else
		{
			System.out.println("second number  is greater");
		}
		
		

	}

}
