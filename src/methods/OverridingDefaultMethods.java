package methods;

public interface OverridingDefaultMethods {
		default void m1() {
			System.out.println("running interface default methods.....");
		}
}

class ODM_main implements OverridingDefaultMethods{
	public void m1() {
		System.out.println("running overrided default methods ....");
	}
	public static void main(String[] args) {
		OverridingDefaultMethods ovm=new ODM_main();
		ovm.m1();
	}
	
}
