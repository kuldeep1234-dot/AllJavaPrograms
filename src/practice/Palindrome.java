package practice;
import java.util.*;

public class Palindrome {

	public static void main(String[] args) {
		int num;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number");
		 num= sc.nextInt();
		
		int temp= num;
		int rev=0;
		int rem;
		while(num>0)
		{
			rem =num%10;
			rev = rev*10+rem;
			num= num/10;
		}
		if(temp==rev)
		{
			System.out.println(temp+" is palindrome");
		}
		else
		{
			System.out.println(temp+" is not palindrome");
		}
		

	}

}
