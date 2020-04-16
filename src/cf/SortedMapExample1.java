package cf;

import java.util.Collections;
import java.util.Comparator;
import java.util.TreeMap;

public class SortedMapExample1 {

	public static void main(String[] args) {


		  Employee e1 = new Employee(1, "Bargav", "1234", 23000.00);
		     Employee e2 = new Employee(2, "Anudeep", "1234", 21000.00);
		     Employee e3 = new Employee(3, "Bhanupratap", "1234", 22000.00);
		     Employee e4 = new Employee(4, "Laxmi Soujamy", "1234", 20000.00);
		     Employee e5 = new Employee(5, "Charan", "1234", 24000.00);
		     
		     Comparator<Employee> empComparator = new Comparator<Employee>() {

				@Override
				public int compare(Employee o1, Employee o2) {

                        if(o1.getSalary() > o2.getSalary())
                        {
                        	return 1;
                        }else if(o1.getSalary() < o2.getSalary())
                        {
                        	return -1;
                        }
                        else {
					return 0;
                        }
				}
			};
			
			
		      TreeMap<Employee, String> empMap = new TreeMap<Employee, String>(Collections.reverseOrder(empComparator));
		      
		      empMap.put(e2, "Banking");
		      empMap.put(e3, "Banking");
		      
		      empMap.put(e1, "Airlines");
		      empMap.put(e5, "Banking");
		      empMap.put(e4, "Airlines");
		      
		     empMap.entrySet().stream().forEach(t->System.out.println(t));
		
		

	}

}
