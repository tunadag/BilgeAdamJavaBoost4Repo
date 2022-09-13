package com.bilgeadam.boost.week02.lesson04;

import java.util.Scanner;

public class BasicCalculator2 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter two numbers: ");
		double first = scanner.nextDouble();
		double second = scanner.nextDouble();
		System.out.println("Enter an operator(+, -, *, /) ");
		char operator = scanner.next().charAt(0);
		
		double result;
		result = 0;
		
		switch (operator) {
		case '+':
			result = first + second;
			break;
		case '-':
			result = first - second;
			break;
		case '*':
			result = first * second;
			break;
		case '/':
			result = first / second;
			break;
		default:
			System.out.println("Error! Operator is not correct.");
			break;
						
		}
		
		System.out.println(first + " "+operator +" "+ second + " = " +result);	
		
		
		
		
		scanner.close();

	}

}
