package cf;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class CarFreequencyCount {

	public static void main(String[] args) throws IOException {

ArrayList<String> cars = new ArrayList<String>();
Map<String, Integer> carandfreequencymap = new LinkedHashMap<String, Integer>();


BufferedReader br = new BufferedReader(new FileReader(new File("vehicle.txt")));

String car = br.readLine();

while (car!=null)
{
	cars.add(car);
	car = br.readLine();
}
		 

for(String c:cars)
{
	carandfreequencymap.put(c,Collections.frequency(cars, c));
}

carandfreequencymap.forEach(new CarConsumer());


Set<Map.Entry<String, Integer>> entries = carandfreequencymap.entrySet();
System.out.println("The cars");

Map<String, Integer> sortedMap = new LinkedHashMap<String, Integer>();
entries.stream().sorted(Map.Entry.comparingByValue()).forEachOrdered(t->sortedMap.put(t.getKey(),t.getValue()));
System.out.println(sortedMap);
	}

}
