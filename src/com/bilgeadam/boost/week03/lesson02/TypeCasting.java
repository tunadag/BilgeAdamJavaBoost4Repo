package com.bilgeadam.boost.week03.lesson02;

public class TypeCasting {

	public static void main(String[] args) {
		// widening
		int myInt = 9;
		double myDouble = myInt; //Automatic casting; int to double
		
		System.out.println(myInt);
		System.out.println(myDouble);
		
		//narrowing
		double myDouble2= 9.78d;
		int myInt2 = (int) myDouble2;
		
		System.out.println(myDouble2);
		System.out.println(myInt2);
		
		int num = 10;
		System.out.println("The integer value is: " + num);
		
		String data = String.valueOf(num);
		System.out.println("The string value is: " + data);
		
		//int result = data + 5;
		
		//Type conversion from String to int
		
		String data2 = "19";
		System.out.println("The string value is: " + data2);
		
		int num2 = Integer.parseInt(data2); //convert String to in t
		System.out.println("The integer value is: "+num2);
			
		
		
	}

}
