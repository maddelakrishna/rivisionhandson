package cf;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {

	public static void main(String[] args) throws CloneNotSupportedException {


		Employee e = new Employee(101, "krishna","12345");
		ArrayList<Employee> emp = new ArrayList<Employee>(); // xyz 
		
		Employee e1 =  (Employee) e.clone();
		System.out.println(e1);

	}

}
