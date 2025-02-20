package working.collections;

import java.util.ArrayList;
import java.util.Iterator;

public class ExploreIterable {

	public static void main(String[] args) {
		//Package
		//java.lang
		
		//Interface Signature
		//public interface Iterable<T>
		
		//Methods
		//default void forEach(Consumer<? super T> action)
		//Iterator<T> iterator()
		//default Spliterator<T> spliterator()		
				
		ArrayList aList1=new ArrayList();
		aList1.add(4);
		aList1.add(5);
		aList1.add(2);
		aList1.add(1);
		aList1.add(7);
		
		//Example-1
		for(int i=0; i<aList1.size(); i++) {
			System.out.print(aList1.get(i)+" ");
		}
		System.out.println();
		
		//Example-2
		for(Object num: aList1) {
			System.out.print(num+" ");
		}
		System.out.println();
		
		//Example-3
		aList1.forEach((item)-> System.out.print(item+" "));
		System.out.println();
		
		//Example-4
		Iterator iterator = aList1.iterator();
		while(iterator.hasNext()) {
			System.out.print(iterator.next()+" ");
		}
		System.out.println();
	}
}
