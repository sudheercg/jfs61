package controlflow;

import java.util.Scanner;

public class SwitchCaseDemo02 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the name: ");

		String day = scanner.nextLine();

		day = day.toLowerCase();

		switch (day) {

		case "monday":
			System.out.println("Day Number: 1");
			break;
		case "tuesday":
			System.out.println("Day Number: 2");
			break;

		case "wednesday":
			System.out.println("Day Number: 3");
			break;

		case "thrusday":
			System.out.println("Day Number: 4");
			break;

		case "friday":
			System.out.println("Day Number: 5");
			break;

		case "saturday":
			System.out.println("Day Number: 6");
			break;
		case "sunday":
			System.out.println("Day Number: 7");
			break;
		default:
			System.out.println("Invalid day namre");

		}

	}

}
