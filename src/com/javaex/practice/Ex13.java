package com.javaex.practice;

import java.util.Scanner;

public class Ex13 {
	public static void main(String[] args) {
	

		Scanner sc = new Scanner(System.in);
		
		System.out.println("���ڸ� �Է����ּ���.");
		System.out.print("���� : ");
	
		double x = sc.nextDouble();
		double end;
		if(x > 0) {
			end = 7 * x + 2;
		}else {
			end = (x * x * x) - 9 * x + 2;
		}
		System.out.println("������� " + end);
		sc.close();
	}
}
