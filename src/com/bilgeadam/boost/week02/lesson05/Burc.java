package com.bilgeadam.boost.week02.lesson05;

import java.util.Scanner;

public class Burc {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Dogum tarihinizi gun olarak giriniz: ");
		int gun = sc.nextInt();
		System.out.print("Dogum tarihinizin ayini sayi olarak giriniz: ");
		int ay = sc.nextInt();
		if (gun<=31 && ay<=12) {
			if (ay == 1) {
				if (gun >= 22) {
					System.out.print("Kova");
				}else System.out.print("Oglak");
			}else if (ay == 2) {
				if (gun >= 20) {
					System.out.print("Balik");
				}else System.out.print("Kova");
			}else if (ay ==3) {
				if (gun >= 21) {
					System.out.print("Koc");
				}else System.out.print("Balik");
			}else if (ay ==4) {
				if (gun >= 21) {
					System.out.print("Boga");
				}else System.out.print("Koc");
			}else if (ay ==5) {
				if (gun >= 22) {
					System.out.print("Ikizler");
				}else System.out.print("Boga");
			}else if (ay ==6) {
				if (gun >= 23) {
					System.out.print("Yengec");
				}else System.out.print("Ikizler");
			}else if (ay ==7) {
				if (gun >= 23) {
					System.out.print("Aslan");
				}else System.out.print("Yengec");
		}
		
		
		}else {System.out.println("Gun veya ay degerini yanlis girdiniz!");
		}			
		sc.close();

	}

}
