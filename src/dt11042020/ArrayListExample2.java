package dt11042020;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;

public class ArrayListExample2 {

	public static void main(String[] args) {

         List<String>  list = new ArrayList<String>();
         // rajesh    - first occu
         list.add("Pavan");
         list.add("rajesh");
         list.add("Pavan");
         list.add("Abhi");
         list.add("Somesh");
         list.add("rajesh");
         list.add("Narendra");
         list.add("Abhi");
         list.add("rajesh");
         
         
         if(Collections.frequency(list, "rajesh")>1)
         {
        	 list.set(list.indexOf("rajesh"), "ramesh");
        	 
         }
        System.out.println(list);	 
         
		/*
		 * Iterator<String> itr = list.iterator();
		 * 
		 * while(itr.hasNext()) { if(Collections.frequency(list, itr.next())!=1) {
		 * itr.remove(); } } Collections.sort(list); System.out.println(list);
		 */
		/*
		 * // SortredSet SortedSet<String> sortedset = new TreeSet<String>(list);
		 * System.out.println(sortedset);
		 */
	}

}
