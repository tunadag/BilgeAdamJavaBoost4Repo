package com.bilgeadam.boost.week03.lesson02;

import java.util.Scanner;

public class EvenMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Bir sayi giriniz:");
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		sc.close();
		ciftSayi(x);
		System.out.println(ciftSayi(x));

	}
	public static boolean ciftSayi(int x){
		if (x%2 == 0)
			return true;
		return false;
	}

}
