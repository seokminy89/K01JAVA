package quiz;
/*
게임설명 : 업다운게임을 메소드를 이용해 구현한다.
1.컴퓨터는 1~100사이의 숫자 하나를 생성한다.
2.총 시도횟수는 7번을 부여한다.
3.사용자는 7번의 시도안에 숫자를 맞춰야 한다.
4.사용자가 숫자를 입력했을때 컴퓨터는 높은지/낮은지 알려준다.
5.7번안에 맞추면 성공, 맞추지 못하면 실패라고 출력한다.
6.성공/실패 후 계속 할지를 물어보고 1이면 게임 재시작, 0이면 프로그램을 종료한다.
7.함수를 사용하여 구현한다.
8.무한루프에 빠지게 된다면 scan.nextLine()을 활용하여 버퍼에 남아있는 
	Enter키를 제거해주도록 하자.

업다운 게임에 다음 조건에 맞는 예외처리 구문을 추가하시오.
- 숫자입력시 1~100을 벗어난 경우 사용자정의 예외클래스를 통해 처리하시오
클래스명 : NumberRangeException
게임 재시작 / 종료 입력시 문자를 입력했을때 발생되는 예외를 처리하시오.
*/

import java.util.Random;
import java.util.Scanner;

public class UpDownGame
{
	public static void upDownGameStart() {
		Random random = new Random();
		Scanner scan = new Scanner(System.in);
		int restart;
		boolean forEnd = false;//7번만에 맞추는지 확인하기 위한 변수
		
		// 무한루프안에서 사용자가 7번안에 맞추는지
		while (true) {
			// 난수생성
			int computerNum = random.nextInt(10000) % 100 + 1; // 1~100까지 랜덤으로
			System.out.println("컴퓨터가 생성한 난수:"+ computerNum);

			//7번의 시도를 한다. 
			for (int i = 1; i <= 7; i++) {
				System.out.print("1~100까지 숫자입력:");
				int userNum = scan.nextInt();
				
				// 성공실패
				if (userNum > computerNum) {
					System.out.println("Down, 더 낮은 숫자입니다.");
				}
				else if (userNum < computerNum) {
					System.out.println("Up, 더 높은 숫자입니다.");
				}
				else {
					System.out.println("일치합니다.");
					//isSuccess = true;
					System.out.println(i+"번 안에 성공");
					System.out.println("-----------------------");
					
					forEnd = true;
					
					//for문 탈출
					break;					 
				}				
			}	
			//7번만에 맞추지 못한 경우...
			if(forEnd == false) {
				System.out.println("실패");
			}
			while(true) {
				System.out.println("-----------------------");
				System.out.println("게임재시작(1), 종료(0) ");
				System.out.print("재시작여부를 입력하세요:");
				restart = scan.nextInt();
				// 0,1 이 입력되었을때 탈출
				if (restart == 0) {
					return;
				} 
				else if (restart == 1) {
					forEnd = false;
					System.out.println("게임 재시작!");
					break;
				} 
				else {
					System.out.println("잘못입력해씸..");						
				}
			}	 
		}		
	}
	public static void main(String[] args)
	{
		upDownGameStart();
	}
}
