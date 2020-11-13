package com.javaex.practice;

import java.util.Scanner;

public class Ex05 {
	public static void main(String[] args) {
		int stature;

		int weightl;
		Scanner sc = new Scanner(System.in);
		System.out.println("키와 몸무게를 입력해주세요.");
		
		System.out.print("키: ");
	
		stature = sc.nextInt();
		
		System.out.print("몸무게: ");
		
		weightl = sc.nextInt();
		
		double Standard_weightl = (stature - 100) * 0.9;  
		
		sc.close();
		
		if(weightl > Standard_weightl) {
			System.out.println("과체중 입니다");
		}else if (weightl == Standard_weightl){
			System.out.println("표준 입니다");
		}else {
			System.out.println("저체중 입니다");
		}
		System.out.println("표준체중 : " + Standard_weightl);
		//15:2 /19:2 /20 :1 / 21:1/ 100:1
		
		
	}
}