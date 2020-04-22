package lambda_expression_with_collections;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class ComparatorWithLambdaExp {
		public static void main(String[] args) {
			List<Integer> list=new ArrayList<>();
			list.add(14);
			list.add(11);
			list.add(16);
			list.add(18);
			list.add(24);
			list.add(4);
			
			System.out.println("list "+list);
			
			Collections.sort(list,(a,b)->(a<b)?1:(a>b)?-1:0);
			System.out.println("list using comparator and lambda exp"+list);
		}
}
