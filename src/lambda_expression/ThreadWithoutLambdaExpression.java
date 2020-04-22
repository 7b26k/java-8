package lambda_expression;

public class ThreadWithoutLambdaExpression implements Runnable {

	public void run() {
		for (int i = 0; i < 10; i++) 
			System.out.println("running child thread ......");
	}
}

class ThreadWithoutLambdaMain{
	public static void main(String[] args) {
		//running thread program without lambda expression
		ThreadWithoutLambdaExpression tl1=new ThreadWithoutLambdaExpression();
		Thread childthread = new Thread(tl1);
		childthread.start();
		
		for (int i = 0; i < 10; i++) 
			System.out.println("running main thread .......");
	}
}