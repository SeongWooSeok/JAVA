package test1;

public class Account {
	
	int id;
	String password;
	String ownerName;
	int balance;
	
	Account(){
		balance = 0;
	}
	
	Account(int id, String password, String ownerName){
		this();
		this.id = id;
		this.password = password;
		this.ownerName = ownerName;
	}
	
	void deposit(int a) {
		balance += a;
		System.out.println(balance+"원이 입금되었습니다.");
	}
	
	int withdraw(int b, String password) {
		if(isCorrectPassword(password)){
			balance -= b;
			return balance;
		}else {
			return -1;
		}	
	}
	
	int checkBalance(String password) {
		if(isCorrectPassword(password)) {
			return balance;			
		}else {
			return -1; //암호틀림
		}
	}
	
	boolean isCorrectPassword(String password) {
		 return this.password.equals(password) ? true:false;
	}
	
	
	
	public static void main(String[] args) {
		//계좌생성
		Account account = new Account(1,"password!@#", "park");
		//10만원 입금
		account.deposit(100000);
		//잔액 확인
		System.out.println(account.checkBalance("password!@#"));
		//2만원 출금
		account.withdraw(20000,"password!@#");
		//잔액 확인
		System.out.println(account.checkBalance("password!@#"));
		
		
	}
}
