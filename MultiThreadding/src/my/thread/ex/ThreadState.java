package my.thread.ex;

class Thread11 implements Runnable{

	@Override
	public void run() {
		System.out.println("State inside run method "+Thread.currentThread().getState());
//		for(int i=0;i<10;i++) {
//			System.out.println("Thread state called");
//		}
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		synchronized (this) {
			
		}
	}

}
public class ThreadState{
	public static void main(String[] args) throws InterruptedException {
		Thread11 th11=new Thread11();
		Thread t11=new Thread(th11);
		System.out.println("State after thread creation "+Thread.currentThread().getState());
		
		t11.start();
		 System.out.println("State after start(): " + t11.getState());
		 
		 Thread.sleep(100);  // Let t1 start
	        System.out.println("State while running: " + t11.getState());

	        Thread.sleep(1500); // Wait till t1 is sleeping
	        System.out.println("State after sleep: " + t11.getState()); // Possibly TIMED_WAITING or RUNNABLE

	        t11.join(); // Wait for t1 to finish
	        System.out.println("State after completion: " + t11.getState()); 
	}
}
