package programsofstring;

public class ReverseofString {

	public static void main(String[] args) {
		//StringBuffer r= new StringBuffer("Kuldeep");
		//System.out.println(r.reverse());
		//System.out.println(r.length());
		
		//StringBuilder r1=new StringBuilder("hat");
		//System.out.println(r1.reverse());
		
		String a= "Kuldeep";
		String b="";
		int l,i;
		 l=a.length();
		
		for( i=l-1;i>=0;i--)
		{
			b=b+a.charAt(i);
		}
System.out.println(b);
	}

}
