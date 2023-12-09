package interfac;

interface A 
{
	void show();
}

interface B 
{
	void Disp();
	
}

class Multiple implements A,B
{
	public void Disp()
	
	{
		System.out.println("This is  B");
	}
	
	public void show()
	{
		System.out.println("This is A method");
	}
	
	
	public static void main(String args[])
	{
		Multiple a= new Multiple();
		a.show();
		a.Disp();
	}
}

