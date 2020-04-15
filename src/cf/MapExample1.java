package cf;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapExample1 {

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
  
  // Collection View Methods // List , Set
  
  
        Set<Integer> keys = studentMap.keySet();
        
       
        
        System.out.println(keys);
    Collection<String>  values =studentMap.values();
    System.out.println(values);
    
    
    Set<Map.Entry<Integer, String>> entrySet = studentMap.entrySet();
    
    Iterator<Map.Entry<Integer, String>> itr = entrySet.iterator();
    
    while(itr.hasNext())
    {
   Map.Entry<Integer, String> entry = itr.next();	
   
         System.out.println(entry +" :"+entry.getKey() +" =>"+entry.getValue());
         
         if(entry.getKey()==102)
         {
        	 entry.setValue("Mahesh");
         }
    }

    System.out.println(studentMap);
    System.out.println(entrySet);
		
		
		

	}

}
