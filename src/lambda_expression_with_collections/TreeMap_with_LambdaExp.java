package lambda_expression_with_collections;

import java.util.TreeMap;

public class TreeMap_with_LambdaExp {
	public static void main(String[] args) {
		TreeMap<Integer, String> map=new TreeMap<>((a,b)->(a<b?1:a>b?-1:0));
		map.put(1, "courtois");
		map.put(10, "modric");
		map.put(7, "hazard");
		map.put(8, "Kroos");
		
		System.out.println("map with LE "+map);
	}

}
