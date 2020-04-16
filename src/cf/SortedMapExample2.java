package cf;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class SortedMapExample2 {
	
	public static void main(String[] args) {
		
		  Employee e1 = new Employee(1, "Bargav", "1234", 23000.00);
		     Employee e2 = new Employee(2, "Anudeep", "1234", 21000.00);
		     Employee e3 = new Employee(3, "Bhanupratap", "1234", 22000.00);
		     Employee e4 = new Employee(4, "Laxmi Soujamy", "1234", 20000.00);
		     Employee e5 = new Employee(5, "Charan", "1234", 24000.00);
		     
		 TreeMap<Employee, String> empMap = new TreeMap<Employee, String>();
	      
	      empMap.put(e2, "Banking");
	      empMap.put(e3, "Food processing");
	      
	      empMap.put(e1, "Airlines");
	      empMap.put(e5, "Banking");
	      empMap.put(e4, "Airlines");
	      
	      /*
	       * Sorting a map with their values
	       * 
	       *  1.take Entry Set
	       *  2. take list of all entries in entry set
	       *  
	       *  3. Define Customized Comparator on Map.Entry
	       *  4. sort the ArrayList according above comparator
	       *  5. construct sortedmap from list
	       */
	      
	      
	      empMap.entrySet().stream().sorted(Collections.reverseOrder(Map.Entry.comparingByValue())).forEach(t->System.out.println(t));;
	      System.out.println("******");
	      System.out.println(empMap);
		/*
		 * Set<Map.Entry<Employee, String>> entries = empMap.entrySet();
		 * 
		 * ArrayList<Map.Entry<Employee, String>> empList = new
		 * ArrayList<Map.Entry<Employee, String>>(); entries.stream().forEach(t ->
		 * empList.add(t)); Collections.sort(empList,new MapValueComparator());
		 * 
		 * System.out.println(empList);
		 * 
		 * Map<Employee, String> sortedMap = new LinkedHashMap<Employee, String>();
		 * 
		 * for(Map.Entry<Employee, String> entry :empList) {
		 * sortedMap.put(entry.getKey(), entry.getValue()); }
		 * //empMap.entrySet().stream().sorted();
		 * 
		 * // empMap.entrySet().stream().forEach(t->System.out.println(t));
		 * 
		 * sortedMap.entrySet().stream().forEach(t->System.out.println(t));
		 */
	}

}
