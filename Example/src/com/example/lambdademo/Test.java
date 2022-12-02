package com.example.lambdademo;

public class Test {
	
	public static void main(String[] args) {
		PerformOperation isOdd = x-> x%2 != 0;
		
		System.out.println("3 is odd?"+isOdd.operation(3));
		System.out.println("8 is odd?"+isOdd.operation(8));
		
		PerformOperation isPrime = x-> {
			boolean flag = false;
			for (int i = 2; i <= x / 2; ++i) {
			      if (x % i == 0) {
			        flag = true;
			        break;
			      }
			    }
			if (!flag)
			      return true;
			    else
			     return false;
			};
	
		System.out.println("7 is prime ?"+isPrime.operation(7));
		System.out.println("29 is prime ?"+isPrime.operation(29));
		
		PerformOperation isPalindrome = x -> {
			int newNum = 0, remainder, temp;
            temp = x;
            
            while(temp != 0){
                  remainder = temp % 10;
                  newNum = newNum*10 + remainder;
                  temp = temp/10;
            }
            
            if (newNum == x)
				 return true;
			else
				return false;
			
		};
		
		System.out.println("454 is palindrome ?"+isPalindrome.operation(454));
		System.out.println("233 is palindrome ?"+isPalindrome.operation(233));
	}

}
