package introToThreads;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Thread "+Thread.currentThread().getName());
		HelloWorldPrinter h = new HelloWorldPrinter();	
		Thread t1 = new Thread(h);
		t1.start();
		
		System.out.println("Case 2");
		System.out.println("======================================");
		
		NumberPrinter n = new NumberPrinter();	
		Thread t2 = new Thread(n);
		t2.start();
		
		System.out.println("Case 3");
		System.out.println("======================================");
		for (int i = 1; i <= 100; i++) {
			NumbersToPrinter2 n2 = new NumbersToPrinter2(i);
			Thread t3 = new Thread(n2);
			t3.start();
			
		}
	}

}
