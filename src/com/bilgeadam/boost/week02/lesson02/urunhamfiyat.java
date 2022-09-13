package com.bilgeadam.boost.week02.lesson02;

import java.util.Scanner;

public class urunhamfiyat {

	public static void main(String[] args) {
		double a,hamfiyat; 
		Scanner sc = new Scanner (System.in);
		System.out.print("Urunun fiyatini giriniz: ");
		a = sc.nextDouble();
		hamfiyat = ((a/1.18)/1.15);
		System.out.println("Urunun ham fiyati: "+hamfiyat);
		sc.close();

	}

}