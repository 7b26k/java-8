package streams;

import java.util.ArrayList;
import java.util.List;

public class ToArray {
		public static void main(String[] args) {
			List<Integer> list=new ArrayList<Integer>();
			list.add(1);
			list.add(3);
			list.add(5);
			
			//coverting list into arrays
			Integer[] array=list.stream().toArray(Integer[]::new);
			for (Integer x : array) {
				System.out.println(x);
			}
		}
}
