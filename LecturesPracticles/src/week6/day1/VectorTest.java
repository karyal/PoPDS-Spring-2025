package week6.day1;

import java.util.List;
import java.util.Vector;

public class VectorTest {

	public static void main(String[] args) {
		List list1 = new Vector();
		//boolean add(E e)
		boolean result = list1.add(3);
		result = list1.add(5);
		result = list1.add(7);
		
		//void add(int index, E element)
		list1.add(2, 6);
		list1.add(2, 9);
		
		System.out.println(list1);
		list1.add(4, 4);//index, value
		System.out.println(list1);
		
		//void clear()
		//list1.clear();
		//System.out.println(list1);
		
		//boolean contains(Object o)
		result = list1.contains(30);//search value 3 on list1
		System.out.println(result);
		
		//E get(int index)
		Object obj1 = list1.get(2); //value of index - 2
		System.out.println(obj1);
		
		//E getFirst()
		obj1 = list1.getFirst();
		System.out.println(obj1);
		
		//E getLast()
		obj1 = list1.getLast();
		System.out.println(obj1);
		
		//boolean isEmpty()
		result = list1.isEmpty();
		System.out.println(result);
		
		//E remove(int index)
		obj1 = list1.remove(2); //value of index -2
		System.out.println(list1);
		
		//boolean remove(Object o)
		obj1 = 7;
		//result = list1.remove(obj1);// remove value 7
		
		//E removeFirst()
		//obj1 = list1.removeFirst();
		
		//E removeLast()
		//obj1 = list1.removeLast();
		
		//List<E> reversed()
		List list2 = list1.reversed();
		System.out.println(list1); //5 7 8
		System.out.println(list2); //8 7 5
		
		//E set(int index, E element) //Update | Edit | Replace old value
		//list1.set(2,  11);
		//System.out.println(list1);
		
		//int size()
		Integer size = list1.size();
		System.out.println(size);
		
		//Object[] toArray()
		Object []arr1 = list1.toArray();
		System.out.println(arr1.length);
		System.out.println(arr1);//[Ljava.lang.Object;@279f2327
		
		//for each next loop
		for(Object tmpObj: arr1) {
			System.out.print(tmpObj+" ");
		}
		System.out.println();

		
		
		
		
		
		
		
		

	}

}
