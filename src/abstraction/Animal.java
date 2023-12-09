package abstraction;

public  abstract class Animal 
{
	Animal()
	{
		System.out.println("All are animals...");
	}
	
	public void sound() {
		
	}
}

class Dog extends Animal
{
	Dog()
	{
		super();
	}
	
	public void sound()
	{
		System.out.println("Dog is barking");
	}
	
	
	
}

class Lion extends Animal
{
	
	Lion() {
		super();
		
	}
	public void sound()
	{
		System.out.println("Lion is roaring ");
	}
}

class Test
{
	public static void main (String args[])
	{
		
		Dog d1= new Dog();
		d1.sound();
		Lion l1= new Lion();
		l1.sound();
	}
}
