package com.example3;

import java.util.Scanner;

public class Example3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		Integer a = Integer.parseInt(scanner.next());
		Integer b = Integer.parseInt(scanner.next());
		Integer c = Integer.parseInt(scanner.next());
		
		scanner.close();
		double discriminant = (b * b ) - 4 * a * c ;
		double root1;
		double root2;
		
		if (discriminant == 0) {
			root1 = (-b + Math.sqrt(discriminant))/ (2 * a);
			System.out.println("The root is " + root1 );
		} else if (discriminant > 0) {
			root1 = (-b - Math.sqrt(discriminant))/ (2 * a);
			root2 = (-b + Math.sqrt(discriminant))/ (2 * a);
			System.out.println("The root are " + root1 + " and " + root2 );
		} else {
			System.out.println("The equation does not have real roots" );
		}		
	}

}
