package com.encore.test;

/*  
	comment
	xxxxxxxVO.java, xxxxxxDTO.java, xxxxxxEntity.java 
    업무로직이 없고 데이터한 관리하는 클레스로 변수 및 Setter, Getter
    
    char -> int형으로 자동 변경됨 
    
 */

public class StudentVO {
 /* 변수(Variable)
  	구분형식 	: 접근지정자 , 변수타입 , 변수명 ;
  	접근지정자 	: 	(public,private)
  	변수타입 	: 	(기본타입,참조타입)
  	변수명은(소문자시작해야된다) 
  	변수는 선언위치가 있는데(전역,지역)
  	{클레스 안에 선언하는 변수는 전역 변수 
  	클래스내에서 접근 가능한 범위를 갖는것
  	encore 에 변수 선언하면 지역 변수가 됨  
  */
	
	private String 	name;
	
	private int		age;
	private double	height;
	private boolean	isMarriage;

	

/*
 * 생성자
 * 매개변수가 없는 생성자는 기본생성자
 * 매개변수가 있는 생성자는 스페셜 생성자
 * 명시적으로 생성자가 정의되어지지 않으면 컴파일 시점에 기본 생성자를 넣어서 컴파일 진행
 * 구문형식) 
 * 접근지정자 , class 이름([매개변수]){
 * 
 * }

 * method
 * 만약 반환 타입이 void가 아니라면 문장의 끝나기전에 return 키워드를 이용해서 값을 반환해야된다.
 * return (기본값 | 반환값)
 * 
 * 구분형식 = 접근지정자,반환타입,메서드이름([매개변수]){
 * }
 *  
 */ 
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public boolean isMarriage() {
		return isMarriage;
	}
	public void setMarriage(boolean isMarriage) {
		this.isMarriage = isMarriage;
	}
	
	

}