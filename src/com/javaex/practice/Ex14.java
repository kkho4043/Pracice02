package com.javaex.practice;

import java.util.Scanner;

public class Ex14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("���͸� �Է����ּ���.");
		System.out.print("����: ");
	
		double x = sc.nextDouble();
		

		double Income_tax;
		
		if(x >= 0 && x <= 1000) {
			Income_tax = x * 0.09;
		}else if(x > 1000 && x <= 4000) {
			Income_tax = (1000 * 0.09) + 0.18 * (x - 1000);
		}else if(x > 4000 && x < 8000) {
			Income_tax = (1000 * 0.09) + (3000 * 0.18) + 0.27 * (x - 4000);
		}else if(x >= 8000) {
			Income_tax = (1000 * 0.09) + (0.18 * 3000) + (0.27 * 4000) + 0.36 * (x - 8000);
		}else {
			Income_tax = -1;
		}
		
		if(Income_tax == -1) {
			System.out.println("�߸� �Է��߽��ϴ�");
		}else {
			System.out.println("�ҵ漼�� " + Income_tax + " �Դϴ�");
		}
		sc.close();
	}

}
