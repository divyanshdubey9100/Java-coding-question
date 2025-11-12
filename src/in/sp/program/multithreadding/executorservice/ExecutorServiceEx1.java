package in.sp.program.multithreadding.executorservice;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public class ExecutorServiceEx1 {

	public static void main(String[] args) {
		ExecutorService executorService=Executors.newFixedThreadPool(3);
		Callable<Integer> callable1=()->{
			System.out.println("thread1");
			Thread.sleep(1000);
			return 1;
		};
		
		Callable<Integer> callable2=()->{
			System.out.println("thread2");
			Thread.sleep(1000);
			return 1;
		};
		
		Callable<Integer> callable3=()->{
			System.out.println("thread3");
			Thread.sleep(1000);
			return 1;
		};
		
		List<Callable<Integer>> listPool= Arrays.asList(callable1,callable2,callable3);
		try {
			List<Future<Integer>> futureList=executorService.invokeAll(listPool, 1,TimeUnit.SECONDS );
			for(Future<Integer> f:futureList) {
				System.out.println(f.get());
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch (CancellationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		executorService.shutdown();
		System.out.println("thread closed");
	}

}
