package com.encore.opreator;

import java.util.Scanner;

import javax.naming.spi.DirStateFactory.Result;

public class OperatorDemo {

	
	public OperatorDemo() {
		}
	

	
	public void example01() {
		System.out.println(">>>>산술 연산");
	
		int x= 100 , y = 100, result = 0 ;
	System.out.println(x+y);
	System.out.println(x-y);
	System.out.println(x*y);
	System.out.println(x/y);
	System.out.println(x%y);
	
	}
	
	
	
	public String example02(String color01, String color02) {
		System.out.println(">>>>> 연결연산");
	int x= 100 , y = 100, result = 0 ;
System.out.println(x+y);
System.out.println(x-y);
System.out.println(x*y);
System.out.println(x/y);
System.out.println(x%y);

return "신호등의 색깔은"+ color01 +"과"+color02+"입니다" ;
	

	}
	
	public void example03() {
		System.out.println(">>>>>>논라연산");
	boolean isflg= false;
	System.out.println("논리부정 ," + !isflg);
	
	Scanner scan = new Scanner(System.in);
	System.out.println("숫자를 입력하세요 : ");
	int number = scan.nextInt();
	System.out.println("Result>>>>>>>> 	짝수 " 	 +   (number % 2 == 0));
	System.out.println("Result>>>>>>>>	홀수 "	 + 	(number % 2 != 0));
	System.out.println("3의배수" +( number % 3 == 0));
	System.out.println("Result>>>>>>>>	양수  " + (number >0 ));
	}

	
	
	
	public void example04() {
		
		int agg = 50;
		System.out.println("현재 나이는 = " + agg);

		System.out.println(++agg);

		System.out.println("현재 나이는 = " + agg);

		System.out.println(agg++);
		System.out.println("현재 나이는 = " + agg);

		System.out.println();
		int number =20 ;
		int result = (number++ *3);
		System.out.println("Result >>>>>>>." + result);
	}
	
	
	public void example05() {
		System.out.println(">>>>>>일반논리연산");
//	&(이면서) |(이거나 )
		
		Scanner scan =new Scanner(System.in);
		System.out.println("숫자를 입력하세요 : ");
		int number = scan.nextInt();
		
		System.out.println("1~100" + (number >=1 && number <= 100 ));
	
	}

	
	public void example06() {
		System.out.println(">>>>>>일반논리연산");
		
		Scanner scan =new Scanner(System.in);
		System.out.println(" 문자를 입력하세요  : ");
		char str = scan.next().charAt(0);
	// Scanner 부터 입력받은 문자가 A~Z  대문자 인지 판단하고싶다
		System.out.println("Input char, " +(str));
		System.out.println("A~Z" + (str>='A' && str<='Z')  );
	}
	public void example07() {
		System.out.println(">>>>>>삼화연산자 ");
		Scanner scan = new Scanner(System.in);
		System.out.println("숫자를 입력하세요 : ");
		int number = scan.nextInt();
		// 양수인지 음수인지 아니면 0인지 판단하고싶다면 ?
		
		String result = (number >0 ) ? "양수" : (number ==0) ? "0":"음수";
		System.out.println(result);
		
		
	
	}
	
}





