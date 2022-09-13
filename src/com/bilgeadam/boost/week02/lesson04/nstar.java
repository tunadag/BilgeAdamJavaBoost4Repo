package com.bilgeadam.boost.week02.lesson04;

import java.util.Scanner;

public class nstar {

	public static void main(String[] args) {
		String answer;
		do {
			Scanner sc = new Scanner(System.in);
	        System.out.println("Enter a number :");
	        
	        int n = sc.nextInt();
	        
	        for (int i = 1; i <= n ; i++) {
	            for (int j = 0; j < i ; j++) {
	                System.out.print("*");
	            }
	            
	            System.out.println();
	        
	        }
	        System.out.println("Do you want to do again? (Y/N)");
	        answer = sc.next();
	        sc.close();
			
		} while (answer.equalsIgnoreCase("Y"));
		
		  	
	}
	
}
