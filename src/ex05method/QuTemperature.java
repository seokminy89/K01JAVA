package ex05method;

import java.util.Scanner;

/*
섭씨(Celsius)를 입력받아서 화씨(Fahrenheit)로 변환하여 리턴하는 함수와 
화씨를 입력받아서 섭씨로 변환하여 리턴하는 함수를 만들어라.

공식]
화씨 = 1.8 * 섭씨 + 32
섭씨 = (화씨 - 32) / 1.8


 */
public class QuTemperature {
	
	//섭씨 -> 화씨
	static double celsiusToFahrenheit(double cel) {
		
		double fah = 1.8 * cel + 32;
		
		return fah;
	}
	
	//화씨 -> 섭씨
	static double fahrenheitToCelsius(double fah) {
		
		return (fah - 32) / 1.8;
		
	}
	
	
	
	public static void main(String[] args) {
		
		System.out.println("섭씨23도=>화씨="+celsiusToFahrenheit(23));
		System.out.println("화씨98도=>섭씨="+fahrenheitToCelsius(98.3));
		
	}

	
	// 내가한거.
//	static double celsius(double a) {
//		double sum1 = 1.8 * a + 32;
//		return sum1;
//	}
//	
//	static double Fahrenheit(double b) {
//		double sum2 = (b - 32) / 1.8 ;
//		return sum2;
//	}
//	
//	public static void main(String[] args) {
//		
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.println("섭씨를 입력하세요.");
//		double num1 = sc.nextDouble();
//		System.out.println("화씨로 변경한 값은"+celsius(num1)+"입니다.");
//		
//		System.out.println("화씨를 입력하세요.");
//		double num2 = sc.nextDouble();
//		System.out.println("섭씨로 변경한 값은"+Fahrenheit(num2)+"입니다.");
//		
//
//	}

}
