package cf;

import java.util.HashMap;
import java.util.Map;

public class MapExample {

	public static void main(String[] args) {

         Map<Integer, String> studentMap = new HashMap<Integer, String>();
         
                //System.out.println(studentMap.size());
		// adding entries to map
         
         studentMap.put(101, "rajesh");
         studentMap.put(102, "suresh");
         studentMap.put(101, "Ramesh");
         studentMap.put(103, "suresh");
         studentMap.put(104, "Ramesh");
         studentMap.putIfAbsent(105, "Raju");
         
        // Deleting entries 
         
         //System.out.println(studentMap.remove(105));
         //System.out.println(studentMap.remove(105, "raju"));
         
         
         //Searching
         
         //System.out.println(studentMap.containsKey(101));
         //System.out.println(studentMap.containsValue("ramesh"));
         
         
         // Retrive 
         
          //System.out.println(studentMap.get(107).toUpperCase());
        // System.out.println(studentMap.getOrDefault(101, "krishna").toUpperCase());
         
         System.out.println(studentMap.isEmpty());

   //studentMap.clear();
         //studentMap.
         
         
         System.out.println(studentMap);
         
         //System.out.println(studentMap.size());	 
        		 
		

	}

}
