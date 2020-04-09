package cf;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class CollectionsExample {

	public static void main(String[] args) {
        // employee   student
		
  List<Integer> list= new ArrayList<Integer>();
  list.add(10);
  list.add(3);
  list.add(5);
  list.add(8);
  
  Collections.sort(list);
System.out.println(list);
list.get(0).compareTo(20); 


  
	}

}
