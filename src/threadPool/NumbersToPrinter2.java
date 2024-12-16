package threadPool;

public class NumbersToPrinter2 implements Runnable{
	int noToPrint;
	
	public NumbersToPrinter2(int noToPrint) {
		this.noToPrint = noToPrint;
	}
	
	@Override
	public void run() {
		System.out.println(noToPrint +" "+Thread.currentThread().getName());
	}

}
