package com.javaex.practice;

import java.util.Scanner;

public class Ex12 {
	public static void main(String[] args) {
		System.out.println("��µǴ� ������ �Է��ϼ���.");
		System.out.print("��ȣ : ");
		
		Scanner sc = new Scanner(System.in);
		String sign = sc.nextLine( );
		
		
		System.out.print("����1 : ");
		double x  = sc.nextDouble();
		
		sc.nextLine();
		System.out.print("����2 : ");
		double y  = sc.nextDouble();
		sc.close();
		
		
		switch (sign) {
		case "+":
			System.out.println("����� : " + (x + y));
			break;
		case "-":
			System.out.println("����� : " + (x - y));
			break;
		case "*":
			System.out.println("����� : " + (x * y));
			break;
		case "/":
			if(x > y) {
				System.out.println("����� : " + (x / y));
			}else {
				System.out.println("����� : " + (y / x));
			}
			break;

		default:
			System.out.println("����� �� ���� ��ȣ�Դϴ�.");
			break;
		}
		
		
		
		
	}
}
