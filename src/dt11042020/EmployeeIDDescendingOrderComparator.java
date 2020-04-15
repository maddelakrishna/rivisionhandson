package dt11042020;

import java.util.Comparator;

import cf.Employee;

public class EmployeeIDDescendingOrderComparator implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
          // Postive
		// negative
		// 0
		//  1 2
		
		// 2 1  // 
		// 1 1 
              if(o1.getId() >  o2.getId()) 
              {
            	return -1; 
              }
              else if(o1.getId() < o2.getId())
              {
            	  return 1;
              }else
              {
            	  return 0; 
              }
		
	}
	
	

}
