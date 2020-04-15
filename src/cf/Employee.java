package cf;

import java.io.Serializable;
//to define natural sorting order - Number - Ascending 
public class Employee implements Comparable<Employee>, Serializable,Cloneable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	int id;
	String name;
	private transient String password;
	
	private double salary;
	
	
	
	public Employee(int id, String name, String password, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.password = password;
		this.salary = salary;
	}



	// 10 employee
	public Employee(int id, String name, String password) {
		super();
		this.id = id;
		this.name = name;
		this.password = password;
	}
	
	
	
	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getName() {
		return name;
	}



	public double getSalary() {
		return salary;
	}



	public void setSalary(double salary) {
		this.salary = salary;
	}



	public void setName(String name) {
		this.name = name;
	}



	@Override
	public int compareTo(Employee o) {
return this.getName().compareTo(o.getName());
		
		/*
		 * if(this.id > o.id) { return 1; } else if(this.id < o.id) { return -1;
		 * 
		 * } else { return 0; }
		 */
	}

	
	
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}



	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	
	
	
	

}
