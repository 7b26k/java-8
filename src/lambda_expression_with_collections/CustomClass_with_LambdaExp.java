package lambda_expression_with_collections;

import java.util.*;

public class CustomClass_with_LambdaExp {
	public static void main(String[] args) {
		ArrayList<Employee> list=new ArrayList<>();
		list.add(new Employee(5, "Ranjit", 20000.00));
		list.add(new Employee(7, "Raju", 25000.00));
		list.add(new Employee(2, "Deepak", 35000.00));
		list.add(new Employee(1, "Sajan", 45000.00));
		list.add(new Employee(6, "Belal", 24000.00));

	System.out.println("list in natural order :"+list);
	
	Collections.sort(list,(a,b)->(a.id<b.id)?-1:(a.id>b.id)?1:0);
	
	System.out.println("list sorted order by id and using LE :"+list);
	
	Collections.sort(list,(a,b)->(a.salary <b.salary )?1:(a.salary >b.salary )?-1:0);
	
	System.out.println("list sorted order by salary and using LE :"+list);

	
	}
}
