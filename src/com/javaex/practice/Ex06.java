package com.javaex.practice;

import java.util.Scanner;

public class Ex06 {
	public static void main(String[] args) {
		int x , y;

		Scanner sc = new Scanner(System.in);
		System.out.println("���� 2���� �Է����ּ���.");
		
		System.out.print("���� 1: ");
	
		x = sc.nextInt();
		
		System.out.print("���� 2: ");
		
		y = sc.nextInt();
		
		sc.close();
		
		if(x > y) {
			System.out.println("ū�� : " + x + "\t ������ : " + y );
		}else {
			System.out.println("ū�� : " + y + "\t ������ : " + x );
		}
		
	}
}
