package com.javaex.practice;

import java.util.Scanner;

public class Ex06 {
	public static void main(String[] args) {
		int x , y;

		Scanner sc = new Scanner(System.in);
		System.out.println("숫자 2개를 입력해주세요.");
		
		System.out.print("숫자 1: ");
	
		x = sc.nextInt();
		
		System.out.print("숫자 2: ");
		
		y = sc.nextInt();
		
		sc.close();
		
		if(x > y) {
			System.out.println("큰수 : " + x + "\t 작은수 : " + y );
		}else {
			System.out.println("큰수 : " + y + "\t 작은수 : " + x );
		}
		
	}
}
