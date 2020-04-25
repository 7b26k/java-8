package double_colon;

public class MethodReferenceMain {
	
	public static void m2() {
		System.out.println("running static Method Reference using double colon operator");
	}
	
	void m3() {
		System.out.println("running instance method");
	}
	
	public static void main(String[] args) {
		
		//implementing MethodReference (Interface) using lambda expression
		MethodReference i1=()->{System.out.println("running MethodReference (Interface) using lambda expression");};
		i1.m1();
		
		//static method
		//implementing MethodReference (Interface) using double colon operator
		MethodReference i2=MethodReferenceMain::m2;//refering m2 method as an implementation of Interface using :: operator
		i2.m1();
		
		
		//instance method
		MethodReferenceMain object=new MethodReferenceMain();
		MethodReference i3=object::m3;
		i3.m1();
	}
}
