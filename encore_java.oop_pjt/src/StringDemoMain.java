
public class StringDemoMain {

	public static void main(String[] arg) {
		//자바에서 유일하게 참조타입이지만 기본타입처럼 사용가능한 변수의 타입은 String 
		String str01 = "임섭순";
		String str02 = "임섭순";
		String str03 = new String("임섭순");
		String str04 = new String("임섭순");
		
		if(str03==str04) {
			System.out.println("값이 같다 ");
		}else if (str03.equals(str04)) {
			System.out.println("주소가 같다");
		}
		
		if(str01.equals(str03)) {
			System.out.println("값이 동일합니다");
		}else {
			System.out.println("갑이 동일하지 않습니다 ");
		}
		
		if(str01==str02) {
			System.out.println("값이 맞습니다 str01 == str 02");
		}else if (str02.equals(str03)) {
			System.out.println(str01);
		}
		
		
		
		
	}
}
