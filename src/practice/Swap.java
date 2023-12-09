package practice;
import java.util.*;

public class Swap {

	public static void main(String[] args) {
		int temp, a, b;
		
		Scanner sc= new Scanner(System.in);
		System.out.println(" Enter the value of a, b ");
		a= sc.nextInt();
		b= sc.nextInt();
		
		 temp=a;
		 a=b;
		 b=temp;
		 System.out.println("After swapping value of a  "+a+ "and value ofb "+b );
		 System.out.println(a+"  "+b);
		
		

	}

}
