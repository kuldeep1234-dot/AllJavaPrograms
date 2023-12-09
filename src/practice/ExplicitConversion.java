package practice;

public class ExplicitConversion {

	public static void main(String[] args) {
		double d=166.66;
		float f=(float)d;
		long l=(long)f;
		int i= (int)l;
		
		System.out.println("Before conversion  "+d);
		System.out.println("After conversion  "+f);
		System.out.println("After conversion  "+l);
		System.out.println("After conversion  "+i);

	}

}
