package lambda_expression;

public class ThreadWithLambdaExpression {
	public static void main(String[] args) {
		Runnable r= ()->{
			for (int i = 0; i < 10; i++) {
				System.out.println("(LE)running child thread .....");
			}
		};
		Thread t=new Thread(r);
		t.start();
		for (int i = 0; i < 10; i++) {
			System.out.println("(LE)running main thread .....");
		}
	}
}
