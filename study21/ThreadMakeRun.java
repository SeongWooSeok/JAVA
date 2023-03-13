package study21;

//thread 클래스를 상속
class DduckThread extends Thread{
	@Override
	public void run() {
		String[] lman = {"짝","떡","짝","떡","짝","떡"};
		for(int i = 0 ; i<lman.length;i++) {
			System.out.println("왼쪽 떡방아: "+lman[i]);
			try {
				Thread.sleep(300);
			} catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
//Runnable Interface를 구현
class DdukRunnable implements Runnable{
	@Override
	public void run() {
		String[] rman = {"쿵","쿵","쿵","쿵","쿵","쿵"};
		for(int i = 0; i<rman.length; i++) {
			System.out.println("오른쪽 떡방아: "+rman[i]);
			try {
				Thread.sleep(300);
			} catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

public class ThreadMakeRun {
	public static void main(String[] args) {
		//Thread 객체 생성
		Thread ldduk = new DduckThread();
		ldduk.start();
		Runnable rman = new DdukRunnable();
		Thread rdduk = new Thread(rman);
		//Thread rdduk2 = new Thread(new DdukRunnable());
		rdduk.start();
		
		Thread tdduk = new Thread(new Runnable() {
			@Override
			public void run() {
				String[] tman = {"핫","헛","핫","헛","핫","헛"};
				for(int i = 0; i<tman.length;i++) {
					System.out.println("떡 마는 사람: "+tman[i]);
					try {
						Thread.sleep(300);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		});
		
		tdduk.start();
	}
}
