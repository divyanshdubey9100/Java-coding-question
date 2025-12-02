package in.problems.code.multithreadding.reentrant;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLockExample{
	
	private final Lock lock =new ReentrantLock();
	
	public void outerMethod() {
		lock.lock();
		try {
			System.out.println("Outer Method invoking..");
			innerMethod();
			System.out.println("Outer method excution done");
		}finally {
//			lock.unlock();
//			System.out.println("outer lock unlocked..");
//			lock.unlock();
//			System.out.println("main outer lock unlocked..");
		}
	}
	
	public void innerMethod() {
		lock.lock();
		try {
			System.out.println("Inner Method Invoking..");
		}finally {
			lock.unlock();
			System.out.println("Inner lock unlocked..");
			lock.unlock();
			System.out.println("main inner lock unlocked..");
		}
	}
	
	public static void main(String[] args) {
		ReentrantLockExample example=new ReentrantLockExample();
		example.outerMethod();
	}
}