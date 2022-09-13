package com.bilgeadam.boost.week02.lesson05;

import java.util.Scanner;

public class CinBurcu {

	public static void main(String[] args) {
		int year;
		String answer;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.print("Enter your birth year: ");
			year = sc.nextInt();
			
			int k= year % 12;
			switch (k) {
			case 11:
				System.out.println("Koyun");
				break;
			case 10:
				System.out.println("At");
				break;
			case 9:
				System.out.println("Yilan");
				break;
			case 8:
				System.out.println("Ejderha");
				break;
			case 7:
				System.out.println("Tavsan");
				break;
			case 6:
				System.out.println("Kaplan");
				break;
			case 5:
				System.out.println("Okuz");
				break;
			case 4:
				System.out.println("Fare");
				break;
			case 3:
				System.out.println("Domuz");
				break;
			case 2:
				System.out.println("Kopek");
				break;
			case 1:
				System.out.println("Horoz");
				break;
			case 0:
				System.out.println("Maymun");
				break;	
			default:
				System.out.println("");
			}
			System.out.println("Tekrar giris yapmak ister misiniz? (Y/N)");
			
			answer = sc.next();
			
						
		}while (answer.equalsIgnoreCase("Y"));
		sc.close();
		
	}
	
}
