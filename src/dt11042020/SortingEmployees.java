package dt11042020;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

import cf.Employee;

public class SortingEmployees {
	public static void changeValue(int a)
	{
		 a  =  a + 10;
		 System.out.println(a);
	}
	public static void printList(List<Employee> list)
	{
		for(Employee emp:list)
		{
			System.out.println(emp);
		}
	}
	// over loaded
	public static void sortEmployee(List<Employee> list)
	{
		EmployeeIDDescendingOrderComparator comp= new EmployeeIDDescendingOrderComparator();
		
		Collections.sort(list);
		
	}

	public static void sortEmployee(List<Employee> list,String key)
	{
		
	
		Comparator<Employee>  empComparator = null;
		
		if(key.equals("name"))
		{
			empComparator = new Comparator<Employee>() {

				@Override
				public int compare(Employee o1, Employee o2) {
					
					return o1.getName().compareTo(o2.getName());
				}
				
			};
			Collections.sort(list,empComparator);
		}
		else if(key.equals("salary"))
		{
			empComparator = new Comparator<Employee>()
					{

						@Override
						public int compare(Employee o1, Employee o2) {


							  if(o1.getSalary() > o2.getSalary())
							  {
								  return 1;
							  }
							  else if(o1.getSalary() < o2.getSalary())
							  {
								  return -1;
							  }else
							  {
							return 0;
							  }
						}
				
					};
					Collections.sort(list,empComparator);	
		}
		else
		{
			
		}
		
		
		
		
		
	}
	public static void main(String[] args) {
  // 2 1 3 5 4  // 4 5 3 1 2 

		List<Employee> empsList = new ArrayList<Employee>();
		
		Employee e1 = new Employee(1,"abc","123",20000.00);
		Employee e2 = new Employee(2,"babu","123",23000.00);
		Employee e3 = new Employee(3,"chandu","123",35000.00);
		Employee e4 = new Employee(5,"divya","123",14000.00);
		Employee e5 = new Employee(6,"Anandu","123",40000.00);
		empsList.add(e2);
		empsList.add(e1);
		empsList.add(e3);
		empsList.add(e5);
		empsList.add(e4);
		printList(empsList);
		System.out.println("*************************************");
		Collections.reverse(empsList);
	printList(empsList);
		
	System.out.println("******************************************");
	Comparator<Employee> empComp=Collections.reverseOrder();
		empsList.sort(empComp);
		printList(empsList);
		
		/*
		 * // Id : // Ascen Or Scanner sc=new Scanner(System.in);
		 * System.out.println("Eter the column to sort:");
		 * 
		 * String key = sc.next(); if(key.equals("id")) {
		 * System.out.println("Enter order : 1. Ascending 2.Descending"); int order =
		 * sc.nextInt(); // List , key , order if(order == 1) { sortEmployee(empsList);
		 * printList(empsList); } else { sortEmployee(empsList);
		 * Collections.reverse(empsList); printList(empsList); } }else
		 * if(key.equals("name")) {
		 * 
		 * System.out.println("Enter order : 1. Ascending 2.Descending"); int order =
		 * sc.nextInt();
		 * 
		 * if(order == 1 ) { sortEmployee(empsList, key); printList(empsList); } else {
		 * sortEmployee(empsList, key); Collections.reverse(empsList);
		 * printList(empsList);
		 * 
		 * }
		 * 
		 * } else if(key.equals("salary")) {
		 * System.out.println("Enter order : 1. Ascending 2.Descending"); int order =
		 * sc.nextInt();
		 * 
		 * if(order == 1 ) { sortEmployee(empsList, key); printList(empsList); } else {
		 * sortEmployee(empsList, key); Collections.reverse(empsList);
		 * printList(empsList);
		 * 
		 * } }else { System.out.println("Invalid Sort Option"); }
		 * 
		 */

	}

}
