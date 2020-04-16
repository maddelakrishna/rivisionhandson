package cf;

import java.util.function.BiConsumer;

public class CarConsumer implements BiConsumer<String, Integer> {

	@Override
	public void accept(String t, Integer u) {

   System.out.println(t+" -> "+u);
		
	}

}
