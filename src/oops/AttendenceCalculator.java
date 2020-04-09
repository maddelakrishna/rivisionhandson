package oops;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class AttendenceCalculator {
	
	
	public  static int getAttCount(List<String> list)
	{
		
		
		int att =0;
		
		for(String s:list)
		{
			att++;
		}
		return att;
	}
	
	
	public static Map<String,String> empMap(String filePath)
	{
		Map<String,String> empIds = new HashMap<String,String>();
		try
		{
		  BufferedReader br = new BufferedReader(new FileReader(new File(filePath)));
		  
		  String line = br.readLine();
		  
		  while(line!=null)
		  {
			  //System.out.println(line);
			String emp[] =  line.split(",");
			
			empIds.put(emp[0],emp[1]);
			line = br.readLine();
		  }
		}catch (Exception e) {

e.printStackTrace();
		}
		
		return empIds;
		
	}
	public static void main(String[] args) throws IOException {
		
		
		File file = new File("E:\\MindSpeed\\secondbatch\\att.txt");
		FileReader fr = new FileReader(file);
		BufferedReader br= new BufferedReader(fr);
		List<String> list = new ArrayList<String>();
		String line= br.readLine();
		Map<String, String> emps = empMap("E:\\MindSpeed\\secondbatch\\Empids.txt");
		//System.out.println(emps);
		
		FileWriter fw = new FileWriter(new File("E:\\MindSpeed\\secondbatch\\attendence.txt"),true);
		
		PrintWriter out = new PrintWriter(fw);
		while(line!=null)
		{
			if(line.substring(0,1).matches("[1-9]"))
			{
				String emp = line.substring(0, 6);
				if(!list.contains(emp))
				{
				list.add(emp);
				}
			}
			
			line = br.readLine();
		}
		
		//System.out.println(list);
		
		System.out.println(list.size() +" "+emps.size());
		if(list.size()!=emps.size())
		{
			out.println(new Date().toString());

            Set<Map.Entry<String, String>> empset = emps.entrySet();
            
            Iterator<Map.Entry<String, String>> itr = empset.iterator();
            
            while(itr.hasNext())
            {
            	Map.Entry<String, String> entry =itr.next();
            	boolean s = list.contains(entry.getKey());
            //	System.out.println(s);
            	if(!s)
            	{
            		//System.out.println(entry.getKey());
            		out.println(entry.getKey() +" : "+entry.getValue()+" is absent");
            	}
            }
			
			out.println("Total "+emps.size()+" : "+" Present "+list.size());
			out.flush();
		}
		else
		{
			out.println(new Date().toString());
			out.println("All Present");
			out.flush();
		}
		int count = getAttCount(list);
		System.out.println(count);
		
		
	}

}
