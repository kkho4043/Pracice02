package com.javaex.practice;

import java.util.Scanner;

public class Ex09 {
	public static void main(String[] args) {
		int x , y;

		Scanner sc = new Scanner(System.in);
		System.out.println("���� 2���� �Է����ּ���.");
		
		System.out.print("ù��° ����: ");
	
		x = sc.nextInt();
		
		System.out.print("2��° ����: ");
		
		y = sc.nextInt();
		
		sc.close();
		
		if(x > y) {
			if(x % y == 0) {
				System.out.println(y + "��(��)" + x +" �� ��� �Դϴ�");
			}else {
				System.out.println(y + "��(��)" + x +" �� ����� �ƴմϴ�");
			}
		}else {
			if(y % x == 0) {
				System.out.println(x + "��(��)" + y +" �� ��� �Դϴ�");
			}else {
				System.out.println(x + "��(��)" + y +" �� ����� �ƴմϴ�");
			}
		}
	}
}
