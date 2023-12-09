package interfac;

interface Seller 
{
 
	int amount=5;
	void purchase();
	
	
}
	
class Customer implements Seller
{
	@Override
	
	public void purchase()
	{
		 System.out.println("Raj wants"+amount+"kg of rice");
	}
}

class Recived
{
	public static void main(String[] args) 
	{
		Seller s= new Customer();
		s.purchase();
		
	}
}
	

	

