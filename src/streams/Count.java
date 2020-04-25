package streams;

import java.util.*;

public class Count {
	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<>();
		list.add("belal");
		list.add("altamash");
		list.add("kamal");
		list.add("pasha");
		list.add("Muhammad");
		
		System.out.println(list);
		
		
		//using stream count() to get the total count of the satisfied condition
		long count=list.stream().filter(i->i.length()<=5).count();
		System.out.println("count the number of record with lengh<=5 :"+count);
	}

}
