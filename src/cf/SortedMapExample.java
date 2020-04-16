package cf;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.TreeMap;

public class SortedMapExample {

	public static void main(String[] args) {
		
		 Comparator<Integer> numComparator = new Comparator<Integer>() {

				@Override
				public int compare(Integer o1, Integer o2) {

		               if(o1 > o2)
		               {
		            	   return -1;
		               }
		               else if(o1 < o2)
		               {
		            	   return 1;
		               }else
		               {
					return 0;
		               }
				}
			};

			
			
      //HashMap<Integer, String>  map = new HashMap<Integer, String>();
      TreeMap<Integer, String>  map = new TreeMap<Integer, String>(numComparator);
      map.put(210,"bgc");
      map.put(101,"xyz");
      map.put(50,"abc");
      map.put(212,"xqr");
      
      System.out.println(map);
      
   
		
		
	}

}
