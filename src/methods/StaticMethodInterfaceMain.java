package methods;
//calling static method of the interface StaticMethodInterface
public class StaticMethodInterfaceMain implements StaticMethodInterface {
	public static void main(String[] args) {
		StaticMethodInterfaceMain stm=new StaticMethodInterfaceMain();
		//stm.m1()    not possible since static overriding is not possible
		//StaticMethodInterfaceMain.m1();  not possible since static overriding is not possible
		StaticMethodInterface.m1(); //correct way to call the static method of an interface
		
		
	}
}
