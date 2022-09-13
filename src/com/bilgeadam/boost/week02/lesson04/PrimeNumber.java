package com.bilgeadam.boost.week02.lesson04;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		
		int i, count = 0;
				
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number: ");
		
		int n = scan.nextInt();
		scan.close();
		
		if (n<2) {
			System.out.println(n+" is not a prime number");
			
		}
		else {
			for (i=2; i<n; i++) {
			if (n%i==0) {
				count++;
				//break;
			}
			}
			if (count==0) {
				System.out.println(n+" is prime number.");
			}
			else {
				System.out.println(n+" is not prime number.");
			}
					}
					
	}

}
