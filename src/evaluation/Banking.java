package evaluation;
/*
[요구사항]
-클래스명 : Banking
-멤버변수 : 예금주(name), 계좌번호(accountNumber), 잔액(balance)
-멤버메소드 : 입금(deposit()), 출금하다(withdraw()), 계좌조회(showAccount())
조건1 : 입금은 무제한으로 가능함
조건2 : 출금시 잔고가 부족할 경우에는 출금불능 처리
조건3 : Banking 객체생성시 장동건, 123-45-67890, 10000으로 초기화할것
조건4 : 5000원 입금, 9000원 출금 후 잔고를 출력할것
[샘플코드]
class Banking {   
    멤버변수 및 생성자;   
    멤버메소드;
}
public class BankingMain {
    public static void main(String[] args) {
        Banking banking = new Banking("장동건", "123-45-67890", 10000);
        banking.deposit(5000);
        banking.withdraw(9000);
        banking.showAccount();
    }
}
[출력결과]
5000원이 입금됨
계좌에서 9000원이 출금됨
계좌주:장동건
계좌번호:123-45-67890
잔고:6000
 */
public class Banking
{
	public String name;
	public String accountNumber;
	public int balance;
	

	public Banking(String name, String accountNumber, int balance)
	{
		this.name = name;
		this.accountNumber = accountNumber;
		this.balance = balance;
	}
	
	public void deposit(int a) {
		balance+=a;
		System.out.println(a+"원이 입금됨");
	}
	public void withdraw(int b) {
		if(balance>=b) {
			
			balance-=b;
		}
		else {
			System.out.println("잔액이 부족합니다.");
		}
		System.out.println("계좌에서 "+b+"원이 출금됨");
	}
	
	
	public void showAccount() {
		System.out.println("계좌주:"+name);
		System.out.println("계좌번호:"+accountNumber);
		System.out.println("잔고:"+balance);
	}
	
	
	public static void main(String[] args)
	{
		Banking banking = new Banking("장동건", "123-45-67890", 10000);
        banking.deposit(5000);
        banking.withdraw(9000);
        banking.showAccount();
	}

}
