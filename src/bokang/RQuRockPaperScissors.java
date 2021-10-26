package bokang;

import java.util.Random;
import java.util.Scanner;

public class RQuRockPaperScissors
{

	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		int gameCount = 0;
		
		while(true) {
			int com = random.nextInt(3)+1;
			System.out.println("컴퓨터"+com);
		
		System.out.println("가위바위보를 입력하세요");
		System.out.println("가위(1), 바위(2), 보(3)");
		int user = scanner.nextInt();
		
		
		if(!(user < 1 || user > 3)) {
			System.out.printf("사용자:%s, 컴퓨터%s ", result(user), result(com));
			switch(user - com) {
			case 0: 
				System.out.println("비겼습니다."); break;
			case 1: case -2: 
				System.out.println("이겼습니다."); break;
			case -1: case 2:
				System.out.println("졌습니다."); break;
			}
			gameCount++;
		}
		else {
			System.out.println("가위바위보를 똑바로 입력해주세요");
		}
		if(gameCount>=5) {
			int restart;
			while(true) {
				System.out.print("게임재시작(1), 종료(0):");
				restart=scanner.nextInt();
				if(restart==0 || restart ==1) {
					break;
				}
				else {
					System.out.println("제대로 입력해주세요");
				}
			}
			if(restart == 0) {
				break;
			}
			else {
				System.out.println("게임 재시작^^");
				gameCount=0;
			}
		}
	}
}
	public static String result(int n) {
		String str="";
		switch(n) {
		case 1 : str ="가위"; break;
		case 2 : str = "바위"; break;
		case 3 : str = "보"; break;
		}
		return str;
	}

}
