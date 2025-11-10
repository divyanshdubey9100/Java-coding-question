package my.thread.ex;

public class Thread1 extends Thread {

	public void run(){
		for(int i=0;i<=10;i++) {
			System.out.println("Thread1 called"+i);
			try {
				Thread1.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

class Thread2 extends Thread {

	public void run(){
		for(int i=0;i<=10;i++) {
			System.out.println("Thread2 called" +i);
			try {
				Thread1.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
