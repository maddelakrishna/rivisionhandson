package cf;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

import inherutance.Student;

public class ArrayListCaseStuddy1 {

	
	public static boolean storeEmployee(Employee emp)
	{
		
		boolean status = false;
		File file = new File("E:\\MindSpeed\\secondbatch\\employee.txt");
		FileOutputStream fos =null;
		ObjectOutputStream oos =null;
		try
		{
		 fos = new FileOutputStream(file,true);
			
			 oos = new ObjectOutputStream(fos);
			 
			 oos.writeObject(emp);
				oos.flush();
				
				// Login Form Validate 
				
		status =true;
		}catch (Exception e) {

  e.printStackTrace();
		}
		finally
		{
			try {
				oos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		return status;
	}
	
	public static  List<Employee> allEmps() 
	{
		List<Employee>  emps = new ArrayList<Employee>();
		boolean isMoreObject=true;
		
		File file = new File("E:\\MindSpeed\\secondbatch\\employee.txt");
		FileInputStream fis=null;
		ObjectInputStream ois=null;
		try
		{
			fis = new FileInputStream(file);
		
			 Employee e = null;
			   
			  while(isMoreObject)
			  {
					ois = new ObjectInputStream(fis);
				  e = (Employee) ois.readObject();
				  if(e!=null)
				  {
					 
				  emps.add(e);


				  }
				  else
				  {
					  isMoreObject =false;
				  }
			  }
			  
			
			
		}
		catch (EOFException e) {

      return emps;
		}
		catch (FileNotFoundException e) {

           e.printStackTrace();
		} catch (IOException e) {


			e.printStackTrace();
		} catch (ClassNotFoundException e1) {


			e1.printStackTrace();
		}
		finally
		{
			try {
				ois.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return emps;
	}
	
	public static Employee getEmployee(int id) 
	{
		
		Employee employee=null;
		List<Employee>  emps = allEmps();
		
		  for(Employee e1:emps)
		  {
			  if(e1.getId() == id)
			  {
				  employee = e1;
			  }
		  }
		
		 
	
		
		return employee;
	}
	
	
	public static void displayEmployees(String sortkey)
	{
		List<Employee> list = allEmps();
		 if(sortkey.equalsIgnoreCase("id"))
		 {
		Collections.sort(list);
		 }else if(sortkey.equalsIgnoreCase("name"))
		 {
			 Comparator<Employee> empComparator=(e1,e2)->{ 
				 return e1.getName().compareTo(e2.getName());
			 };
			 Collections.sort(list,empComparator);
		 }
		 else
		 {
			 
		 }
		for(Employee e: list)
		{
			System.out.println(e);
		}
	}
	
	public static void main(String[] args) {

		
		Scanner sc = new Scanner(System.in);
		while(true)
		{
		System.out.println("Select \n 1. Store Employee \n 2. Get Employee3 Display Employee \n 4. Exit");
		
		int option= sc.nextInt();
		
		if(option  == 1)
		{
			System.out.println("Enter Id,Name, Password");
			int id = sc.nextInt();
			String name=sc.next();
			String password = sc.next();
			Employee e = new Employee(id, name, password);
			boolean s = storeEmployee(e);
			if(s)
			{
				System.out.println("Stored");
			}else
			{
				System.out.println("Not Stored");
			}
			
		}
		
		if(option==2)
		{
			System.out.println("Enter id");
			int id = sc.nextInt();
			Employee e = getEmployee(id);
			System.out.println(e);
			
		}
		if(option == 3)
		{
			System.out.println("Enter Sort Key");
			String sk = sc.next();
			
		displayEmployees(sk);	
		}
		
		if(option == 4)
		{
			System.out.println("Byee");
			System.exit(0);
		}
		}

		
		
		
		
	}

}
