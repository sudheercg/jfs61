package controlflow;

import java.util.Scanner;

public class EvenOddChecker {

	public static void main(String[] args) {

		//Create scanner object
		Scanner sc = new Scanner(System.in);

		//prompt the user
		System.out.println("Please enter the number:");
         
		//read the input
		int num = sc.nextInt();
		
		//check the input
		if(num%2==0) {
			System.out.println("Even");
		}
		else {
			System.out.println("Odd");
		}
		
		sc.close(); 
		
			
			
		}
		
	
	}


