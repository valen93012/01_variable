package edu.kh.variable.ex2;

import java.util.Scanner;

public class ScannerExample5 {

	public static void main(String[] args) {
		
		/*
		 * 
		 * 
		 * 키보드로 문자 하나를 입력 받아 그 문자의 유니코드를 출력하세요
		 * ex.
		 * 문자 : A
		 * A unicode : 65
		 * 
		 * 
		 */
		
		
		Scanner sc = new Scanner(System.in);
	
		System.out.print("문자 : ");
		
		//System.out.print("문자 : ");
		//char result = input.charAt(0); // 안녕하세요
		
		char result2 = sc.next().charAt(0);
		
		System.out.printf("%s unicode : %d", result2, (int)result2); 
		
	

}
