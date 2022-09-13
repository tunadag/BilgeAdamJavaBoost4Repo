package com.bilgeadam.boost.week02.lesson03;

import java.util.Scanner;

public class PozitifNegatif {

	public static void main(String[] args) {
		double x;
		System.out.print("Bir sayi giriniz: ");
		Scanner sc = new Scanner(System.in);
		x = sc.nextDouble();
		sc.close();
		if (x>0) {
			System.out.print("Sayi pozitif");
		}else if (x == 0) {
				System.out.print("Sayi notr");
		}else {
			System.out.print("Sayi negatif");
			}
				
			
		}
	}
