package com.bilgeadam.boost.week02.lesson02;

import java.util.Scanner;

public class isimalistirma {

	public static void main(String[] args) {
		String a;
		Scanner scan = new Scanner (System.in);
		System.out.println("Isminizi giriniz: ");
		a = scan.nextLine();
		System.out.println("Merhaba "+a);
		scan.close();

	}

}
