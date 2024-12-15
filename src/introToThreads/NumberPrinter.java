package introToThreads;

public class NumberPrinter  implements Runnable{

	@Override
	public void run() {
		
		System.out.println("NumberPrinter : "+Thread.currentThread().getName());
		
		for(int i=1;i<100;i++) {
			System.out.println(i);
		}
		
	}
}