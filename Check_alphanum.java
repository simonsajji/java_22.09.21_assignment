package java_methods;

import java.util.Scanner;

public class Check_alphanum {
	public static void main(String args[]) {
		
		//  Exercise 1: Check if the string contains only alpha-numeric characters using methods
		
		Scanner sc=new Scanner(System.in);
		String a=sc.nextLine();
		sc.close();
		boolean h=checkalphanum(a);
		
		System.out.println(h);
		
		
		
	}
	public static boolean checkalphanum(String a) {
		if(a.matches("[a-zA-Z0-9]+")) {
			System.out.println("It is an Aplha-numeric String");
			return true;
			
		}
		else {
			System.out.println("It is not an Alphanumeric String");
			return false;
			
		}
		
	}
		
		
		
		
		

		
	}
	
	

