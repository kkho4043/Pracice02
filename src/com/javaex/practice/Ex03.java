package com.javaex.practice;

import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		int age;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("���̸� �Է����ּ���");
		System.out.println("���� : ");
		
		age = sc.nextInt();
		if(age > 20) {
			System.out.println("\"1���׷�\"");
		}else {
			System.out.println("\"2���׷�\"");
		}
		System.out.println("�Դϴ�.");
		
		sc.close();
		
		//15:2 /19:2 /20 :1 / 21:1/ 100:1
		
		
	}
}
