package com.bilgeadam.boost.week02.lesson02;

import java.util.Scanner;

public class aritmetikalistirma {

	public static void main(String[] args) {
		double a, b;
		Scanner scan = new Scanner(System.in);
		System.out.print("Please enter a number: ");
		a = scan.nextInt();
		System.out.print("Please again, enter a number: ");
		b = scan.nextInt();
		System.out.println("ilk sayinin digerine bolumu: "+ a/b);
		System.out.println("Bolumden kalan: "+ a%b);
		scan.close();
		
	}

}