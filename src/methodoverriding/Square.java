package methodoverriding;

public class Square extends Draw {

  @Override
	void shape()
	{
	  super.shape();
		System.out.println("This is a shape of square");
	}
	
	}


