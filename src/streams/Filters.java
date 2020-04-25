package streams;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Filters {
	public static void main(String[] args) {
		ArrayList<Integer> list=new ArrayList<>();
		list.add(0);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(1);
		System.out.println("default list values :"+list);
		
		//general/old way to filter the collection in java
		ArrayList<Integer>list2=new ArrayList<>();
		for(Integer I:list) {
			if(I%2==0)
				list2.add(I);
		}
		System.out.println("filtering the list without java.util.streams :"+list2);
		
		//new way to filter the collection using Stream Api
		ArrayList<Integer> list3=(ArrayList<Integer>) list.stream().filter(I->I%2==0).collect(Collectors.toList());
		System.out.println("new List "+list3);
	}
}
