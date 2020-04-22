package lambda_expression;

public interface Program4a {
	
	public int getLength(String s);

}

class Program4b implements Program4a{
	public int getLength(String s) {
		return s.length();
	}
}

class Main4{
	public static void main(String[] args) {
		
		//without lambda expression
		Program4a int1=new Program4b();
		System.out.println("without lambda expression the size is "+int1.getLength("without lamdbda expression"));
		
		//with lambda expression
		Program4a int2=s->s.length();
		System.out.println("with lambda expression the size is "+int2.getLength("with lamdbda expression"));
		
	}
}