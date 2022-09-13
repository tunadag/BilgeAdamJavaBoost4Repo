package com.bilgeadam.boost.week03.lesson02;

import java.util.Scanner;

public class GradeRanker {

	public static void main(String[] args) {
		
		System.out.println("Puan giriniz: ");
		Scanner sc = new Scanner(System.in);
		double p = sc.nextDouble();
		sc.close();
		gradeRanker(p);

	}
	public static void gradeRanker(double x) {
		if (x>=200.5) System.out.println("Rank:" + " A");
		else if (x>122.4) System.out.println("Rank:" + " B");
		else System.out.println("Rank:" + " C");
				
	}
	
	

}
