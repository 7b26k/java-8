package methods;

public interface RightDefault {
	
	default void m1() {
		System.out.println("running Right Interface m1()");
	}

}
