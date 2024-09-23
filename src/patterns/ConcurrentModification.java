package patterns;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class ConcurrentModification {

	public static void main(String[] args) {

		CopyOnWriteArrayList<String> namelist = new CopyOnWriteArrayList<>();
		List<String> listOfnames = Arrays.asList("shivam", "mini", "sachin");

		namelist.addAll(listOfnames);

//		for (String names : namelist) {
//			namelist.remove("mini");
//		}

		// With the help of iterator we can remove while doing iteration
		Iterator<String> iter = namelist.iterator();
		while (iter.hasNext()) {
			String name = iter.next();

			if (name.equals("mini")) {
				//iter.remove();
				namelist.add("shibu");
			}

		}
		System.out.println(namelist);
	}
}
