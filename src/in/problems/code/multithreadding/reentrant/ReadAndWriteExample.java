package in.problems.code.multithreadding.reentrant;

import java.util.concurrent.locks.ReentrantReadWriteLock;

public class ReadAndWriteExample {
	private final ReentrantReadWriteLock readWriteLock=new ReentrantReadWriteLock();
	private final ReentrantReadWriteLock.ReadLock readLock=readWriteLock.readLock();
	private final ReentrantReadWriteLock.WriteLock writeLock=readWriteLock.writeLock();
	
	private int data =1000;
	
	private void writeData() {
		writeLock.lock();
		try {
			System.out.println(Thread.currentThread().getName()+" reading "+data);
			++ data;
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			writeLock.unlock();
		}
	}
	
	public void readData() {
		readLock.lock();
		try {
			System.out.println(Thread.currentThread().getName()+" reading "+data);
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			readLock.unlock();
		}
	}
	
	public static void main(String[] args) {
		ReadAndWriteExample example=new ReadAndWriteExample();
		Runnable reader=example::readData;
		
		Runnable writer=()-> example.writeData();
		
		new Thread(reader,"Reader-1").start();
		new Thread(reader,"Reader-2").start();
		new Thread(writer,"Writer-1").start();
		new Thread(reader,"Reader-3").start();
		new Thread(reader,"Reader-4").start();
		new Thread(writer,"writer-2").start();
	}
}
