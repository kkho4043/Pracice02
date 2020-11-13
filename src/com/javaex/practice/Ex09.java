package com.javaex.practice;

import java.util.Scanner;

public class Ex09 {
	public static void main(String[] args) {
		int x , y;

		Scanner sc = new Scanner(System.in);
		System.out.println("숫자 2개를 입력해주세요.");
		
		System.out.print("첫번째 숫자: ");
	
		x = sc.nextInt();
		
		System.out.print("2번째 숫자: ");
		
		y = sc.nextInt();
		
		sc.close();
		
		if(x > y) {
			if(x % y == 0) {
				System.out.println(y + "는(은)" + x +" 의 약수 입니다");
			}else {
				System.out.println(y + "는(은)" + x +" 의 약수가 아닙니다");
			}
		}else {
			if(y % x == 0) {
				System.out.println(x + "는(은)" + y +" 의 약수 입니다");
			}else {
				System.out.println(x + "는(은)" + y +" 의 약수가 아닙니다");
			}
		}
	}
}
