package com.bilgeadam.boost.week02.lesson05;

import java.util.Scanner;

public class NStar2 {

	public static void main(String[] args) {
		
		System.out.println("How many lines of star do you want?:");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.print("*");
		for (int i=1; i<=n*2; i=i+2) {
			for (int j=2; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		sc.close();

	}

}
