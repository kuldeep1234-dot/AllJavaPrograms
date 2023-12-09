package practice;
import java.util.*;

public class TernaryOperator {

	public static void main(String[] args) {
		int a;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number");
		a=sc.nextInt();
		String result= (a%2==0)?("Even"):("Odd");
		System.out.print(result);

	}

}
