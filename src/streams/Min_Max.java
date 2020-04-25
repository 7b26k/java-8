package streams;

import java.util.ArrayList;
import java.util.List;

public class Min_Max {
		public static void main(String[] args) {
			List<Integer> list=new ArrayList<Integer>();
			list.add(1);
			list.add(3);
			list.add(5);
			list.add(4);
			list.add(2);
			list.add(0);
			System.out.println("default list :"+list);
			
			
			//min(Comparator c)
			Integer min=list.stream().min((i,j)->i.compareTo(j)).get();
			System.out.println("min :"+min);
			
			//Max(Comparator c)
			Integer max=list.stream().max((i,j)->i.compareTo(j)).get();
			System.out.println("max :"+max);
			
		}
}
