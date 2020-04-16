package cf;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Stream;

public class StreamsApiExample {

	public static void main(String[] args) {


		List<Integer> list = new ArrayList<Integer>();
		
		list.add(33);
		list.add(23);
		list.add(55);
		list.add(55);
		list.add(23);
		list.add(28);
		list.add(23);
		
	
	
		/*
		 * Stream<Integer> stream =list.stream();
		 * 
		 * 
		 * 
		 * //stream.forEach(t->System.out.println(t)); stream.sorted((Integer i1 ,
		 * Integer i2)-> { if(i1 > i2) return -1; else if(i1<i2) return 1; else return
		 * 0; }).forEach(t->System.out.println(t));;
		 * 
		 * System.out.println("*****************************");
		 * list.stream().filter((t)->t%2==0).forEach(t->System.out.println(t)); boolean
		 * st=list.stream().allMatch((t)->t%2!=0); System.out.println(st);
		 * 
		 * st = list.stream().anyMatch((t)->t%2==0); System.out.println(st);
		 * 
		 * list.stream().distinct().forEach(t->System.out.println(t));
		 */


	}

}
