package threadPool;

import java.util.Date;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Thread "+Thread.currentThread().getName());
		//ExecutorService es = Executors.newFixedThreadPool(10);
		ExecutorService es = Executors.newCachedThreadPool();
		System.out.println("St:"+new Date());
		for (int i = 1; i <= 1000; i++) {
			if(i==420) {
				System.out.println("");
			}
			NumbersToPrinter2 n2 = new NumbersToPrinter2(i);
			es.execute(n2);
		}
		System.out.println("End:"+new Date());
	}

}
