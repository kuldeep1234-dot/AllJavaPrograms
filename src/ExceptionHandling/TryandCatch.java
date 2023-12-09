package ExceptionHandling;

public class TryandCatch {

	public static void main(String[] args)
	{
		
		int x,y,a=10,b=5,c=5;
		
		try 
		{
			System.out.println("try block execution begin");
			x=a/(b-c);
			System.out.println("try block execution ends");
		}
	
		catch(ArithmeticException e)
		{
			System.out.println("Divide by zero error is occured");
		}

		finally
		{
			System.out.println("Statements always executed");
		}
		
		y=a/(b+c);
		System.out.println("Y="+y);
	}

}
