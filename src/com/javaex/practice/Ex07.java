package com.javaex.practice;

import java.util.Scanner;

public class Ex07 {
	public static void main(String[] args) {
		int x , y;

		Scanner sc = new Scanner(System.in);
		
		System.out.print("ù��° ���� : ");
	
		x = sc.nextInt();
		
		System.out.print("�ι�° ���� : ");
		
		y = sc.nextInt();
		
		sc.close();
		
		if(x > y) {
			System.out.println("�� : " + x / y + "\n������ : " + x % y );
		}else {
			System.out.println("�� : " + y / x + "\n������ : " + y % x );
		}
		
	}
}
