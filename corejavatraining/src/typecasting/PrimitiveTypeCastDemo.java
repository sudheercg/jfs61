package typecasting;

public class PrimitiveTypeCastDemo {
	
	
	public static void main(String[] args) {
		
		int num = 100;
		
		// implicit typecasting of int into double
		double result = num;
		
		//System.out.println(num);
		//System.out.println(result);
		
		//explicit type casting or narrowing
		double a =99.76;
		int b = (int) a;
		
		System.out.println(a);
		System.out.println(b);
		
		/*Because not all 10-digit positive numbers fit into an int.
		The maximum value of int is 2,147,483,647 (10 digits).
		For example:*/
		//int a = 1234567890;  // Valid (10 digits)
		//int b = 2147483647;  // Valid (maximum int value)
		//int c = 2147483648;  // Error (exceeds int range)
		//int d = 9876543210;  // Error
		
		
		
		
	}

}
