package edu.kh.variable.ex1;

public class CastingPractice1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * 선언 및 초기화된 5개의
		 * 
		 * 
		 */
		int iNum1 = 10;
		int iNum2 = 4;
		float fNum = 3.0f;
		double dNum = 2.5;
		char ch = 'A'; 
		
		System.out.println( iNum1  / iNum2 ); // 2 
		System.out.println((int)dNum); // 2 
		
		System.out.println( iNum2 * dNum ); // 10.0 
		System.out.println( (double)iNum1 ); // 10.0
		
		System.out.println( (double)iNum1 / iNum2 ); //2.5
		System.out.println( dNum ); // 2 
		
		System.out.println((int)fNum);
		System.out.println(iNum1/(int)fNum);
		
		System.out.println( iNum1 / fNum); 
		System.out.println(iNum1 / (double)fNum);
		
		// float : 소수점 아래 8번째 자리까지 연산 후 반올림
		// double : 소수점 아래 16번째 자리까지 연산 후 반올림 
		
		// ** double은 뒤에가 5로 끝나는 이유? 
		// -> 컴퓨터는 숫자를 2진수로 표현한다
		// -> 3.33333.. 이런 실수도 11.01011011011.. 이런식으로
		// 2진수로 실수를 표현하면 무한히 반복되는 경우가 많다. 
		// 따라서 일정한 크기만큼 게산하고 적당한 위치에서 잘라내어 반올림하는데
		// 2진수 -> 10진수로 변환했을 때
		// float 7~8자리까지 자르고, double은 15~16자리까지 자름
		// 자르는 위치가 다르니까 숫자가 다르게 나올 수 있다.
		// => 2진수로 소수점 이하를 정확하게 표현하지 못하는 경우가 많아서
		// 근사치가 출력되게 된다.
		
		System.out.println("'" + ch + "'"); // 'A'
		System.out.println( (int)ch ); // 'A'
		System.out.println( ch ); // 65
		System.out.println(ch + iNum1); //75

		int num = 75;
		char ch1 = (char)75;
		System.out.println(ch1);
		 
		
	}

}
