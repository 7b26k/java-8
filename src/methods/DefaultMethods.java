package methods;

public interface DefaultMethods {
		
	//from java8 we can use concrete methods in the interface using default keyword
	default void m1() {
		System.out.println("running interface default method .....");
	}
}

class MainDefault implements DefaultMethods {
	public static void main(String[] args) {
		DefaultMethods inter=new MainDefault();
		inter.m1();
	}
}
