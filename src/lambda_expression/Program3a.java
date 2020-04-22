package lambda_expression;

public interface Program3a {
	public void add(int a,int b);

}

class program3b implements Program3a{

	@Override
	public void add(int a, int b) {
			System.out.println("without lambda expression sum is "+(a+b));
	}
	
}

class Main3{
	public static void main(String[] args) {
		//without lambda expression
		Program3a interf=new program3b();
		interf.add(10, 20);
		interf.add(100, 200);
		
		
		//with lambda expression
		Program3a interf2=(a,b)->System.out.println("with lambda expression sum is "+(a+b));
		interf2.add(15, 25);
		interf2.add(200, 300);
	}
}
