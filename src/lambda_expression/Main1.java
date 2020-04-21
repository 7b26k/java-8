package lambda_expression;

public class Main1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//calling the function without using the functional interfaces
		Program1 inter=new Program2();
		inter.m1();
			
		//calling the function with lambda expression
		
		Program1 inter2=()->System.out.println("running the implementation of method m1 with lambda expression");
		inter2.m1();
	}

}
