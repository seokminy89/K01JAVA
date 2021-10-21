package ex04controlstatement;

//1~100까지의 숫자중 3의배수 이거나 7의배수인 숫자의 합을 구하는 
//프로그램을 작성하시오. 
//단, 3과 7의 공배수인 경우 합에서 제외해야 한다. 
//출력의결과는 누적되는 모든 수를 콘솔에 print한다.

public class Qu_04_07 {

	public static void main(String[] args) 
	{
		
		int sum = 0;
		for(int i =1 ; i<=100 ; i++) {    //1~100 반복.
			if(i%3==0 || i%7==0) {        //3의 배수 혹은 7의 배수
				if(i%(3*7)!=0){           //3과 7의 공배수가 아닌 정수
					sum += i;             // 누적합
					if(i!=99)
						System.out.print(i+"+");
					else
						System.out.print(i);
				}
			}
		}
		System.out.println("="+sum);    //결과 출력

		
//내가한거
//		int total = 0;
//		int a= 1;
//		while(a<=100) {
//			if(a%3==0 && a%7==0) {
//				
//			}
//		    else if(a%3==0 || a%7==0) {
//				total += a;
//				System.out.print(a+"+");
//			}
//			a++;
//		}
//		System.out.println("="+total);
				

	}

}
