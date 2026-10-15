package controlflow;

import java.util.Scanner;

//Program to demonstrate the usage of simple if
public class SimpleIfDemo {

	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter your age: ");
		
		int age= sc.nextInt();
		
		/*Simple if
		 * if(age>18) 
		 * { System.out.println("Eligible to Vote"); }
		 */
		if(age>18) {
			System.out.println("You are Eligible to Vote");
		}else {
			System.out.println("Not eligible to vote");
		}
		
		System.out.println("Program completed");
		
	}
	
}
