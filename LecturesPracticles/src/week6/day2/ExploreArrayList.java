package week6.day2;

//Package
import java.util.ArrayList;

//VVIP

public class ExploreArrayList {

	public static void main(String[] args) {
		//public class ArrayList<E> extends AbstractList<E> implements List<E>, RandomAccess, Cloneable, Serializable { }
		//Constructors
		//ArrayList()
		//ArrayList(Collection<? extends E> c)
		
		//ArrayList aList = new ArrayList();
		
		//Methods
		//boolean add(E e)
		/*
		aList.add(6);
		aList.add(8);
		aList.add(5);
		
		*/
		
		//void add(int index, E element)
		//aList.add(1, 9); //index-1, element-9
		
		//boolean addAll(int index, Collection<? extends E> c)
		/*
		ArrayList aList2 = new ArrayList();
		aList2.add(18);
		aList2.add(12);
		aList2.add(19);
		aList2.add(16);
		aList2.add(11);
		aList2.addAll(2, aList);
		
		*/
		
		//int size()
		//Integer count = aList2.size();
		//System.out.println(count);
		
		//void addFirst(E element)
		//void addLast(E element)
		//void clear()
		
		//Object clone()
		/*
		System.out.println(aList); //[6, 9, 8, 5]
		ArrayList aList3 = aList;//Copy by Reference (Address of Heap Memory)
		System.out.println(aList3);//[6, 9, 8, 5]
		aList.add(4);
		aList3.add(7);
		System.out.println(aList);//[6, 9, 8, 5, 4]
		System.out.println(aList3);
		
		Object aList4 = aList.clone(); //Copy by Value
		*/
		
		
		//boolean contains(Object o) - Search object - return boolean
		//int indexOf(Object o) - Search object - return index
		
		//Example
		/*
		ArrayList aList1 = new ArrayList();
		aList1.add(7);
		aList1.add(5);
		aList1.add(1);
		aList1.add(8);
		aList1.add(6);
		
		Integer num = 2;
		boolean res = aList1.contains(num);
		System.out.println(res);
		if(res==true) {
			System.out.println("found");
		}
		else {
			System.out.println("not found");
		}
		
		Integer num2 = aList1.indexOf(7);
		System.out.println(num2); //-1 for not found
		*/
		
		//boolean equals(Object o)
		/*
		ArrayList aList1 = new ArrayList();
		ArrayList aList2 = new ArrayList();
		boolean res = aList1.equals(aList2);
		System.out.println(res);
		aList1.add(4);
		res = aList1.equals(aList2);
		if(res==true) {
			System.out.println("Equals");
		}
		else {
			System.out.println("Not equals");
		}
		//System.out.println(res);
		*/
		
		//Example-2
		/*
		res = (aList1==aList2);
		if(res==true) {
			System.out.println("Equals");
		}
		else {
			System.out.println("Not equals");
		}
		*/
		
		//Example-3
		/*
		Integer num1 = aList1.hashCode();
		Integer num2 = aList1.hashCode();
		System.out.println(num1+", "+num2);
		if(num1==num2) {
			System.out.println("Equals");
		}
		else {
			System.out.println("Not Equals");
		}
		*/
		
		//void forEach(Consumer<? super E> action) --HW
		/*
		//Example
		ArrayList aList1 = new ArrayList();
		aList1.add(5);
		aList1.add(3);
		aList1.add(6);
		aList1.add(7);
		aList1.add(1);
		
		//Display all the elements of aList1
		//Example-1
		System.out.println(aList1);
		
		//Display all the elements individually
		//Example-2 for loop
		for(int i=0; i<aList1.size(); i++) {
			System.out.print(aList1.get(i)+" ");
		}
		System.out.println();
		
		//Example-3 for each next loop
		for(Object obj1: aList1) {
			System.out.print(obj1+" ");
		}
		System.out.println();
		*/
		
		//E get(int index)
		//E getFirst()
		//E getLast()
		//boolean isEmpty()
		
		//int indexOf(Object o) //first position
		//int lastIndexOf(Object o) //last position
		
		
		//E remove(int index) - based on index
		//Example-1
		/*
		Integer nums[]= {5,6,7,2,3,5,7,8,2,5,6,2,4,8};
		ArrayList aList1 = new ArrayList();
		//Convert integer array to arraylist in java?
		//Accessing the element of an array
		for(Integer num: nums) {
			aList1.add(num);
		}
		System.out.println(aList1); //[5, 6, 7, 2, 3, 5, 7, 8, 2, 5, 6, 2, 4, 8]
		Object element = aList1.remove(3); //index -3
		System.out.println(element);
		System.out.println(aList1);
		Object elementToRemove=5;
		*/
		
		//boolean remove(Object o) - based on value
		//Example-2
		/*
		boolean result = aList1.remove(elementToRemove);
		System.out.println(result);
		System.err.println(aList1);
		*/
		
		//boolean removeAll(Collection<?> c) - remove all provided values
		//Example-3
		Integer nums[]= {5,6,7,2,3,5,7,8,2,5,6,2,4,8};
		ArrayList aList1 = new ArrayList();
		//Convert integer array to arraylist in java?
		//Accessing the element of an array
		for(Integer num: nums) {
			aList1.add(num);
		}
		ArrayList aList2 = new ArrayList();
		aList2.add(5);
		aList2.add(2);
		System.out.println(aList1);
		System.out.println(aList2);
		boolean result = aList1.removeAll(aList2);
		System.out.println(result);
		System.out.println(aList1);
		System.out.println(aList2);
		
		//E removeFirst()
		//E removeLast()
		
		//E set(int index, E element)
		//E get(int index)
		
		//int size()
		//Object[] toArray()
	}
}
















