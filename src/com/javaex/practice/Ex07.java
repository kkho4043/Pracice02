package com.javaex.practice;

import java.util.Scanner;

public class Ex07 {
	public static void main(String[] args) {
		int x , y;

		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫번째 숫자 : ");
	
		x = sc.nextInt();
		
		System.out.print("두번째 숫자 : ");
		
		y = sc.nextInt();
		
		sc.close();
		
		if(x > y) {
			System.out.println("몫 : " + x / y + "\n나머지 : " + x % y );
		}else {
			System.out.println("몫 : " + y / x + "\n나머지 : " + y % x );
		}
		
	}
}
