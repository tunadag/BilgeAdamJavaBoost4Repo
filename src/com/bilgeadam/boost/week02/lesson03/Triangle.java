package com.bilgeadam.boost.week02.lesson03;

import java.util.Scanner;

public class Triangle {
// c^2 = a^2 + b^2 
	public static void main(String[] args) {
		double aci1, aci2, aci3, kenar1, kenar2, kenar3;
		Scanner sc = new Scanner(System.in);		
		System.out.println("Ucgenin birinci acisini giriniz: ");
		aci1 = sc.nextDouble();
		System.out.println("Ucgenin ikinci acisini giriniz: ");
		aci2 = sc.nextDouble();
		System.out.println("Ucgenin birinci kenar uzunlugunu giriniz: ");
		kenar1 = sc.nextDouble();
		System.out.println("Ucgenin ikinci kenar uzunlugunu giriniz: ");
		kenar2 = sc.nextDouble();
		aci3 = (180-(aci1+aci2));
		// Math.pow(kenar1, 2) , kenar1*kenar1
		kenar3 = ((kenar1*kenar1) + (kenar2*kenar2)) - (2*kenar1*kenar2*(Math.cos(aci3)));
		System.out.println("Üçgenin ucuncu acisi: " + aci3);
		System.out.println("Üçgenin ucuncu kenar uzunlugu: "+ kenar3);
		sc.close();
	}

}
