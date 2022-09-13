package com.bilgeadam.boost.week02.lesson04;

import java.util.Scanner;

public class BasicCalculator {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        int n,y;
        String secenekler = "Toplama işlemi için 1 \n"
                           +"Çıkarma işlemi için 2 \n"
                           +"Çarpma işlemi içi 3 \n"
                           +"Bölme işlemi için 4'e basınız ";
        System.out.println(secenekler);
        
        System.out.println("İşlem seçiniz");
        String secenek = scanner.next();
        
        switch (secenek) {
            case"1":
                System.out.println("Birinci sayıyı giriniz");
                n = scanner.nextInt();
                System.out.println("İkinci sayıyı giriniz");
                y = scanner.nextInt();
                System.out.println("Sayılarınızın toplamı = "+(n+y));
                break;
            case "2":
                System.out.println("Birinci  sayıyı giriniz");
                n = scanner.nextInt();
                System.out.println("İkinci sayıyı giriniz ");
                y = scanner.nextInt();
                System.out.println("Sayılarınız çıkarıldığınıda = "+(n-y));
                break;
            case "3":
                System.out.println("Birinci  sayıyı giriniz");
                n = scanner.nextInt();
                System.out.println("İkinci sayıyı giriniz ");
                y = scanner.nextInt();
                System.out.println("Sayılarınızın çarpımı = "+(n*y));
                break;
            case "4":
                System.out.println("Birinci sayıyı giriniz");
                n = scanner.nextInt();
                System.out.println("İkinci sayıyı giriniz ");
                y = scanner.nextInt();
                System.out.println("Sayıların bölünme değeri = "+(n/y));
                break;
            default :
                System.out.println("Geçersiz bir değer girdiniz.");
        }
        
        scanner.close();

	}

}
