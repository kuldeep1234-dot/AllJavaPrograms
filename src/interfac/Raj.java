package interfac;

 interface  Raj {
   void add();
  
	}
 
 interface Vinod extends Raj
 {
	 void sub();
 }
 
 class Rahul implements Vinod
 {
	 
 @Override
	public void add() 
	{
		int a=10, b=20,c;
		c=a+b;
		
		System.out.println(c);
	}
	@Override
	public void sub() 
	{
		int a=30,b=20,c;
		c=a-b;
	 System.out.println(c);
	}
	 
class Main{	
	
	 public static void main(String args[])
	 {
	
		 Raj r=new Rahul();
		 r.add();
		 
	 }
}
	
 }


