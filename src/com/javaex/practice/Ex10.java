package com.javaex.practice;

import java.util.Scanner;

public class Ex10 {
	public static void main(String[] args) {
		int i;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("���(����)�� �Է����ּ���");
		System.out.print("��� : ");
		
		i = sc.nextInt();
		
		int num = i % 3;
		if(i < 0) {
			System.out.println("�߸��Է��ϼ˽��ϴ�.");
		}else {
			if(num == 0) {
				System.out.println("A���Դϴ�");
			}else if(num == 1){
				System.out.println("B���Դϴ�");
			}else {
				System.out.println("C���Դϴ�");
			}
		}
		
		sc.close();
	}
}
