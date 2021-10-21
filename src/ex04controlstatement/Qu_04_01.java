package ex04controlstatement;

import java.io.IOException;

/*
 문제1) 파일명 : Qu_04_01.java
하나의 문자를 입력받아 숫자인지 여부를 판단하는 프로그램을 삼항연산자를 이용하여 구현하시오.	
(System.in.read()를 사용하세요)
 */

public class Qu_04_01 {

	public static void main(String[] args) throws IOException {
		
		System.out.print("하나의 문자를 입력하세요:");
		int ascii = System.in.read();
		
		/*
		 삼항연산자의 형식
		    변수 = (조건식) ? "참일때" : "거짓일때";
		 */
		
		//아스키코드를 알고 있을때(47>= 58<=, 47~58사이)
		String result = (ascii>=47 && ascii<=58) ? "숫자입니다" :"숫자가아닙니다";
		System.out.println((char)ascii+" 는 "+result );
		//※위에 아스키 앞에 (char)로 형변환을 안해주게 되면 아스키코드가 나옴
		
		
		//아스키코드를 모를때
		result = (ascii>='0' && ascii<='9') ? "숫자입니다" :"숫자가아닙니다";
		System.out.println((char)ascii+" 는 "+result );
		
		
		//내가한것.
//		System.out.println("하나의 문자를 입력하세요");
//		int asciiCode = System.in.read();
//		System.out.println("입력한 문자는:"+ asciiCode);
//		
//		String Result = (asciiCode>='0' && asciiCode<='9') ? 
//				"숫자입" : "숫자가아닙";
//		System.out.println("입력한문자는"+Result+"니다.");
		////※내껀 아스키 앞에 (char)로 형변환을 안해줘서 아스키코드가 나옴
		

	}

}
