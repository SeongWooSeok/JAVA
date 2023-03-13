package study16;

class FoolException extends Exception{
	
}

class Sample{
	public void sayNickname(String nick) throws FoolException{
//		try {
			if(nick.equals("바보")) {
				throw new FoolException();		
			}
			System.out.printf("당신의 별명은 %s입니다.\n", nick);
//			}catch(FoolException e) {
//				System.out.println("FoolException 발생");
//			}
		}
}

public class CustomExceptionRun {
	public static void main(String[] args) {
		
		try {
			Sample sp = new Sample();
			sp.sayNickname("바보");
			sp.sayNickname("말미잘");
		}catch(FoolException e) {
			System.err.println("FoolException 발생");
		}
	}
}
