package com.encore.car.Engine;

public class Engine {
	
	
	private String engineType;
	
	// 생성자 또는 메서드는 매개변수 타입과 갯수를 다르게해서 재 정의 할 수 있다.
	// 생성자 오버로딩,메서드 오버로딩
	// 생성자는 매게변수로 받은 값을 전역(맴버)변수에 할당하는 역할을 한다.
	public Engine() {
	}
	public Engine(String engineType) {
		this.engineType = engineType;
	// 앞에있는게 전역 변수고 뒤에가 지역변수
		
	
		
	}
	
	
	public void engineInfo(){
		
	}
	
	public String showInfo() {
		return "엔진의타입은 "+engineType+"입니다";
		
		
	}


	
	
	
	
	
}
