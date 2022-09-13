package com.bilgeadam.boost.week02.lesson05;

import java.util.Scanner;

public class ObebObek {

	public static void main(String[] args) {
		int say1, say2,max,min,x;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter first number: ");
		say1 = sc.nextInt();
		System.out.print("Enter second number: ");
		say2 = sc.nextInt();
		sc.close();
		if (say1>say2) {
			max = say1;
			min = say2;
		}
		else {max = say2;
				min = say1;}
		
		
		for (x=min; x>0; x--) {
			if(min%x == 0 && max%x==0) {
				System.out.println("OBEB: "+x);
				System.out.println("OKEK: "+ max*min/x);
				break;}
		}
			
						
		}
}
		
		
	
		




