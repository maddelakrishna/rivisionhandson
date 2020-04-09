package inherutance;

import java.util.Scanner;

public class InheritanceDemo {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		/*
		 * // Object will be created at run time Person p = new
		 * Person("aa","aa@gmail.com"); // Parent p.displayData(); // method call
		 * System.out.println("++++++++++++++++++++++++"); Student s = new
		 * Student("bb","bb@gmail.com",60); // Child
		 * 
		 * // IS-A
		 * 
		 * s.displayData(); //
		 */
		
	Scanner s = new Scanner(System.in);
	
	System.out.println("Enter Class Name");
	
	String className = s.next();
	
	Class c =Class.forName(className);
	
	  Person p = (Person) c.newInstance();
	
		 
		p.displayData();//
		
	}

}
