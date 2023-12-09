package interfac;

interface Developer {

	void frontenddeveloper();
	 void backenddeveloper();
}

abstract class Webdeveloper implements Developer

{
	public void frontenddeveloper() 
	{
		System.out.println("This is a front end developer");
	}
}
class ProgramDeveloper extends Webdeveloper
{
	
	public void backenddeveloper()
	{
		System.out.println("This is a backend developer");
	}
	
}
class Check
{
	public static void main(String args[])
	{
		ProgramDeveloper d= new ProgramDeveloper();
		d.backenddeveloper();
		d.frontenddeveloper();
		
	}
}


