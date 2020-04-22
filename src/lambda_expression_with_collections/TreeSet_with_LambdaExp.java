package lambda_expression_with_collections;

import java.util.TreeSet;

public class TreeSet_with_LambdaExp {
	public static void main(String[] args) {
		
		TreeSet<Integer> set=new TreeSet<>((a,b)->(a<b)?1:(a>b)?-1:0);
		set.add(10);
		set.add(19);
		set.add(1);
		set.add(20);
		set.add(11);
		set.add(10);
		
		System.out.println("set using lambda expression "+set
				);
		
	}

}
