package lambda_expression_with_collections;
import java.util.*;

public class Comparator_without_lambdaExp {
		public static void main(String[] args) {
			List<Integer> list =new ArrayList<>();
			list.add(14);
			list.add(11);
			list.add(16);
			list.add(18);
			list.add(24);
			list.add(4);
			
			
			System.out.println("list without sorting "+list);
			Collections.sort(list);   //by default it sorts in the ascending order, to sort in customized order we have to implement comparator
			System.out.println("list with sorting asc"+list);
			//after sorting in the descending order
			Collections.sort(list,new MyComparator());
			System.out.println("list with sorting desc"+list);
			
			
		}
}

class MyComparator implements Comparator<Integer>{
	
	@Override
	public int compare(Integer o1, Integer o2) {
		return (o1>o2)?-1:(o1<o2)?1:0;
	}
	
	
}