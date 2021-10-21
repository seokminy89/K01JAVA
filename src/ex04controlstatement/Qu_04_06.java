package ex04controlstatement;

//다음과 같은 모양을 출력하는 프로그램을 while문으로 작성하시오.

//*
//* *
//* * *
//* * * *
//* * * * *

import ex01start.E02SystemOutPrintln;

public class Qu_04_06 {

	public static void main(String[] args) {
		
		int i=1;
		while(i<=5) {
			int j=1;
			while(j<=i) {
				
				System.out.print("* ");
				
				j++;
			}
			System.out.println(" ");
			i++;
		}
		
		
		
		//내가 한거.
//		int a=1;
//		while(a<=5) {
//			int b=1;
//			while(b<=a) {
//				System.out.print('*');
//				System.out.print(' ');
//				b++;
//			}
//			System.out.println("");
//			a++;
//		}
		

	}

}
