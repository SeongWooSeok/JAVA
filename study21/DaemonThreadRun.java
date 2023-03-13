package study21;

import study01.Sysout;

class CoThread extends Thread{
	@Override
	public void run() {
		System.out.println(getName());
		if(isDaemon()) {
			for(int i =0; i<7;i++) {
				System.out.println("          ★");
				try {sleep(1000);
				} catch (InterruptedException e) {}
			}
		}else {
			for(int i =0; i<10;i++) {
				System.out.println("○");
				try {sleep(1000);
				} catch (InterruptedException e) {}
			}
		}
	}
}

public class DaemonThreadRun {
	public static void main(String[] args) {
		Thread normal = new CoThread();
		normal.setName("normal Thread");
		normal.setDaemon(false);
		normal.start();
		
		Thread deamon = new CoThread();
		deamon.setName("deamon Thread");
		deamon.setDaemon(true);
		deamon.start();
		
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {}
		System.out.println("main thread terminated");
	}
}
