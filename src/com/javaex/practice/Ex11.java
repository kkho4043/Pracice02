package com.javaex.practice;

import java.util.Scanner;

public class Ex11 {
	public static void main(String[] args) {
		System.out.println("���ĺ� 1����(�ҹ���)�� �Է��ϼ���");
		System.out.print("���ĺ� : ");
		Scanner sc = new Scanner(System.in);
		String ch = sc.nextLine();
		
		switch (ch) {
		case "a":
		case "e":
		case "i":
		case "o":
		case "u":
			System.out.println("�����Դϴ�");
			break;

		default:
			System.out.println("�����Դϴ�");
			break;
		}
		sc.close();
	}
}
