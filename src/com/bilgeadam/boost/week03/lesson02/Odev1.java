package com.bilgeadam.boost.week03.lesson02;

import java.util.Scanner;

public class Odev1 {

	public static void main(String[] args) {
		
		int x,y ;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number: ");
		x = sc.nextInt();
		System.out.println("Enter second number: ");
		y = sc.nextInt();
		
		System.out.println(sumBetweenNumbers(x,y));
		sc.close();
	}
	public static int sumBetweenNumbers(int a, int b) {
		
		if (a<b) {
		int sum = a + sumBetweenNumbers(a+1, b);
		return sum;
		}
		return a;
		
}

}
