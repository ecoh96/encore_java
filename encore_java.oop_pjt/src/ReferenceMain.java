import com.encore.test.StudentVO;


public class ReferenceMain {
	
	/* 기본타입과 참조타입 차이점 
	 기본타입은 선언과 동시에 값 할당 가능
	 기본타입은 값을 담는 변수
	 
	 참조타입은 선언과 동시에 값을 할당할 수 없다
	 참조타입은 값을 담는 변수가 아니라 주소값을 담는 변수이다.
	 주소값을 담기 위해서는 객체생성이 선행되어야 한다.
	 객체 생성시 사용하는 연산자 new
	 new 뒤에는 생성자 (costruutor)호출
	 
	 참조타입 : 클래스 , 배열,자료구조,enum , etc........

	*/
	public static void main(String[] args) {
		
		StudentVO stuObj = new StudentVO();
		
		// 접근제어자가 public 으로 열려있을때만 가능한 코드 
//		stuObj.name = "poke";
//		// 변수 선언할때 private 으로 되어있으면 선언이 안됨 public 으로 되어있어야지 선언 가능 함 
//		System.out.println("인스턴스 소유의 변수 호출 : "+ stuObj.name);
//		
//		stuObj.name = "포케";
//		System.out.println("인스턴스 소유의 변수 호출 : "+ stuObj.name);
		
		System.out.println("인스턴스 소유의 메서드 호출 : " );
		stuObj.setName("섭섭해 ");
		
		String returnValue = stuObj.getName();
		System.out.println(returnValue);
		System.out.println(stuObj.getName());
		
		}
	}

