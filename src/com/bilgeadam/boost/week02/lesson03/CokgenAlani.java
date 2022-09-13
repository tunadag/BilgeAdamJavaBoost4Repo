package com.bilgeadam.boost.week02.lesson03;

import java.util.Scanner;
		
public class CokgenAlani {
	static final double PI = 3.14;
	public static void main (String[] args) {
		int n;
		double s;
		double alan;
		
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Kenar sayisini giriniz: ");
		n = sc.nextInt();
		System.out.print("Kenar uzunlugunu giriniz: ");
		s = sc.nextDouble();
		alan = (n*(Math.pow(s, 2)))/(4*(Math.tan(PI/n)));
		sc.close();
		System.out.print(alan);
		}
}	
