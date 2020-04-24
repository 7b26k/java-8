package methods;

public class LeftRightMainClass implements LeftDefault,RightDefault  //using both can lead to multiple inheritance Problem 
{

	public void m1() {
			System.out.println("Running Base Class m1()");  //to run base class implementation
			LeftDefault.super.m1(); //to run left interface implementation
			RightDefault.super.m1(); //to run Right interface implementation
	}
	
	public static void main(String[] args) {
		LeftRightMainClass t=new LeftRightMainClass();
		t.m1();
	}

}
