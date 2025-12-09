package in.problems.code.corejava;

public class FindEvenOddUsingThread {
	
	boolean oddNum=true;
	
	synchronized void isOdd(int n) throws InterruptedException {
		while(!oddNum) wait();
		
			System.out.println(n);
			oddNum=false;
			notifyAll();
		
	}

	synchronized void isEven(int n) throws InterruptedException {
		while(oddNum) wait();
			
			System.out.println(n);
			oddNum = true;
	        notifyAll();
	}
    public static void main(String[] args) {
        FindEvenOddUsingThread generator = new FindEvenOddUsingThread();
        
        
        int maxNumber = 20;

        
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    for (int i = 1; i <= maxNumber; i += 2) {
                        generator.isOdd(i);
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    for (int i = 2; i <= maxNumber; i += 2) {
                        generator.isEven(i);
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        t1.start();
        t2.start();
    }
}
