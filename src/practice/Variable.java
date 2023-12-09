package practice;

public class Variable {

	int rollno;
	String name;
	
	void display(int a, String b)
	{
		rollno=a;
		name=b;
		
		System.out.println(rollno+" "+name);
	}
	
	public static void main(String[] args) {
		Variable v= new Variable();
		v.display(10, "Kuldeep");

	}

}
