package com.bilgeadam.boost.week03.lesson02;

import java.util.Random;
import java.util.Scanner;

public class TasKagitMakas {
	
		
	public static void main(String[] args) {
		int yourScore = 0;
		int computerScore = 0;	
		String x = "Tas";
		String y = "Kagit";
		String z = "Makas";
		Scanner sc = new Scanner(System.in);		
		while (yourScore <3 && computerScore <3) {
		
		System.out.println("Seciminizi yapiniz: 1- Tas, 2- Kagit, 3-Makas ");
		
		int n = sc.nextInt();
		
		if (n==1) System.out.println("Siz: "+ x );
		else if (n==2) System.out.println("Siz: " + y);
		else if (n==3) System.out.println("Siz: "+ z);
		else {System.out.println("Hatali giris!");
		break;
		}
		
		
		Random rand = new Random();
		int c = rand.nextInt(3)+1;
		if (c==1) System.out.println("Bilgisayar: "+ x );
		else if (c==2) System.out.println("Bilgisayar: " + y);
		else if (c==3) System.out.println("Bilgisayar: "+ z);
				
		
		if (n==c) {
			System.out.println("Berabere");
			System.out.println("SKOR [" + "SIZ: "+yourScore+ " - " +computerScore+" BILGISAYAR]");
		}
		else if (n==1 && c==2) {
			computerScore++;
			System.out.println("Bilgisayar kazandi!");
			System.out.println("SKOR [" + "SIZ: "+yourScore+ " - " +computerScore+" BILGISAYAR]");
		}
		else if (n==1 && c==3) {
			yourScore++;
			System.out.println("Siz kazandiniz!");
			System.out.println("SKOR [" + "SIZ: "+yourScore+ " - " +computerScore+" BILGISAYAR]");
		}
		else if (n==2 && c==3) {
			computerScore++;
			System.out.println("Bilgisayar kazandi!");
			System.out.println("SKOR [" + "SIZ: "+yourScore+ " - " +computerScore+" BILGISAYAR]");
		}
		else if (n==2 && c==1) {
			yourScore++;
			System.out.println("Siz kazandiniz!");
			System.out.println("SKOR [" + "SIZ: "+yourScore+ " - " +computerScore+" BILGISAYAR]");
		}
		else if (n==3 && c==1) {
			computerScore++;
			System.out.println("Bilgisayar kazandi!");
			System.out.println("SKOR [" + "SIZ: "+yourScore+ " - " +computerScore+" BILGISAYAR]");
		}
		else if (n==3 && c==2) {
			yourScore++;
			System.out.println("Siz kazandiniz!");
			System.out.println("SKOR [" + "SIZ: "+yourScore+ " - " +computerScore+" BILGISAYAR]");
		}
		}
		sc.close();
	
	}
	
}
		
		
			

				
						
		
		


	

