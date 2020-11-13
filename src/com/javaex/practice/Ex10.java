package com.javaex.practice;

import java.util.Scanner;

public class Ex10 {
	public static void main(String[] args) {
		int i;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("사번(정수)를 입력해주세요");
		System.out.print("사번 : ");
		
		i = sc.nextInt();
		
		int num = i % 3;
		if(i < 0) {
			System.out.println("잘못입력하셧습니다.");
		}else {
			if(num == 0) {
				System.out.println("A팁입니다");
			}else if(num == 1){
				System.out.println("B팁입니다");
			}else {
				System.out.println("C팁입니다");
			}
		}
		
		sc.close();
	}
}
