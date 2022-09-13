package com.bilgeadam.boost.week03.lesson02;

import java.util.Scanner;

public class Odev2_atm {

	public static void main(String[] args) {
	
	String validUsername = "user";
	String validPassword = "123";
	
	int gh = 3;
	Scanner sc = new Scanner(System.in);
	
	while (gh>0) {
	System.out.println("Enter your username: ");
	String u = sc.nextLine();
	
	System.out.println("Enter your password: ");
	String p = sc.nextLine();
	
	if (u.equals(validUsername) && p.equals(validPassword)) {
		System.out.println("Hosgeldiniz!");
		openMenu();
		break;
	}
	else {
		gh--;
		if (gh>0) {
			System.out.println("Gecersiz kullanici adi veya sifre." + gh + " giris hakkiniz kaldi." );
		}else if (gh == 0) System.out.println("Kartiniz bloke oldu.");
		else break;}}
	
	sc.close();
	
	
	
	}
	private static void openMenu() {
		System.out.println("1-)Para yatirma\n2-)Para cekme\n3-)Bakiye sorgulama\n4-)Cikis yapma");
		int secim;
		Scanner scan = new Scanner(System.in);
		secim = scan.nextInt();
		switch (secim) {
		case 1:
			System.out.println("Para yatirma isleminiz gerceklestiriliyor");
		case 2:
			System.out.println("Cekmek istediginiz tutari giriniz: ");
			double x = scan.nextDouble();
			if (x>1500) System.out.println("Yetersiz bakiye");
			else System.out.println(x +" TL'nizi gule gule harcayin");
			break;
		case 3:
			System.out.println("Bakiye tutariniz: 1500 TL");
			break;
		case 4:
			System.out.println("Cikis yapiliyor.");
			break;
		default:
			System.out.println("Hatalı giriş.!");
		break;
		}
		scan.close();
	}
}
