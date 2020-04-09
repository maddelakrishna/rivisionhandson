package cf;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerExample {
	
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		//Employee e = new Employee(101, "krishna","12345");
		File file = new File("E:\\MindSpeed\\secondbatch\\employee.txt");
		FileInputStream fis = new FileInputStream(file);
		//FileOutputStream fos = new FileOutputStream(file);
		
	   //ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		  ObjectInputStream ois = new ObjectInputStream(fis);
		  
		  Employee e = (Employee) ois.readObject();
		  
		  System.out.println(e);
		 
		  //oos.writeObject(e);
		 // oos.flush(); // 
		System.out.println("Completed");
		
		
	}

}
