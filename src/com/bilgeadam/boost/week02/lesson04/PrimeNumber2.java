package com.bilgeadam.boost.week02.lesson04;

import java.util.Scanner;

public class PrimeNumber2 {

	public static void main(String[] args) {
		int x;
		boolean isprime = true;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number: ");
		x = scan.nextInt();
		scan.close();
		
		if (x<0) System.out.println("Please enter a natural number");
		else if(x==0 || x==1) System.out.println("number is not prime!");
		else if (x>1) {
			for(int i=2; i<x; i++) {
				if(x%i == 0) isprime = false;
			}
		if (isprime) System.out.println("number is prime!");
		else System.out.println("number is not prime!");
		}

	}

}
