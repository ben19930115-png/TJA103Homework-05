package hw;


//import java.util.Scanner;
//
//public class hw9 implements Runnable {
//	private String name;
//	int counter = 0;
//
//	public hw9() {
//		System.out.println("-----大胃王快食比賽開始！-----");
//	} // 建構者函數
//	
//	public void run() { // 執行緒執行的地方
//		while (counter < 11) {
//			System.out.println(counter);
//			counter++;
//
//			try {
//				Scanner scanner = new Scanner(System.in);
//				int answer = (int)(Math.random() * 3000);
//				Thread.sleep(answer);
//			} catch (Exception e) {
//			}
//		}
//	}
//
//	public static void main(String arg[]) {
//			
//		hw9 r1 = new hw9();// 產生Runnable物件
//		Thread t1 = new Thread(r1); // 再由Runnable物件, 產生執行緒Thread物件
//		hw9 r2 = new hw9();
//		Thread t2 = new Thread(r2);
//		t1.start(); // 呼叫執行緒物件的start()方法(即啟動執行緒) , 隨即執行物件中的run方法
//		t2.start();
//	}
//}

class Depot {
	private int stock = 2000; // 庫存量

	synchronized public void produce(int qty) {
		while (stock >= 3000 ) {
			System.out.println("帳戶3000，停止匯款");
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		stock += qty;
		System.out.println("帳戶：" + qty + "；存款：" + stock);
		notify();
	}

	synchronized public void consume(int qty) {
		while (stock < qty) {
			System.out.println("存款不足，暫停消費");
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		stock -= qty;
		System.out.println("帳戶：" + qty + "；存款" + stock);
		if (stock < 2000) {
			System.out.println("要求匯款");
			notify();
		}
	}
}

class Producer extends Thread {
	Depot depot;

	public Producer(Depot depot) {
		this.depot = depot;
	}

	public void run() {
		for (int i = 1; i <= 10; i++)
			depot.produce(1000); // 每次1000
	}
}

class Consumer extends Thread {
	Depot depot;

	public Consumer(Depot depot) {
		this.depot = depot;
	}

	public void run() {
		for (int i = 1; i <= 10; i++)
			depot.consume(1000); // 每次消費3個
	}
}

public class hw9 {
	public static void main(String[] args) {
		Depot depot = new Depot();
		Producer producer = new Producer(depot);
		Consumer consumer = new Consumer(depot);
		producer.start();
		consumer.start();
	}
}

