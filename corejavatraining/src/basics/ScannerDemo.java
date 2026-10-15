package basics;

import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		System.out.println("Please enter your name: ");
		String name = s.nextLine();

		System.out.println("Please enter your subject: ");
		String subject = s.nextLine();

		System.out.println("Please enter age: ");
		int age = s.nextInt(); // reads the
		
	 
		//to read the leftover newline character we add nextLine() method. 
		//s.nextLine();

		System.out.println("Please enter your place: ");
		//String place = s.nextLine();
		String place = s.next();
		System.out.println("You have entered: " + name);
		System.out.println("You have chosen the subject: " + subject);
		System.out.println("Your age is : "+age);
		System.out.println("You have chosen the place: "+place);

	}

}
