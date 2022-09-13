package com.bilgeadam.boost.week02.lesson05;

import java.util.Scanner;

public class RegisterLogin {

	public static void main(String[] args) {
			
		String username ="";
		String password ="";
		
		do {
			System.out.print("1- Register\n2- Login");
			Scanner scan = new Scanner(System.in);
			int key = scan.nextInt();
		
			switch (key) {
			case 1:
				System.out.println("Welcome to register page!\nPlease enter a username: ");
				username = scan.nextLine();
				System.out.println("Please enter a password: ");
				password = scan.nextLine();
				System.out.println("Your account is created.");
			break;
			case 2:
				System.out.println("Enter your username: ");
				String userNameEntry = scan.nextLine();
				System.out.println("Enter your password: ");
				String passwordEntry = scan.nextLine();
			
				if (userNameEntry.equals(username) && passwordEntry.equals(password)) 
					System.out.println("Welcome");
				else System.out.println("Wrong username or password");
			break;
			default:
			break;
		}
		}while (true);
		
				
		}
		
		

	}


