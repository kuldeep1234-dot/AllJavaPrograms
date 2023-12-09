package inheritance;
import java.util.*;

public class Student {

int rollno;
String name;
Scanner sc =new Scanner(System.in);
void get()
{
	System.out.println("Enter roll no and name");
	sc.nextInt();
	name=sc.nextLine();
	
}
void display()
{
	System.out.println(rollno+" "+name);
	
}

	}

