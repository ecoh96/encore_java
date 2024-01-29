package com.encore.car;

import com.encore.car.Engine.Engine;

public class Car {
	private Engine engine ;
	
	
/*
 기본 생성자 정의 
 생성자는 like a method 로 반환 타입이 정의되지 않고 메서드의 이름은 클래스의 이름동일
 Engine eng =new Engine();
 
 */
	
	public Car() {
		engine = new Engine();
		
	}


	public void engineInfo() {
		String Info = engine.showInfo();
		System.out.println(">>>>>>.엔진정보<<<<<<<,");
		System.out.println(Info);
	

	}
	public Car(String type) {
		engine = new Engine(type);
		
	}
	
	
	
}
