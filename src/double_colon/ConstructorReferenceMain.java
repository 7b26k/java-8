package double_colon;

public class ConstructorReferenceMain {
		public static void main(String[] args) {
			//create Object of sample class using interface and lambda expression
			ConstructorReference c = ()->{
				Sample s=new Sample();
				return s;
			};
			
			c.get();
			
			
			
			//creating Object of Sample class using interface and :: operator
			ConstructorReference c1=Sample::new;
			Sample s1=c1.get();
			
		}
}
