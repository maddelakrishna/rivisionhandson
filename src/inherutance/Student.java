package inherutance;

public class Student  extends Person{

	    private int marks;
	
	
	public Student() {
		super() ;// call to super class Constructor
		this.marks = 30;
	}
	
	
	
	public void displayData()
	{
	System.out.println(name +" "+email +" "+marks);	
	}
	
	
	

}
