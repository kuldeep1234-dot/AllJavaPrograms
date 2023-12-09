package practice;

public class Methods1 {

    void add(int a, int b) 
    
    {
    	int c=a+b;
    	System.out.println(c);
    }
    void sub(int a, int b)
   {
   	int c= a-b;
    	System.out.println(c);
   }
    void mul(int a, int b)
    {
    	int c= a*b;
    	
    	System.out.println(c);
    }
	
	public static void main(String[] args) {
		Methods1 r= new Methods1();
		r.add(10, 20);
		r.sub(30, 40);
		r.mul(10, 20);
		
		

}

}
