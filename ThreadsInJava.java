package MyPackage;

class MultithreadingDemo extends Thread {
	public void run() {
		for (int i = 0; i < 10; i++) {

			System.out.println("Child Thread");
		}
	}
}

// Main Class
public class ThreadsInJava {
	public static void main(String[] args) {

		MultithreadingDemo object = new MultithreadingDemo();
		object.start();
		for (int i = 0; i < 10; i++) {

			System.out.println("Parent Thread");
		}
	}
}