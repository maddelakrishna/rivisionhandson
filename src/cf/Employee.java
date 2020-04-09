package cf;

import java.io.Serializable;

public class Employee implements Comparable<Employee>, Serializable,Cloneable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	int id;
	String name;
	private transient String password;
	
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



	public void setName(String name) {
		this.name = name;
	}



	@Override
	public int compareTo(Employee o) {

		
		if(this.id > o.id)
		{
			return 1;
		}
		else if(this.id < o.id)
		{
			return -1;
			
		}
		else
		{
		return 0;
		}
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", password=" + password + "]";
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	
	
	
	

}
