package day_6_Assignment;

import java.util.Scanner;

public class PerfectNumber {

	public static void main(String[] args) {

		int num;
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any integer number:");
		num = sc.nextInt();
		printPerfectNum(num);
		
	}

	static void printPerfectNum(int n) {
		int sum = 1;
		for(int i = 2; i < n; i++) {
			if(n % i == 0)
			{
				sum += i; //sum = sum + i
			}
		}
		
		if(sum == n)
			System.out.println(n + " is Perfect Number");
		else
			System.out.println(n + " is Not Perfect Number");
		
		
	}

}
