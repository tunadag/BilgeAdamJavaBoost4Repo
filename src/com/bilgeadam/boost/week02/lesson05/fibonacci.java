package com.bilgeadam.boost.week02.lesson05;

import java.util.Scanner;

public class fibonacci {

	public static void main(String[] args) {
		int x=0, y=1;
		int z ;
		
		System.out.println("How many fibonnacis do you need?: ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		System.out.print(x+" "+y);
		for (int i=2; i<n; i++) {
			z = x+y;
			System.out.print(" "+z);
			x = y;
			y = z;
		}
				
		
		sc.close();

	}

}
