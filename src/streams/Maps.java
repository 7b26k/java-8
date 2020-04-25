package streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Maps {
		public static void main(String[] args) {
			ArrayList<Integer>list=new ArrayList<Integer>();
			list.add(0);list.add(5);list.add(8);
			list.add(10);list.add(9);list.add(11);
		
		   //printing the list of the arrays
			System.out.println("list :"+list);
			
		 //doing mulitiple operation without using stream.map
			ArrayList<Integer> list2=new ArrayList<>();
			for (Integer I : list) 
				list2.add(I*2);
			
			System.out.println("list2 :"+list2);
			
			//doing multiple operation using streams Map()
			List<Integer>list3=list.stream().map(i->i*2).collect(Collectors.toList());
			System.out.println("list3 "+list3);
			
		}
}
