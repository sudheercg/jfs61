package typecasting;

public class FirstSet {
	public static void main(String[] args) {
		//Write a Java program to store a double value and convert it into an int.
		//Display both values.
		double a =99.76;
		int b = (int) a;
		
		System.out.println(a);
		System.out.println(b);
		
		//Write a Java program to store an int value and assign it to a
		//double variable. Display both values.
		
		int x=100;
		double y= x;
		System.out.println(x);
		System.out.println(y);

		//Write a Java program to convert a float value into a long. Display both values.
		float f =23.2f;
		long l = (long)f;
		
		
		//Here, precision may be lost, but Java allows implicit conversion.
		long l1 = 123456789123456789L;
		float f1 = l1; // Implicit casting allowed
		
		System.out.println(l1);
		System.out.println(f1);
		
		/*Because not all 10-digit positive numbers fit into an int.
		The maximum value of int is 2,147,483,647 (10 digits).
		For example:*/
		//int a = 1234567890;  // Valid (10 digits)
		//int b = 2147483647;  // Valid (maximum int value)
		//int c = 2147483648;  // Error (exceeds int range)
		//int d = 9876543210;  // Error
		
		
		/*
				Data type	Suffix	Mandatory?
				float	f or F	Mandatory for decimal floating-point literals
				double	d or D	Optional
				long	l or L	Optional, if the integer literal fits in int
		
		*/
		
	}

}
