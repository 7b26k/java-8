package streams;

import java.util.ArrayList;
import java.util.List;

public class ForEach {
	
	public static void main(String[] args) {
		List<Integer> list=new ArrayList<Integer>();
		list.add(1);
		list.add(3);
		list.add(5);
		
		//printing with stream and lambda expression
		list.stream().forEach(s->System.out.println(s));
		
		System.out.println("-------------------------------");
		
		//printing using double colon operator
		list.stream().forEach(System.out::println);
	}

}
