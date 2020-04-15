package assignment;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;

public class Iodemo {
	public static List<Customer> listofcustomers() throws IOException{
		File f1=new File("customer.txt");
		FileReader fin=new FileReader(f1);
		BufferedReader bf=new BufferedReader(fin);
		List<Customer> l1=new ArrayList();
		String data;
		while((data=bf.readLine())!=null) {
			String str[]=data.split(",");
			Customer c=new Customer();
			c.setId(Integer.parseInt(str[0]));
			c.setName(str[1]);
			c.setEmail(str[2]);
			c.setMobile(str[3]);
			SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy");
			String date=str[4];
			Date d = null;
			try {
				d = sdf.parse(date);
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			c.setDob(d);
			Address a=new Address();
			a.setCity(str[5]);
			a.setState(str[6]);
			a.setCountry(str[7]);
			c.setAddress(a);
			l1.add(c);
		}
			return l1;	
		
	}
	public static void displayall() throws IOException {
		List<Customer> list=listofcustomers();
		for(Customer c1:list) {
			System.out.println(c1);
		}
		
	}
	public static int calculateage(Date dob) throws IOException {
		int age=2020-(dob.getYear()+1900);
		return age;
	}
	public static void displaybyage(int age) throws IOException{
		List<Customer> list=listofcustomers();
		List<Customer> l2=new ArrayList();
		for(Customer cus:list) {
			int age1=calculateage(cus.getDob());
			if(age1<age) {
				l2.add(cus);
			}
			
		}
		
		for(Customer c:l2) {
			System.out.println(c);
		}
		
	}
	public static void displaybycity(String name) throws IOException {
		List<Customer> list=listofcustomers();
		/*Comparator<Customer> c=(c1,c2)->{
			return c1.getAddress().getCity().compareTo(c2.getAddress().getCity());
		Collections.sort(list, c);
		};*/
		
		for(Customer cus:list) {
			if(cus.getAddress().getCity().equalsIgnoreCase(name)) {
				System.out.println(cus);
		}
			
		}
	}
	public static void main(String args[]) throws IOException {
		while(true) {
		System.out.println("Enter your choice");
		System.out.println("1:Display All Customers\t2:Display by age\t3:Display by city\t4:Transfer\t5:Replace\t6:Exit");
		Scanner sc=new Scanner(System.in);	
		int choice=Integer.parseInt(sc.next());
		switch(choice) {
		case 1:
			displayall();
			break;
		case 2:
			System.out.println("Enter age");
			int age=Integer.parseInt(sc.next());
			displaybyage(age);
			break;
		case 3:
			System.out.println("Enter city name");
			String name=sc.next();
			displaybycity(name);
			break;
		case 4:
			System.out.println("Enter old and new cities");
			String oldcity=sc.next();
			String newcity=sc.next();
			List<Customer> list=listofcustomers();
			int i=0;
			for(Customer c:list) {
				Address a1=c.getAddress();
				if(a1.getCity().equalsIgnoreCase(oldcity)) {
					a1.setCity(newcity);
					list.get(i).setAddress(a1);
				}
				i++;
			}
			
			for(Customer c1:list)
			{
				System.out.println(c1);
			}
			break;
		case 5:
			System.out.println("Enter id");
			int id=Integer.parseInt(sc.next());
			List<Customer> list2=listofcustomers();
			
			CopyOnWriteArrayList<Customer> list1 = new CopyOnWriteArrayList<Customer>(list2);
			
			int index=0;
			Customer cus=new Customer();
			cus.setId(51);
			cus.setName("bhavya");
			// [10,20,30,10,20]
			Iterator<Customer> l1=list1.iterator();
			while(l1.hasNext()) {
				if(l1.next().getId()==id) {
				//	list1.set(index, cus);
					list1.remove(index);
					//list1.get(index).setEmail("email");
					}
					index++;
				}
				
			
			/*for(Customer c1:list1) {
				if(c1.getId()==id) {
				list1.set(index, cus);
				}
				index++;
			}*/
			
			for(Customer cus1:list1) {
				System.out.println(cus1);
			}
			break;
			
			
			
			// New Customer
			
		case 6:
			System.exit(0);
		}
		
	}
	}

}
