package com.bilgeadam.boost.week02.lesson04;

import java.util.Scanner;

public class GradeCalculation {

	public static void main(String[] args) {
		
		int midterm1, midterm2, finalgrade;
		
		double grade;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter midterm 1 grade: ");
		midterm1 = scanner.nextInt();
		System.out.println("Enter midterm 2 grade: ");
		midterm2 = scanner.nextInt();
		System.out.println("Enter final grade: ");
		finalgrade = scanner.nextInt();
		
		grade = (midterm1 + midterm2)/2*0.4 + (finalgrade*0.6);
		
		if (grade < 50) {
			System.out.println("FF");
		}
		else if (grade < 60) {
			System.out.println("DD");
		}
		else if (grade < 70) {
			System.out.println("CC");
		}
		else if (grade < 80) {
			System.out.println("BB");
		}
		else {System.out.println("AA");
		}
		
				
		scanner.close();

	}

}
