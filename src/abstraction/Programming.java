package abstraction;

public abstract class Programming {
	
	public abstract void Developer();
	{
		
	}

	}

class HTML extends Programming
{
	public void Developer()
	{
		System.out.println("This is a html developer");
	}
}

class PHP extends Programming
{
	public void Developer()
	{
		System.out.println("This is a PHP developer");
	}
}

class Main
{
	public static void main(String args[])
	{
		Programming p= new HTML();
		p.Developer();
		Programming p1= new PHP();
		p1.Developer();
	}
}
