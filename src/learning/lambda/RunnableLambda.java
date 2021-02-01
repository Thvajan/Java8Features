package learning.lambda;

public class RunnableLambda {

	public static void main(String[] args) {

		/* Old way */
		Runnable runnable = new Runnable() {

			@Override
			public void run() {
				System.out.println("Inside Runnable");
			}
		};
		Thread t = new Thread(runnable);
		t.start();

		/* Lambda Way */
		Runnable runnableLambda = () -> System.out.println("Inside Runnable Lambda");

		Thread t1 = new Thread(runnableLambda);
		t1.start();

		new Thread(() -> System.out.println("Inside Runnable Lambda Minimalistic")).start();
	}

}
