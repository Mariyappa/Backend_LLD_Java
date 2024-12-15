package introToThreads;

public class HelloWorldPrinter implements Runnable{

	@Override
	public void run() {
		
		System.out.println("Helllo World Printer RUN : "+Thread.currentThread().getName());
		
	}
}
