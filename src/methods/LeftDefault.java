package methods;

public interface LeftDefault {
	
	default void m1() {
		System.out.println("running the left interface m1()");
	}

}
