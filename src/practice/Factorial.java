package practice;
import java.util.*;
public class Factorial {

	public static void main(String[] args) {
		int fact=1;
		int a;
		
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number");
		a=sc.nextInt();
		
		for(int i=1;i<=a;i++)
		{
			fact=fact*i;
		}
		System.out.println(fact);

	}

}
