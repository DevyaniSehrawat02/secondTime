package HashMap;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class BookExample {

	public static void main(String[] args) {
		
		HashMap<Integer,Book> map=new HashMap<Integer,Book>();
		
		map.put(1, new Book(101,"rakesh","billu","manu",2));
		map.put(10, new Book(102,"ramu","shy","sona",15));
		map.put(9, new Book(110,"manoj","lela","hari",12));
		map.put(4, new Book(100,"birju","raja","mohan",22));
		
		for(Map.Entry<Integer, Book> entry:map.entrySet())
		{
			Integer key=entry.getKey();
			Book b=entry.getValue();
			System.out.println("key"+key+" "+b.display());
			//System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);
		}

	}

}
