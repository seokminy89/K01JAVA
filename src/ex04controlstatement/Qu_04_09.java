package ex04controlstatement;

// 구구단을 이중 for문을 이용해서 다음과 같이 출력하시오

public class Qu_04_09 {

	public static void main(String[] args) {
		
		//su가 고정된 형태에서 dan이 증가한다.
		for(int su=1; su<=9 ; su++) {
			for(int dan=2; dan<=9; dan++) {
				System.out.printf("%2d*%2d=%2d ", dan, su, (dan*su));
			}
			System.out.println();
		}
		
		
// 내가한거.		
//		for(int su= 1; su<=9 ; su++) {
//			for(int dan=2 ; dan<=9 ; dan++) {
//				System.out.printf("%d*%d=%2d  ",dan,su,(dan*su));
//				
//			}
//			System.out.println();
//		}
//		
	}

}
