package programsofstring;

public class UpperandLowecase {

	public static void main(String[] args) {
		String a="Ankit";
		String b="KULDEEP";
		String c="   Ankush ";
		String d="";
		
		System.out.println(a.toUpperCase());
		
		System.out.println(b.toLowerCase());
		
		System.out.println(c.trim());
		System.out.println(c.length());
 System.out.println(d.isEmpty());
 System.out.println(d.isBlank());
 System.out.println( b.charAt(2));
 System.out.println(a.indexOf('k'));
 System.out.println(a.equals(b));
 System.out.println(a.replace('A','k'));
	}

}
