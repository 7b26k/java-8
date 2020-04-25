package double_colon;


//advantage of using of :: operator is reusablity of code i.e method m1 in the below case
public class MethodReference2Main {
	public static void main(String[] args) {
		/*
		 * Runnable r = ()->{ for (int i = 0; i < 10; i++) {
		 * System.out.println("running child thread using lambda expression"); } };
		 */
		MethodReference2Main m=new MethodReference2Main();
		Runnable r=m::m1;
		
		Thread t=new Thread(r);
		t.start();
		for (int i = 0; i < 10; i++) {
			System.out.println("running parent thread");
		}
		
	}
	
	public void m1() {
		for (int i = 0; i < 10; i++) {
			System.out.println("running child thread using :: operator");

		}
	}
}
