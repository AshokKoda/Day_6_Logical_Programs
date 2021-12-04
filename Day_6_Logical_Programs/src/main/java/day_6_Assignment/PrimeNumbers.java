package day_6_Assignment;

import java.util.Scanner;

public class PrimeNumbers {

	public static void main(String[] args) {
		
		int num;
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number: ");
		num = sc.nextInt();
		CheckPrimeNums(num);

	}

	private static void CheckPrimeNums(int n) {
		
		int count = 1;
		for(int i = 2; i <= n; i++) {
			if(n % i == 0)
				count++;
		}
		
		if(count == 2)
			System.out.println(n + " is a prime number.");
		else
			System.out.println(n + " is not a prime number.");
	}

}
