package com.javaex.practice;

import java.util.Scanner;

public class Ex08 {
	public static void main(String[] args) {
		int x , y ,z;

		Scanner sc = new Scanner(System.in);
		System.out.println("���� 3���� �Է����ּ���.");
		
		System.out.print("���� 1: ");
	
		x = sc.nextInt();
		
		System.out.print("���� 2: ");
		
		y = sc.nextInt();
		
		System.out.print("���� 3: ");
		
		z = sc.nextInt();
		
		if(x < y && x < z) {
			System.out.println("���� �������� " + x + "�Դϴ�");
		}else if(y <= x && y <= z) {
			System.out.println("���� �������� " + y + "�Դϴ�");
		}else {
			System.out.println("���� �������� " + z + "�Դϴ�");
		}
		sc.close();
	}
}
