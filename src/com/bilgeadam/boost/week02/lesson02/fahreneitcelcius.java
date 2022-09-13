package com.bilgeadam.boost.week02.lesson02;

import java.util.Scanner;

public class fahreneitcelcius {

	public static void main(String[] args) {
		double f,c;
		Scanner sc = new Scanner (System.in);
		System.out.print("Fahreneit derecesini giriniz: ");
		f = sc.nextDouble();
		c = ((f-32)/1.8);
		System.out.print("Celcius derecesi: "+c);
		sc.close();
		
	}

}
