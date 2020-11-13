package com.javaex.practice;

import java.util.Scanner;

public class Ex13 {
	public static void main(String[] args) {
	

		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자를 입력해주세요.");
		System.out.print("숫자 : ");
	
		double x = sc.nextDouble();
		double end;
		if(x > 0) {
			end = 7 * x + 2;
		}else {
			end = (x * x * x) - 9 * x + 2;
		}
		System.out.println("계산결과는 " + end);
		sc.close();
	}
}
