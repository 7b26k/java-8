package lambda_expression;


//without using lambda expression
public class Program2 implements Program1{
	
	public Program2() {
			System.out.println("running constructor of program 2");
	}
	
	public void m1() {
		System.out.println("running the implementation of method m1 without lambda expression");
	}
}
