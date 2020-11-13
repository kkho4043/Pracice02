package com.javaex.practice;

import java.util.Scanner;

public class Ex08 {
	public static void main(String[] args) {
		int x , y ,z;

		Scanner sc = new Scanner(System.in);
		System.out.println("숫자 3개를 입력해주세요.");
		
		System.out.print("숫자 1: ");
	
		x = sc.nextInt();
		
		System.out.print("숫자 2: ");
		
		y = sc.nextInt();
		
		System.out.print("숫자 3: ");
		
		z = sc.nextInt();
		
		if(x < y && x < z) {
			System.out.println("가장 작은수는 " + x + "입니다");
		}else if(y <= x && y <= z) {
			System.out.println("가장 작은수는 " + y + "입니다");
		}else {
			System.out.println("가장 작은수는 " + z + "입니다");
		}
		sc.close();
	}
}
