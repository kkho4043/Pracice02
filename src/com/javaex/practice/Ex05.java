package com.javaex.practice;

import java.util.Scanner;

public class Ex05 {
	public static void main(String[] args) {
		int stature;

		int weightl;
		Scanner sc = new Scanner(System.in);
		System.out.println("Ű�� �����Ը� �Է����ּ���.");
		
		System.out.print("Ű: ");
	
		stature = sc.nextInt();
		
		System.out.print("������: ");
		
		weightl = sc.nextInt();
		
		double Standard_weightl = (stature - 100) * 0.9;  
		
		sc.close();
		
		if(weightl > Standard_weightl) {
			System.out.println("��ü�� �Դϴ�");
		}else if (weightl == Standard_weightl){
			System.out.println("ǥ�� �Դϴ�");
		}else {
			System.out.println("��ü�� �Դϴ�");
		}
		System.out.println("ǥ��ü�� : " + Standard_weightl);
		//15:2 /19:2 /20 :1 / 21:1/ 100:1
		
		
	}
}