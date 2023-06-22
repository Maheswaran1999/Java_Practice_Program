package recall.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.stream.Collectors;

public class List {

	public static void main(String[] args) {
		ArrayList collection = new ArrayList();
		collection.add(10);
		collection.add(11);
		collection.add(12);
		collection.add(13);
		collection.addAll(4, collection);

		for (int i = 0; i < collection.size(); i++) {
			System.out.println(collection.get(i));
		}

		System.out.println("Sort the collection");
		Collections.sort(collection);
		System.out.println(collection.get(0));

		if (collection.isEmpty()) {
			System.out.println("The collection is empty");
		} else {
			System.out.println("The collection is not empty");
		}

	}
}
