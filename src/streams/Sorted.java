package streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Sorted {
	public static void main(String[] args) {
		List<Integer> list=new ArrayList<Integer>();
		list.add(1);
		list.add(3);
		list.add(5);
		list.add(4);
		list.add(2);
		list.add(0);
		
		System.out.println("original list :"+list);
		
		//using sorted() method of stream to sort the data in the natural sorting order
		List<Integer> list1=list.stream().sorted().collect(Collectors.toList());
		System.out.println("using sorted() to sort in default asc order list :"+list1);
		
		//using sorted() with argument to sort in the descending order
		List<Integer> list2=list.stream().sorted((i,j)->-i.compareTo(j)).collect(Collectors.toList());
		System.out.println("using parameterized sorted () to sort in the desc order list :"+list2);
	}

}
