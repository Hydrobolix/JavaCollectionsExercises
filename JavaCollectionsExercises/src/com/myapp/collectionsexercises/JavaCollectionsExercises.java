package com.myapp.collectionsexercises;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.PriorityQueue;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.TreeSet;

public class JavaCollectionsExercises {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	
	/*************************
	 * ArrayList
	 ************************/
	
	// 1. Write a Java program to create an array list, add some colors (strings) and print out the collection.
	public static void funcArrayList1() {
		List<String> list_Strings = new ArrayList<String>();
		list_Strings.add("Red");
		list_Strings.add("Green");
		list_Strings.add("Orange");
		list_Strings.add("White");
		list_Strings.add("Black");
		System.out.println(list_Strings);
		
	}

	// 2. Write a Java program to iterate through all elements in an array list.
	public static void funcArrayList2() {
		// Creae a list and add some colors to the list
		List<String> list_Strings = new ArrayList<String>();
		list_Strings.add("Red");
		list_Strings.add("Green");
		list_Strings.add("Orange");
		list_Strings.add("White");
		list_Strings.add("Black");
		// Print the list
		for (String element : list_Strings) {
			System.out.println(element);
		}
		
	}
	
	// 3. Write a Java program to insert an element into the array list at the first position.
	public static void funcArrayList3() {
		// Creae a list and add some colors to the list
		List<String> list_Strings = new ArrayList<String>();
		list_Strings.add("Red");
		list_Strings.add("Green");
		list_Strings.add("Orange");
		list_Strings.add("White");
		list_Strings.add("Black");
		// Print the list
		System.out.println(list_Strings);
		// Now insert a color at the first and last position of the list
		list_Strings.add(0, "Pink");
		list_Strings.add(5, "Yellow");
		// Print the list
		System.out.println(list_Strings);
		
	}

	// 4. Write a Java program to retrieve an element (at a specified index) from a given array list.
	public static void funcArrayList4() {
		// Creae a list and add some colors to the list
		List<String> list_Strings = new ArrayList<String>();
		list_Strings.add("Red");
		list_Strings.add("Green");
		list_Strings.add("Orange");
		list_Strings.add("White");
		list_Strings.add("Black");
		// Print the list
		System.out.println(list_Strings);
		// Retrive the first and third element
		String element = list_Strings.get(0);
		System.out.println("First element: "+element);
		element = list_Strings.get(2);
		System.out.println("Third element: "+element);
		
	}

	// 5. Write a Java program to update an array element by the given element.
	public static void funcArrayList5() {
		// Creae a list and add some colors to the list
		List<String> list_Strings = new ArrayList<String>();
		list_Strings.add("Red");
		list_Strings.add("Green");
		list_Strings.add("Orange");
		list_Strings.add("White");
		list_Strings.add("Black");
		// Print the list
		System.out.println(list_Strings);
		// Update the third element with "Yellow"
		list_Strings.set(2, "Yellow");
		// Print the list again
		System.out.println(list_Strings);
		
	}
	
	// 6. Write a Java program to remove the third element from an array list.
	public static void funcArrayList6() {
		// Creae a list and add some colors to the list
		List<String> list_Strings = new ArrayList<String>();
		list_Strings.add("Red");
		list_Strings.add("Green");
		list_Strings.add("Orange");
		list_Strings.add("White");
		list_Strings.add("Black");
		// Print the list
		System.out.println(list_Strings);
		// Remove the third element from the list.
		list_Strings.remove(2);
		// Print the list again
		System.out.println("After removing third element from the list:\n"+list_Strings);
		
	}

	// 7. Write a Java program to search for an element in an array list.
	public static void funcArrayList7() {
		// Creae a list and add some colors to the list
		List<String> list_Strings = new ArrayList<String>();
		list_Strings.add("Red");
		list_Strings.add("Green");
		list_Strings.add("Orange");
		list_Strings.add("White");
		list_Strings.add("Black");
		// Search the value Red
		if (list_Strings.contains("Red")) {
			System.out.println("Found the element");
		} else {
			System.out.println("There is no such element");
		}
		
	}
	
	// 8. Write a Java program to sort a given array list.
	public static void funcArrayList8() {
		// Creae a list and add some colors to the list
		List<String> list_Strings = new ArrayList<String>();
		list_Strings.add("Red");
		list_Strings.add("Green");
		list_Strings.add("Orange");
		list_Strings.add("White");
		list_Strings.add("Black");
		System.out.println("List before sort: "+list_Strings);
		Collections.sort(list_Strings);
		System.out.println("List after sort: "+list_Strings);
		
	}

	// 9. Write a Java program to copy one array list into another.
	public static void funcArrayList9() {
		List<String> List1 = new ArrayList<String>();
		List1.add("1");
		List1.add("2");
		List1.add("3");
		List1.add("4");
		System.out.println("List1: " + List1);
		List<String> List2 = new ArrayList<String>();
		List2.add("A");
		List2.add("B");
		List2.add("C");
		List2.add("D");
		System.out.println("List2: " + List2);
		// Copy List2 to List1
		Collections.copy(List1, List2);
		System.out.println("Copy List to List2,\nAfter copy:");
		System.out.println("List1: " + List1);
		System.out.println("List2: " + List2);
		
	}

	// 10. Write a Java program to shuffle elements in an array list.
	public static void funcArrayList10() {
		// Creae a list and add some colors to the list
		List<String> list_Strings = new ArrayList<String>();
		list_Strings.add("Red");
		list_Strings.add("Green");
		list_Strings.add("Orange");
		list_Strings.add("White");
		list_Strings.add("Black");
		System.out.println("List before shuffling:\n" + list_Strings);  
		Collections.shuffle(list_Strings);
		System.out.println("List after shuffling:\n" + list_Strings); 
		
	}

	// 11. Write a Java program to reverse elements in an array list.
	public static void funcArrayList11() {
		// Creae a list and add some colors to the list
		List<String> list_Strings = new ArrayList<String>();
		list_Strings.add("Red");
		list_Strings.add("Green");
		list_Strings.add("Orange");
		list_Strings.add("White");
		list_Strings.add("Black");
		System.out.println("Original list: " + list_Strings);
		List<String> sub_List = list_Strings.subList(0, 3);
		System.out.println("List of first three elements: " + sub_List);
		
	}

	// 12. Write a Java program to extract a portion of an array list.
	public static void funcArrayList12() {
		// Creae a list and add some colors to the list
		List<String> list_Strings = new ArrayList<String>();
		list_Strings.add("Red");
		list_Strings.add("Green");
		list_Strings.add("Orange");
		list_Strings.add("White");
		list_Strings.add("Black");
		System.out.println("Original list: " + list_Strings);
		List<String> sub_List = list_Strings.subList(0, 3);
		System.out.println("List of first three elements: " + sub_List);
		
	}

	// 13. Write a Java program to compare two array lists.
	public static void funcArrayList13() {
		ArrayList<String> c1= new ArrayList<String>();
		c1.add("Red");
		c1.add("Green");
		c1.add("Black");
		c1.add("White");
		c1.add("Pink");

		ArrayList<String> c2= new ArrayList<String>();
		c2.add("Red");
		c2.add("Green");
		c2.add("Black");
		c2.add("Pink");

		//Storing the comparison output in ArrayList<String>
		ArrayList<String> c3 = new ArrayList<String>();
		for (String e : c1)
			c3.add(c2.contains(e) ? "Yes" : "No");
		System.out.println(c3);
		
	}

	// 14. Write a Java program that swaps two elements in an array list.
	public static void funcArrayList14() {
		ArrayList<String> c1= new ArrayList<String>();
		c1.add("Red");
		c1.add("Green");
		c1.add("Black");
		c1.add("White");
		c1.add("Pink");

		System.out.println("Array list before Swap:");
		for(String a: c1){
			System.out.println(a);
		}
		//Swapping 1st(index 0) element with the 3rd(index 2) element
		Collections.swap(c1, 0, 2);
		System.out.println("Array list after swap:");
		for(String b: c1){
			System.out.println(b);
		}
		
	}

	// 15. Write a Java program to join two array lists.
	public static void funcArrayList15() {
		ArrayList<String> c1= new ArrayList<String>();
		c1.add("Red");
		c1.add("Green");
		c1.add("Black");
		c1.add("White");
		c1.add("Pink");
		System.out.println("List of first array: " + c1);
		ArrayList<String> c2= new ArrayList<String>();
		c2.add("Red");
		c2.add("Green");
		c2.add("Black");
		c2.add("Pink");
		System.out.println("List of second array: " + c2);

		// Let join above two list
		ArrayList<String> a = new ArrayList<String>();
		a.addAll(c1);
		a.addAll(c2);
		System.out.println("New array: " + a);
		
	}

	// 16. Write a Java program to clone an array list to another array list.
	public static void funcArrayList16() {
		ArrayList<String> c1= new ArrayList<String>();
		c1.add("Red");
		c1.add("Green");
		c1.add("Black");
		c1.add("White");
		c1.add("Pink");
		System.out.println("Original array list: " + c1);
		ArrayList<String> newc1 = (ArrayList<String>)c1.clone();
		System.out.println("Cloned array list: " + newc1); 
		
	}

	// 17. Write a Java program to empty an array list.
	public static void funcArrayList17() {
		ArrayList<String> c1= new ArrayList<String>();
		c1.add("Red");
		c1.add("Green");
		c1.add("Black");
		c1.add("White");
		c1.add("Pink");
		System.out.println("Original array list: " + c1);
		c1.removeAll(c1);
		System.out.println("Array list after remove all elements "+c1); 
		
	}

	// 18. Write a Java program to test whether an array list is empty or not.
	public static void funcArrayList18() {
		ArrayList<String> c1= new ArrayList<String>();
		c1.add("Red");
		c1.add("Green");
		c1.add("Black");
		c1.add("White");
		c1.add("Pink");
		System.out.println("Original array list: " + c1);
		System.out.println("Checking the above array list is empty or not! "+c1.isEmpty());
		c1.removeAll(c1);
		System.out.println("Array list after remove all elements "+c1);   
		System.out.println("Checking the above array list is empty or not! "+c1.isEmpty());
		
	}

	// 19. Write a Java program for trimming the capacity of an array list.
	public static void funcArrayList19() {
		ArrayList<String> c1= new ArrayList<String>();
		c1.add("Red");
		c1.add("Green");
		c1.add("Black");
		c1.add("White");
		c1.add("Pink");
		System.out.println("Original array list: " + c1);
		System.out.println("Let trim to size the above array: ");
		c1.trimToSize();
		System.out.println(c1);
		
	}

	// 20. Write a Java program to increase an array list size.
	public static void funcArrayList20() {
		ArrayList<String> c1= new ArrayList<String>(3);
		c1.add("Red");
		c1.add("Green");
		c1.add("Black");
		System.out.println("Original array list: " + c1);
		//Increase capacity to 6
		c1.ensureCapacity(6);
		c1.add("White");
		c1.add("Pink");
		c1.add("Yellow");
		System.out.println("New array list: " + c1);
		
	}

	// 21. Write a Java program to replace the second element of an ArrayList with the specified element.
	public static void funcArrayList21() {
		ArrayList<String>  color = new ArrayList<String>();

		color.add("Red");
		color.add("Green");

		System.out.println("Original array list: " + color);
		String new_color = "White";
		color.set(1,new_color);

		int num=color.size();
		System.out.println("Replace second element with 'White'."); 
		for(int i=0;i<num;i++)
			System.out.println(color.get(i));
		
	}

	// 22. Write a Java program to print all the elements of an ArrayList using the elements' position.
	public static void funcArrayList22() {
		ArrayList <String> c1 = new ArrayList <String> ();
		c1.add("Red");
		c1.add("Green");
		c1.add("Black");
		c1.add("White");
		c1.add("Pink");
		System.out.println("\nOriginal array list: " + c1);
		System.out.println("\nPrint using index of an element: ");
		int no_of_elements = c1.size();
		for (int index = 0; index < no_of_elements; index++)
			System.out.println(c1.get(index));
		
	}
	
	
	/*************************
	 * LinkedList
	 ************************/
	
	//1. Write a Java program to append the specified element to the end of a linked list.
	public static void funcLinkedListList1() {
		// create an empty linked list
		LinkedList<String> l_list = new LinkedList<String>();
		// use add() method to add values in the linked list
		l_list.add("Red");
		l_list.add("Green");
		l_list.add("Black");
		l_list.add("White");
		l_list.add("Pink");
		l_list.add("Yellow");

		// print the list
		System.out.println("The linked list: " + l_list);
		
	}
	
	//2. Write a Java program to iterate through all elements in a linked list.
	public static void funcLinkedListList2() {
		// create an empty linked list
		LinkedList<String> l_list = new LinkedList<String>();
		// use add() method to add values in the linked list
		l_list.add("Red");
		l_list.add("Green");
		l_list.add("Black");
		l_list.add("White");
		l_list.add("Pink");
		// Print the linked list
		for (String element : l_list) {
			System.out.println(element);
		}
		
	}
	
	//3. Write a Java program to iterate through all elements in a linked list starting at the specified position.
	public static void funcLinkedListList3() {
		// create an empty linked list
		LinkedList<String> l_list = new LinkedList<String>();
		// use add() method to add values in the linked list
		l_list.add("Red");
		l_list.add("Green");
		l_list.add("Black");
		l_list.add("White");
		l_list.add("Pink");
		// set Iterator at specified index
		Iterator<String> p = l_list.listIterator(1);

		// print list from second position
		while (p.hasNext()) {
			System.out.println(p.next());
		}
		
	}
	
	//4. Write a Java program to iterate a linked list in reverse order.
	public static void funcLinkedListList4() {
		// create an empty linked list
		LinkedList<String> l_list = new LinkedList<String>();
		// use add() method to add values in the linked list
		l_list.add("Red");
		l_list.add("Green");
		l_list.add("Black");
		l_list.add("Pink");
		l_list.add("orange");

		// print original list
		System.out.println("Original linked list:" + l_list);  

		Iterator<String> it = l_list.descendingIterator();

		// Print list elements in reverse order
		System.out.println("Elements in Reverse Order:");
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		
	}
	
	//5. Write a Java program to insert the specified element at the specified position in the linked list.
	public static void funcLinkedListList5() {
		// create an empty linked list
		LinkedList <String> l_list = new LinkedList <String> ();
		// use add() method to add values in the linked list
		l_list.add("Red");
		l_list.add("Green");
		l_list.add("Black");
		l_list.add("White");
		l_list.add("Pink");
		System.out.println("Original linked list: ");
		System.out.println("Let add the Yellow color after the Red Color: " + l_list);
		l_list.add(1, "Yellow");
		// print the list
		System.out.println("The linked list:" + l_list);
		
	}
	
	//6. Write a Java program to insert elements into the linked list at the first and last positions.
	public static void funcLinkedListList6() {
		// create an empty linked list
		LinkedList<String> l_list = new LinkedList<String>();
		// use add() method to add values in the linked list
		l_list.add("Red");
		l_list.add("Green");
		l_list.add("Black");
		System.out.println("Original linked list:" + l_list);    
		// Add an element at the beginning 
		l_list.addFirst("White");

		// Add an element at the end of list 
		l_list.addLast("Pink");
		System.out.println("Final linked list:" + l_list); 
		
	} 
	
	//7. Write a Java program to insert the specified element at the front of a linked list.
	public static void funcLinkedListList7() {
		// create an empty linked list
		LinkedList<String> l_list = new LinkedList<String>();
		// use add() method to add values in the linked list
		l_list.add("Red");
		l_list.add("Green");
		l_list.add("Black");
		System.out.println("Original linked list:" + l_list);    
		// Add an element to front of LinkedList
		l_list.offerFirst("Pink");
		System.out.println("Final linked list:" + l_list); 
		
	}
	
	//8. Write a Java program to insert the specified element at the end of a linked list.
	public static void funcLinkedListList8() {
		// create an empty linked list
		LinkedList<String> l_list = new LinkedList<String>();
		// use add() method to add values in the linked list
		l_list.add("Red");
		l_list.add("Green");
		l_list.add("Black");
		System.out.println("Original linked list:" + l_list);    
		// Add an element at the end of a linked list
		l_list.offerLast("Pink");
		System.out.println("Final linked list:" + l_list); 
		
	}
	
	//9. Write a Java program to insert some elements at the specified position into a linked list.
	public static void funcLinkedListList9() {
		// create an empty linked list
		LinkedList <String> l_list = new LinkedList <String> ();
		// use add() method to add values in the linked list
		l_list.add("Red");
		l_list.add("Green");
		l_list.add("Black");

		// print original list
		System.out.println("Original linked list:" + l_list);

		// create a new collection and add some elements

		LinkedList <String> new_l_list = new LinkedList <String> ();
		new_l_list.add("White");
		new_l_list.add("Pink");

		// Add the collection in the second position of the existing linked list
		l_list.addAll(1, new_l_list);

		// print the new list
		System.out.println("LinkedList:" + l_list);
		
	}

	//10. Write a Java program to get the first and last occurrence of the specified elements in a linked list.
	public static void funcLinkedListList10() {
		// create an empty linked list
		LinkedList<String> l_list = new LinkedList<String>();
		// use add() method to add values in the linked list
		l_list.add("Red");
		l_list.add("Green");
		l_list.add("Black");
		l_list.add("Pink");
		l_list.add("orange");

		// print original list
		System.out.println("Original linked list:" + l_list);  

		// Find first element of the List
		Object first_element = l_list.getFirst();
		System.out.println("First Element is: "+first_element);

		// Find last element of the List
		Object last_element = l_list.getLast();
		System.out.println("Last Element is: "+last_element);
		
	}

	//11. Write a Java program to display elements and their positions in a linked list.
	public static void funcLinkedListList11() {
		// create an empty linked list
		LinkedList<String> l_list = new LinkedList<String>();
		// use add() method to add values in the linked list
		l_list.add("Red");
		l_list.add("Green");
		l_list.add("Black");
		l_list.add("Pink");
		l_list.add("orange");

		// print original list
		System.out.println("Original linked list:" + l_list);  
		for(int p=0; p < l_list.size(); p++)
		{
			System.out.println("Element at index "+p+": "+l_list.get(p));
		} 
		
	}

	//12. Write a Java program to remove a specified element from a linked list.
	public static void funcLinkedListList12() {
		// create an empty linked list
		LinkedList <String> l_list = new LinkedList <String> ();
		// use add() method to add values in the linked list
		l_list.add("Red");
		l_list.add("Green");
		l_list.add("Black");
		l_list.add("Pink");
		l_list.add("orange");

		// print the list
		System.out.println("The Original linked list: " + l_list);

		// Remove the element in third position from the said linked list
		l_list.remove(2);
		System.out.println("The New linked list: " + l_list);
		
	}

	//13. Write a Java program to remove the first and last elements from a linked list.
	public static void funcLinkedListList13() {
		// create an empty linked list
		LinkedList<String> l_list = new LinkedList<String>();
		// use add() method to add values in the linked list
		l_list.add("Red");
		l_list.add("Green");
		l_list.add("Black");
		l_list.add("Pink");
		l_list.add("orange");

		// print the list
		System.out.println("The Original linked list: " + l_list);

		// Remove the first element
		Object firstElement = l_list.removeFirst();
		System.out.println("Element removed: "+ firstElement);

		// Remove the last element
		Object lastElement = l_list.removeLast();
		System.out.println("Element removed: "+ lastElement);
		System.out.println("The New linked list: " + l_list);
		
	}

	//14. Write a Java program to remove all elements from a linked list.
	public static void funcLinkedListList14() {
		// create an empty linked list
		LinkedList<String> l_list = new LinkedList<String>();
		// use add() method to add values in the linked list
		l_list.add("Red");
		l_list.add("Green");
		l_list.add("Black");
		l_list.add("Pink");
		l_list.add("orange");

		// print the list
		System.out.println("The Original linked list: " + l_list);

		// Removing all the elements from the linked list
		l_list.clear();

		System.out.println("The New linked list: " + l_list);
		
	}

	//15. Write a Java program that swaps two elements in a linked list.
	public static void funcLinkedListList15() {
		// create an empty linked list
		LinkedList <String> l_list = new LinkedList <String> ();
		// use add() method to add values in the linked list
		l_list.add("Red");
		l_list.add("Green");
		l_list.add("Black");
		l_list.add("Pink");
		l_list.add("orange");
		// print the list
		System.out.println("The Original linked list: " + l_list);

		//Swapping 1st(index 0) element(Red) with the 3rd(index 2) element (Black)
		Collections.swap(l_list, 0, 2);
		System.out.println("The New linked list after swap: " + l_list);
		
	}

	//16. Write a Java program to shuffle elements in a linked list.
	public static void funcLinkedListList16() {
		// create an empty linked list
		LinkedList <String> l_list = new LinkedList <String> ();
		// use add() method to add values in the linked list
		l_list.add("Red");
		l_list.add("Green");
		l_list.add("Black");
		l_list.add("Pink");
		l_list.add("orange");
		// print the list
		System.out.println("Linked list before shuffling:\n" + l_list);  
		Collections.shuffle(l_list);
		System.out.println("Linked list after shuffling:\n" + l_list); 
		
	}

	//17. Write a Java program to join two linked lists.
	public static void funcLinkedListList17() {
		// create an empty linked list
		LinkedList <String> c1 = new LinkedList <String> ();

		c1.add("Red");
		c1.add("Green");
		c1.add("Black");
		c1.add("White");
		c1.add("Pink");
		System.out.println("List of first linked list: " + c1);
		LinkedList <String> c2 = new LinkedList <String> ();
		c2.add("Red");
		c2.add("Green");
		c2.add("Black");
		c2.add("Pink");
		System.out.println("List of second linked list: " + c2);

		// Let join above two list
		LinkedList <String> a = new LinkedList <String> ();
		a.addAll(c1);
		a.addAll(c2);
		System.out.println("New linked list: " + a);
		
	}

	//18. Write a Java program to copy a linked list to another linked list.
	public static void funcLinkedListList18() {
		// create an empty linked list
		LinkedList <String> c1 = new LinkedList <String> ();
		c1.add("Red");
		c1.add("Green");
		c1.add("Black");
		c1.add("White");
		c1.add("Pink");
		System.out.println("Original linked  list: " + c1);
		LinkedList <String> newc1 = new LinkedList <String> ();
		newc1 = (LinkedList<String>)c1.clone();
		System.out.println("Cloned linked list: " + newc1);      
		
	}

	//19. Write a Java program to remove and return the first element of a linked list.
	public static void funcLinkedListList19() {
		// create an empty linked list
		LinkedList <String> c1 = new LinkedList <String> ();
		c1.add("Red");
		c1.add("Green");
		c1.add("Black");
		c1.add("White");
		c1.add("Pink");
		System.out.println("Original linked  list: " + c1);

		System.out.println("Removed element: "+c1.pop());

		System.out.println("Linked list after pop operation: "+c1);
		
	}

	//20. Write a Java program to retrieve, but not remove, the first element of a linked list.
	public static void funcLinkedListList20() {
		// create an empty linked list
		LinkedList <String> c1 = new LinkedList <String> ();
		c1.add("Red");
		c1.add("Green");
		c1.add("Black");
		c1.add("White");
		c1.add("Pink");
		System.out.println("Original linked list: " + c1); 
		// Retrieve but does not remove, the first element of a linked list
		String x = c1.peekFirst();
		System.out.println("First element in the list: " + x);
		System.out.println("Original linked list: " + c1);   
		
	}

	//21. Write a Java program to retrieve, but not remove, the last element of a linked list.
	public static void funcLinkedListList21() {
		// create an empty linked list
		LinkedList <String> c1 = new LinkedList <String> ();
		c1.add("Red");
		c1.add("Green");
		c1.add("Black");
		c1.add("White");
		c1.add("Pink");
		System.out.println("Original linked list: " + c1);    
		// Retrieve but does not remove, the last element of a linked list
		String x = c1.peekLast();
		System.out.println("Last element in the list: " + x);
		System.out.println("Original linked list: " + c1);
		
	}

	//22. Write a Java program to check if a particular element exists in a linked list.
	public static void funcLinkedListList22() {
		// create an empty linked list
		LinkedList <String> c1 = new LinkedList <String> ();
		c1.add("Red");
		c1.add("Green");
		c1.add("Black");
		c1.add("White");
		c1.add("Pink");
		System.out.println("Original linked list: " + c1);

		// Checks whether the color "Green" exists or not.
		if (c1.contains("Green")) {
			System.out.println("Color Green is present in the linked list.");
		} else {
			System.out.println("Color Green is not present in the linked list.");
		}

		// Checks whether the color "Orange" exists or not.
		if (c1.contains("Orange")) {
			System.out.println("Color Orange is present in the linked list.");
		} else {
			System.out.println("Color Orange is not present in the linked list.");
		}
		
	}

	//23. Write a Java program to convert a linked list to an array list.
	public static void funcLinkedListList23() {
		// create an empty linked list
		LinkedList <String> linked_list = new LinkedList <String> ();
		linked_list.add("Red");
		linked_list.add("Green");
		linked_list.add("Black");
		linked_list.add("White");
		linked_list.add("Pink");
		System.out.println("Original linked list: " + linked_list);

		//Convert a linked list to array list    
		List<String> list = new ArrayList<String>(linked_list);

		for (String str : list){
			System.out.println(str);
		}
		
	}

	//24. Write a Java program to compare two linked lists.
	public static void funcLinkedListList24() {
		LinkedList<String> c1= new LinkedList<String>();
		c1.add("Red");
		c1.add("Green");
		c1.add("Black");
		c1.add("White");
		c1.add("Pink");

		LinkedList<String> c2= new LinkedList<String>();
		c2.add("Red");
		c2.add("Green");
		c2.add("Black");
		c2.add("Orange");

		//comparison output in linked list
		LinkedList<String> c3 = new LinkedList<String>();
		for (String e : c1)
			c3.add(c2.contains(e) ? "Yes" : "No");
		System.out.println(c3);     
		
	}

	//25. Write a Java program to check if a linked list is empty or not.
	public static void funcLinkedListList25() {
		LinkedList<String> c1= new LinkedList<String>();
		c1.add("Red");
		c1.add("Green");
		c1.add("Black");
		c1.add("White");
		c1.add("Pink");
		System.out.println("Original linked list: " + c1);
		System.out.println("Check the above linked list is empty or not! "+c1.isEmpty());
		c1.removeAll(c1);
		System.out.println("Linked list after remove all elements "+c1);   
		System.out.println("Check the above linked list is empty or not! "+c1.isEmpty());
		
	} 

	//26. Write a Java program to replace an element in a linked list.
	public static void funcLinkedListList26() {
		LinkedList<String> c1= new LinkedList<String>();
		c1.add("Red");
		c1.add("Green");
		c1.add("Black");
		c1.add("White");
		c1.add("Pink");
		System.out.println("Original linked list: " + c1);
		// Replacing 2nd element with new value
		c1.set(1, "Orange");
		System.out.println("The value of second element changed.");
		System.out.println("New linked list: " + c1);
		
	}
	
	
	/*************************
	 * HashSet
	 ************************/
	//1. Write a Java program to append the specified element to the end of a hash set.
	public static void funcHashSet1() {
		// Create a empty hash set
		HashSet<String> h_set = new HashSet<String>();
		// use add() method to add values in the hash set
		h_set.add("Red");
		h_set.add("Green");
		h_set.add("Black");
		h_set.add("White");
		h_set.add("Pink");
		h_set.add("Yellow");

		// print the hash set
		System.out.println("The Hash Set: " + h_set);

	} 

	//2. Write a Java program to iterate through all elements in a hash list.
	public static void funcHashSet2() {
		// Create a empty hash set
		HashSet<String> h_set = new HashSet<String>();
		// use add() method to add values in the hash set
		h_set.add("Red");
		h_set.add("Green");
		h_set.add("Black");
		h_set.add("White");
		h_set.add("Pink");
		h_set.add("Yellow");

		// set Iterator 
		Iterator<String> p = h_set.iterator();
		// Iterate the hash set
		while (p.hasNext()) {
			System.out.println(p.next());
		}

	}

	//3. Write a Java program to get the number of elements in a hash set.
	public static void funcHashSet3() {
		// Create a empty hash set
		HashSet<String> h_set = new HashSet<String>();
		// use add() method to add values in the hash set
		h_set.add("Red");
		h_set.add("Green");
		h_set.add("Black");
		h_set.add("White");
		h_set.add("Pink");
		h_set.add("Yellow");
		System.out.println("Original Hash Set: " + h_set);
		System.out.println("Size of the Hash Set: " + h_set.size());

	}

	//4. Write a Java program to empty an hash set.
	public static void funcHashSet4() {
		// Create a empty hash set
		HashSet<String> h_set = new HashSet<String>();
		// use add() method to add values in the hash set
		h_set.add("Red");
		h_set.add("Green");
		h_set.add("Black");
		h_set.add("White");
		h_set.add("Pink");
		h_set.add("Yellow");
		System.out.println("Original Hash Set: " + h_set);
		// Remove all elements
		h_set.removeAll(h_set);
		System.out.println("Hash Set after removing all the elements "+h_set);

	}

	//5. Write a Java program to test if a hash set is empty or not.
	public static void funcHashSet5() {
		// Create a empty hash set
		HashSet<String> h_set = new HashSet<String>();
		// use add() method to add values in the hash set
		h_set.add("Red");
		h_set.add("Green");
		h_set.add("Black");
		h_set.add("White");
		h_set.add("Pink");
		h_set.add("Yellow");
		System.out.println("Original Hash Set: " + h_set);
		System.out.println("Checking the above array list is empty or not! "+h_set.isEmpty());
		System.out.println("Remove all the elements from a Hash Set: ");
		h_set.removeAll(h_set);
		System.out.println("Hash Set after removing all the elements "+h_set);   

	}

	//6. Write a Java program to clone a hash set to another hash set.
	public static void funcHashSet6() {
		// Create a empty hash set
		HashSet<String> h_set = new HashSet<String>();
		// use add() method to add values in the hash set
		h_set.add("Red");
		h_set.add("Green");
		h_set.add("Black");
		h_set.add("White");
		h_set.add("Pink");
		h_set.add("Yellow");
		System.out.println("Original Hash Set: " + h_set);
		HashSet <String> new_h_set = new HashSet <String> ();
		new_h_set = (HashSet<String>)h_set.clone();
		System.out.println("Cloned Hash Set: " + new_h_set);  

	}

	//7. Write a Java program to convert a hash set to an array.
	public static void funcHashSet7() {
		// Create a empty hash set
		HashSet<String> h_set = new HashSet<String>();
		// use add() method to add values in the hash set
		h_set.add("Red");
		h_set.add("Green");
		h_set.add("Black");
		h_set.add("White");
		h_set.add("Pink");
		h_set.add("Yellow");
		System.out.println("Original Hash Set: " + h_set);
		// Creating an Array
		String[] new_array = new String[h_set.size()];
		h_set.toArray(new_array);

		// Displaying Array elements
		System.out.println("Array elements: ");
		for(String element : new_array){
			System.out.println(element);
		}

	}

	//8. Write a Java program to convert a hash set to a tree set.
	public static void funcHashSet8() {
		// Create a empty hash set
		HashSet<String> h_set = new HashSet<String>();
		// use add() method to add values in the hash set
		h_set.add("Red");
		h_set.add("Green");
		h_set.add("Black");
		h_set.add("White");
		h_set.add("Pink");
		h_set.add("Yellow");
		System.out.println("Original Hash Set: " + h_set);

		// Creat a TreeSet of HashSet elements
		Set<String> tree_set = new TreeSet<String>(h_set);

		// Display TreeSet elements
		System.out.println("TreeSet elements: ");
		for(String element : tree_set){
			System.out.println(element);
		}

	}

	//9. Write a Java program to find numbers less than 7 in a tree set.
	public static void funcHashSet9() {
		// Create a empty hash set
		HashSet<String> h_set = new HashSet<String>();
		// use add() method to add values in the hash set
		h_set.add("Red");
		h_set.add("Green");
		h_set.add("Black");
		h_set.add("White");
		h_set.add("Pink");
		h_set.add("Yellow");
		System.out.println("Original Hash Set: " + h_set);

		// Create a List from HashSet elements
		List<String> list = new ArrayList<String>(h_set);

		// Display ArrayList elements
		System.out.println("ArrayList contains: "+ list);

	}

	//10. Write a Java program to compare two hash set.
	public static void funcHashSet10() {
		// Create a empty hash set
		HashSet<String> h_set = new HashSet<String>();
		// use add() method to add values in the hash set
		h_set.add("Red");
		h_set.add("Green");
		h_set.add("Black");
		h_set.add("White");

		HashSet<String>h_set2 = new HashSet<String>();
		h_set2.add("Red");
		h_set2.add("Pink");
		h_set2.add("Black");
		h_set2.add("Orange");
		//comparison output in hash set
		HashSet<String>result_set = new HashSet<String>();
		for (String element : h_set){
			System.out.println(h_set2.contains(element) ? "Yes" : "No");
		}

	}

	//11. Write a Java program to compare two sets and retain elements that are the same.
	public static void funcHashSet11() {
		// Create a empty hash set
		HashSet<String> h_set1 = new HashSet<String>();
		// use add() method to add values in the hash set
		h_set1.add("Red");
		h_set1.add("Green");
		h_set1.add("Black");
		h_set1.add("White");
		System.out.println("Frist HashSet content: "+h_set1);
		HashSet<String>h_set2 = new HashSet<String>();
		h_set2.add("Red");
		h_set2.add("Pink");
		h_set2.add("Black");
		h_set2.add("Orange");
		System.out.println("Second HashSet content: "+h_set2);
		h_set1.retainAll(h_set2);
		System.out.println("HashSet content:");
		System.out.println(h_set1);
		
	}

	//12. Write a Java program to remove all elements from a hash set.
	public static void funcHashSet12() {
		// Create a empty hash set
		HashSet<String> h_set = new HashSet<String>();
		// use add() method to add values in the hash set
		h_set.add("Red");
		h_set.add("Green");
		h_set.add("Black");
		h_set.add("White");
		System.out.println("Original hash set contains: "+ h_set);
		//  clear() method removes all the elements from a hash set
		// and the set becomes empty.
		h_set.clear();

		// Display original hash set content again
		System.out.println("HashSet content: "+h_set);
		
	}
	
	
	/*************************
	 * TreeSet
	 ************************/
	//1. Write a Java program to create a tree set, add some colors (strings) and print out the tree set.
	public static void funcTreeSet1() {
		TreeSet<String> tree_set = new TreeSet<String>();
		tree_set.add("Red");
		tree_set.add("Green");
		tree_set.add("Orange");
		tree_set.add("White");
		tree_set.add("Black");
		System.out.println("Tree set: ");
		System.out.println(tree_set);

	}

	//2. Write a Java program to iterate through all elements in a tree set.
	public static void funcTreeSet2() {
		TreeSet<String> tree_set = new TreeSet<String>();
		tree_set.add("Red");
		tree_set.add("Green");
		tree_set.add("Orange");
		tree_set.add("White");
		tree_set.add("Black");
		// Print the tree list
		for (String element : tree_set) {
			System.out.println(element);
		}

	} 

	//3. Write a Java program to add all the elements of a specified tree set to another tree set.
	public static void funcTreeSet3() {
		TreeSet<String> tree_set1 = new TreeSet<String>();
		tree_set1.add("Red");
		tree_set1.add("Green");
		tree_set1.add("Orange");
		System.out.println("Tree set1: "+tree_set1);
		TreeSet<String> tree_set2 = new TreeSet<String>();
		tree_set2.add("Pink");
		tree_set2.add("White");
		tree_set2.add("Black");
		System.out.println("Tree set2: "+tree_set2);
		// adding treetwo to treeone
		tree_set1.addAll(tree_set2);
		System.out.println("Tree set1: "+tree_set1);

	}

	//4. Write a Java program to create a reverse order view of the elements contained in a given tree set.
	public static void funcTreeSet4() {
		// create an empty tree set
		TreeSet<String> t_set = new TreeSet<String>();
		// use add() method to add values in the tree set
		t_set.add("Red");
		t_set.add("Green");
		t_set.add("Black");
		t_set.add("Pink");
		t_set.add("orange");
		// print original list
		System.out.println("Original tree set:" + t_set);  
		Iterator<String> it = t_set.descendingIterator();
		// Print list elements in reverse order
		System.out.println("Elements in Reverse Order:");
		while (it.hasNext()) {
			System.out.println(it.next());
		}

	}

	//5. Write a Java program to get the first and last elements in a tree set.
	public static void funcTreeSet5() {
		TreeSet<String> tree_set = new TreeSet<String>();
		tree_set.add("Red");
		tree_set.add("Green");
		tree_set.add("Orange");
		tree_set.add("White");
		tree_set.add("Black");
		System.out.println("Tree set: ");
		System.out.println(tree_set);

		// Find first element of the tree set
		Object first_element = tree_set.first();
		System.out.println("First Element is: "+first_element);

		// Find last element of the tree set
		Object last_element = tree_set.last();
		System.out.println("Last Element is: "+last_element);

	}

	//6. Write a Java program to clone a tree set list to another tree set.
	public static void funcTreeSet6() {
		// create an empty tree set
		TreeSet<String> t_set = new TreeSet<String>();
		// use add() method to add values in the tree set
		t_set.add("Red");
		t_set.add("Green");
		t_set.add("Black");
		t_set.add("Pink");
		t_set.add("orange");

		System.out.println("Original tree set:" + t_set);  
		TreeSet<String> new_t_set = (TreeSet<String>)t_set.clone();
		System.out.println("Cloned tree list: " + t_set);      

	}

	//7. Write a Java program to get the number of elements in a tree set.
	public static void funcTreeSet7() {
		// create an empty tree set
		TreeSet<String> t_set = new TreeSet<String>();
		// use add() method to add values in the tree set
		t_set.add("Red");
		t_set.add("Green");
		t_set.add("Black");
		t_set.add("Pink");
		t_set.add("orange");
		System.out.println("Original tree set: " + t_set);
		System.out.println("Size of the tree set: " + t_set.size());

	}

	//8. Write a Java program to compare two tree sets.
	public static void funcTreeSet8() {
		// Create a empty tree set
		TreeSet<String> t_set1 = new TreeSet<String>();
		// use add() method to add values in the tree set
		t_set1.add("Red");
		t_set1.add("Green");
		t_set1.add("Black");
		t_set1.add("White");
		System.out.println("Free Tree set: "+t_set1);

		TreeSet<String> t_set2 = new TreeSet<String>();
		t_set2.add("Red");
		t_set2.add("Pink");
		t_set2.add("Black");
		t_set2.add("Orange");
		System.out.println("Second Tree set: "+t_set2);
		//comparison output in tree set
		TreeSet<String> result_set = new TreeSet<String>();
		for (String element : t_set1){
			System.out.println(t_set2.contains(element) ? "Yes" : "No");
		}      

	}

	//9. Write a Java program to find numbers less than 7 in a tree set.
	public static void funcTreeSet9() {
		// creating TreeSet 
		TreeSet <Integer>tree_num = new TreeSet<Integer>();
		TreeSet <Integer>treeheadset = new TreeSet<Integer>();

		// Add numbers in the tree
		tree_num.add(1);
		tree_num.add(2);
		tree_num.add(3);
		tree_num.add(5);
		tree_num.add(6);
		tree_num.add(7);
		tree_num.add(8);
		tree_num.add(9);
		tree_num.add(10);

		// Find numbers less than 7
		treeheadset = (TreeSet<Integer>)tree_num.headSet(7);  

		// create an iterator
		Iterator<Integer> iterator;
		iterator = treeheadset.iterator();

		//Displaying the tree set data
		System.out.println("Tree set data: ");     
		while (iterator.hasNext()){
			System.out.println(iterator.next() + " ");
		}

	}

	//10. Write a Java program to get the element in a tree set which is greater than or equal to the given element.
	public static void funcTreeSet10() {
		// creating TreeSet 
		TreeSet <Integer>tree_num = new TreeSet<Integer>();
		TreeSet <Integer>treeheadset = new TreeSet<Integer>();

		// Add numbers in the tree
		tree_num.add(10);
		tree_num.add(22);
		tree_num.add(36);
		tree_num.add(25);
		tree_num.add(16);
		tree_num.add(70);
		tree_num.add(82);
		tree_num.add(89);
		tree_num.add(14);

		System.out.println("Greater than or equal to 86 : "+tree_num.ceiling(86));
		System.out.println("Greater than or equal to 29 : "+tree_num.ceiling(29));

	}

	//11. Write a Java program to get the element in a tree set less than or equal to the given element.
	public static void funcTreeSet11() {
		// creating TreeSet 
		TreeSet <Integer>tree_num = new TreeSet<Integer>();
		TreeSet <Integer>treeheadset = new TreeSet<Integer>();

		// Add numbers in the tree
		tree_num.add(10);
		tree_num.add(22);
		tree_num.add(36);
		tree_num.add(25);
		tree_num.add(16);
		tree_num.add(70);
		tree_num.add(82);
		tree_num.add(89);
		tree_num.add(14);

		System.out.println("Less than or equal to 86 : "+tree_num.floor(86));
		System.out.println("Less than or equal to 29 : "+tree_num.floor(29));

	} 

	//12. Write a Java program to get the element in a tree set strictly greater than or equal to the given element.
	public static void funcTreeSet12() {
		// creating TreeSet 
		TreeSet <Integer>tree_num = new TreeSet<Integer>();
		TreeSet <Integer>treeheadset = new TreeSet<Integer>();

		// Add numbers in the tree
		tree_num.add(10);
		tree_num.add(22);
		tree_num.add(36);
		tree_num.add(25);
		tree_num.add(16);
		tree_num.add(70);
		tree_num.add(82);
		tree_num.add(89);
		tree_num.add(14);

		System.out.println("Strictly greater than 76 : "+tree_num.higher(76));
		System.out.println("Strictly greater than 31 : "+tree_num.higher(31));

	} 

	//13. Write a Java program to get an element in a tree set that has a lower value than the given element.
	public static void funcTreeSet13() {
		// creating TreeSet 
		TreeSet <Integer>tree_num = new TreeSet<Integer>();
		TreeSet <Integer>treeheadset = new TreeSet<Integer>();

		// Add numbers in the tree
		tree_num.add(10);
		tree_num.add(22);
		tree_num.add(36);
		tree_num.add(25);
		tree_num.add(16);
		tree_num.add(70);
		tree_num.add(82);
		tree_num.add(89);
		tree_num.add(14);

		System.out.println("Strictly less than 69 : "+tree_num.lower(69));
		System.out.println("Strictly less than 12 : "+tree_num.lower(12));

	}

	//14. Write a Java program to retrieve and remove the first element of a tree set.
	public static void funcTreeSet14() {
		// creating TreeSet 
		TreeSet <Integer>tree_num = new TreeSet<Integer>();
		TreeSet <Integer>treeheadset = new TreeSet<Integer>();

		// Add numbers in the tree
		tree_num.add(10);
		tree_num.add(22);
		tree_num.add(36);
		tree_num.add(25);
		tree_num.add(16);
		tree_num.add(70);
		tree_num.add(82);
		tree_num.add(89);
		tree_num.add(14);
		System.out.println("Original tree set: "+tree_num);
		System.out.println("Removes the first(lowest) element: "+tree_num.pollFirst());
		System.out.println("Tree set after removing first element: "+tree_num);

	}

	//15. Write a Java program to retrieve and remove the last element of a tree set.
	public static void funcTreeSet15() {
		// creating TreeSet 
		TreeSet <Integer>tree_num = new TreeSet<Integer>();
		TreeSet <Integer>treeheadset = new TreeSet<Integer>();

		// Add numbers in the tree
		tree_num.add(10);
		tree_num.add(22);
		tree_num.add(36);
		tree_num.add(25);
		tree_num.add(16);
		tree_num.add(70);
		tree_num.add(82);
		tree_num.add(89);
		tree_num.add(14);
		System.out.println("Original tree set: "+tree_num);
		System.out.println("Removes the last element: "+tree_num.pollLast());
		System.out.println("Tree set after removing last element: "+tree_num);

	} 

	//16. Write a Java program to remove a given element from a tree set.
	public static void funcTreeSet16() {
		// creating TreeSet 
		TreeSet <Integer>tree_num = new TreeSet<Integer>();
		TreeSet <Integer>treeheadset = new TreeSet<Integer>();

		// Add numbers in the tree
		tree_num.add(10);
		tree_num.add(22);
		tree_num.add(36);
		tree_num.add(25);
		tree_num.add(16);
		tree_num.add(70);
		tree_num.add(82);
		tree_num.add(89);
		tree_num.add(14);
		System.out.println("Original tree set: "+tree_num);
		System.out.println("Removes 70 from the list: "+tree_num.remove(70));
		System.out.println("Tree set after removing last element: "+tree_num);

	}
	
	
	/*************************
	 * PriorityQueue
	 ************************/
	//1. Write a Java program to create a priority queue, add some colors (strings) and print out the elements of the priority queue.
	public static void funcPriorityQueue1() {
		PriorityQueue<String> queue=new PriorityQueue<String>();  
		queue.add("Red");
		queue.add("Green");
		queue.add("Orange");
		queue.add("White");
		queue.add("Black");
		System.out.println("Elements of the Priority Queue: ");
		System.out.println(queue);

	}

	//2. Write a Java program to iterate through all elements in the priority queue.
	public static void funcPriorityQueue2() {
		PriorityQueue<String> pq = new PriorityQueue<String>();  
		pq.add("Red");
		pq.add("Green");
		pq.add("Orange");
		pq.add("White");
		pq.add("Black");
		System.out.println("Elements of the Priority Queue: ");
		// iterate the Priority Queue
		for (String element : pq) {
			System.out.println(element);
		}

	}

	//3. Write a Java program to add all the elements of a priority queue to another priority queue.
	public static void funcPriorityQueue3() {
		PriorityQueue<String> queue1 = new PriorityQueue<String>();  
		queue1.add("Red");
		queue1.add("Green");
		queue1.add("Orange");
		System.out.println("Priority Queue1: "+queue1);
		PriorityQueue<String> queue2 = new PriorityQueue<String>();  
		queue2.add("Pink");
		queue2.add("White");
		queue2.add("Black");
		System.out.println("Priority Queue2: "+queue2);
		// adding queue2 to queue1
		queue1.addAll(queue2);
		System.out.println("New Priority Queue1: "+queue1);

	}

	//4. Write a Java program to insert a given element into a priority queue.
	public static void funcPriorityQueue4() {
		// Create Priority Queue
		PriorityQueue<String> pq1 = new PriorityQueue<String>();  
		// use add() method to add values in the Priority Queue
		pq1.add("Red");
		pq1.add("Green");
		pq1.add("Black");
		pq1.add("White");
		System.out.println("Original Priority Queue: "+pq1);

		// Inserts the specified element into this priority queue.
		pq1.offer("Blue");

		System.out.println("The New Priority Queue: " + pq1);

	}

	//5. Write a Java program to remove all elements from a priority queue.
	public static void funcPriorityQueue5() {
		// Create Priority Queue
		PriorityQueue<String> pq1 = new PriorityQueue<String>();  
		// use add() method to add values in the Priority Queue
		pq1.add("Red");
		pq1.add("Green");
		pq1.add("Black");
		pq1.add("White");
		System.out.println("Original Priority Queue: "+pq1);

		// Removing all the elements from the Priority Queue
		pq1.clear();

		System.out.println("The New Priority Queue: " + pq1);

	}

	//6. Write a Java program to count the number of elements in a priority queue.
	public static void funcPriorityQueue6() {
		// create an empty Priority Queue
		PriorityQueue<String> pq = new PriorityQueue<String>();  
		// use add() method to add values in the Priority Queue
		pq.add("Red");
		pq.add("Green");
		pq.add("Black");
		pq.add("Pink");
		pq.add("orange");
		System.out.println("Priority Queue: " + pq);
		System.out.println("Size of the Priority Queue: " + pq.size());

	}

	//7. Write a Java program to compare two priority queues.
	public static void funcPriorityQueue7() {
		// Create a empty Priority Queue
		PriorityQueue<String> pq1 = new PriorityQueue<String>();  
		// use add() method to add values in the Priority Queue
		pq1.add("Red");
		pq1.add("Green");
		pq1.add("Black");
		pq1.add("White");
		System.out.println("First Priority Queue: "+pq1);
		PriorityQueue<String> pq2 = new PriorityQueue<String>();  
		pq2.add("Red");
		pq2.add("Pink");
		pq2.add("Black");
		pq2.add("Orange");
		System.out.println("Second Priority Queue: "+pq2);
		//comparison output in Priority Queue
		for (String element : pq1){
			System.out.println(pq2.contains(element) ? "Yes" : "No");
		}      

	}

	//8. Write a Java program to retrieve the first element of the priority queue.
	public static void funcPriorityQueue8() {
		// Create Priority Queue
		PriorityQueue<Integer> pq1 = new PriorityQueue<Integer>();  
		PriorityQueue<Integer> pq2 = new PriorityQueue<Integer>();  

		// Add numbers in the Queue
		pq1.add(10);
		pq1.add(22);
		pq1.add(36);
		pq1.add(25);
		pq1.add(16);
		pq1.add(70);
		pq1.add(82);
		pq1.add(89);
		pq1.add(14);
		System.out.println("Original Priority Queue: "+pq1);
		System.out.println("The first element of the Queue: "+pq1.peek());

	}

	//9. Write a Java program to retrieve and remove the first element.
	public static void funcPriorityQueue9() {
		// Create Priority Queue
		PriorityQueue<Integer> pq1 = new PriorityQueue<Integer>();  
		PriorityQueue<Integer> pq2 = new PriorityQueue<Integer>();     
		// Add numbers in the Priority Queue
		pq1.add(10);
		pq1.add(22);
		pq1.add(36);
		pq1.add(25);
		pq1.add(16);
		pq1.add(70);
		pq1.add(82);
		pq1.add(89);
		pq1.add(14);
		System.out.println("Original Priority Queue: "+pq1);
		System.out.println("Removes the first element: "+pq1.poll());
		System.out.println("Priority Queue after removing first element: "+pq1);

	}

	//10. Write a Java program to convert a priority queue to an array containing all its elements.
	public static void funcPriorityQueue10() {
		// Create Priority Queue
		PriorityQueue<String> pq1 = new PriorityQueue<String>();  
		// use add() method to add values in the Priority Queue
		pq1.add("Red");
		pq1.add("Green");
		pq1.add("Black");
		pq1.add("White");
		System.out.println("Original Priority Queue: "+pq1);

		//Convert a linked list to array list    
		List<String> array_list = new ArrayList<String>(pq1);
		System.out.println("Array containing all of the elements in the queue: "+array_list);

	}

	//11. Write a Java program to convert a Priority Queue element to string representations.
	public static void funcPriorityQueue11() {
		// Create Priority Queue
		PriorityQueue<String> pq1 = new PriorityQueue<String>();  
		// use add() method to add values in the Priority Queue
		pq1.add("Red");
		pq1.add("Green");
		pq1.add("Black");
		pq1.add("White");
		System.out.println("Original Priority Queue: "+pq1);

		//Convert Priority Queue to a string representation
		String str1;
		str1 = pq1.toString();
		System.out.println("String representation of the Priority Queue: "+str1);

	}

	//12. Write a Java program to change priorityQueue to maximum priority queue.
	public static void funcPriorityQueue12() {
		PriorityQueue<Integer> pq1 = new PriorityQueue<Integer>(10, Collections.reverseOrder());

		// Add numbers in the Queue
		pq1.add(10);
		pq1.add(22);
		pq1.add(36);
		pq1.add(25);
		pq1.add(16);
		pq1.add(70);
		pq1.add(82);
		pq1.add(89);
		pq1.add(14);
		System.out.println("\nOriginal Priority Queue: "+pq1);

		System.out.print("\nMaximum Priority Queue: ");
		Integer val = null;
		while( (val = pq1.poll()) != null) {
			System.out.print(val+"  ");
		}
		System.out.print("\n");

	}
	
	
	/*************************
	 * HashMap
	 ************************/
	//1. Write a Java program to associate the specified value with the specified key in a HashMap.
	public static void funcHashMap1() {
		HashMap<Integer,String> hash_map= new HashMap<Integer,String>();  
		hash_map.put(1, "Red");
		hash_map.put(2, "Green");
		hash_map.put(3, "Black");
		hash_map.put(4, "White");
		hash_map.put(5, "Blue");
		for(Map.Entry<Integer, String> x:hash_map.entrySet()){  
			System.out.println(x.getKey()+" "+x.getValue());  
		}  

	}

	//2. Write a Java program to count the number of key-value (size) mappings in a map.
	public static void funcHashMap2() {
		HashMap<Integer,String> hash_map= new HashMap<Integer,String>();  
		hash_map.put(1, "Red");
		hash_map.put(2, "Green");
		hash_map.put(3, "Black");
		hash_map.put(4, "White");
		hash_map.put(5, "Blue");
		System.out.println("Size of the hash map: "+hash_map.size());

	}

	//3. Write a Java program to copy all mappings from the specified map to another map.
	public static void funcHashMap3() {
		// create two hash maps
		HashMap <Integer,String> hash_map1 = new HashMap <Integer,String> ();
		HashMap <Integer,String> hash_map2 = new HashMap <Integer,String> ();
		// populate hash maps
		hash_map1.put(1, "Red");
		hash_map1.put(2, "Green");
		hash_map1.put(3, "Black");
		System.out.println("\nValues in first map: " + hash_map1);
		hash_map2.put(4, "White");
		hash_map2.put(5, "Blue");
		hash_map2.put(6, "Orange");
		System.out.println("\nValues in second map: " + hash_map2);

		// put all values in secondmap
		hash_map2.putAll(hash_map1);
		System.out.println("\nNow values in second map: " + hash_map2);

	}

	//4. Write a Java program to remove all mappings from a map.
	public static void funcHashMap4() {
		HashMap <Integer,String> hash_map = new HashMap <Integer,String> ();
		hash_map.put(1, "Red");
		hash_map.put(2, "Green");
		hash_map.put(3, "Black");
		hash_map.put(4, "White");
		hash_map.put(5, "Blue");
		// print the map
		System.out.println("The Original linked map: " + hash_map);
		// Removing all the elements from the linked map
		hash_map.clear();
		System.out.println("The New map: " + hash_map);

	}

	//5. Write a Java program to check whether a map contains key-value mappings (empty) or not.
	public static void funcHashMap5() {
		HashMap <Integer,String> hash_map = new HashMap <Integer,String> ();
		hash_map.put(1, "Red");
		hash_map.put(2, "Green");
		hash_map.put(3, "Black");
		hash_map.put(4, "White");
		hash_map.put(5, "Blue");
		// check if map is empty
		boolean result = hash_map.isEmpty();
		// check the result
		System.out.println("Is hash map empty: " + result);
		// Removing all the elements from the linked map
		hash_map.clear();
		// check if map is empty
		result = hash_map.isEmpty();
		// check the result
		System.out.println("Is hash map empty: " + result);

	}

	//6. Write a Java program to get a shallow copy of a HashMap instance.
	public static void funcHashMap6() {
		HashMap<Integer,String> hash_map= new HashMap<Integer,String>();  
		hash_map.put(1, "Red");
		hash_map.put(2, "Green");
		hash_map.put(3, "Black");
		hash_map.put(4, "White");
		hash_map.put(5, "Blue");
		// print the map
		System.out.println("The Original map: " + hash_map);
		HashMap<Integer,String> new_hash_map= new HashMap<Integer,String>(); 
		new_hash_map = (HashMap<Integer, String>)hash_map.clone();     
		System.out.println("Cloned map: " + new_hash_map);    

	}

	//7. Write a Java program to test if a map contains a mapping for the specified key.
	public static void funcHashMap7() {
		HashMap < String, Integer > hash_map = new HashMap < String, Integer > ();
		hash_map.put("Red", 1);
		hash_map.put("Green", 2);
		hash_map.put("Black", 3);
		hash_map.put("White", 4);
		hash_map.put("Blue", 5);
		// print the map
		System.out.println("The Original map: " + hash_map);
		System.out.println("1. Is key 'Green' exists?");
		if (hash_map.containsKey("Green")) {
			//key exists
			System.out.println("yes! - " + hash_map.get("Green"));
		} else {
			//key does not exists
			System.out.println("no!");
		}

		System.out.println("\n2. Is key 'orange' exists?");
		if (hash_map.containsKey("orange")) {
			System.out.println("yes! - " + hash_map.get("orange"));
		} else {
			System.out.println("no!");
		}

	}

	//8. Write a Java program to test if a map contains a mapping for the specified value.
	public static void funcHashMap8() {
		HashMap < Integer, String > hash_map = new HashMap < Integer, String > ();
		hash_map.put(1, "Red");
		hash_map.put(2, "Green");
		hash_map.put(3, "Black");
		hash_map.put(4, "White");
		hash_map.put(5, "Blue");
		// print the map
		System.out.println("The Original map: " + hash_map);
		System.out.println("1. Is value \'Green\' exists?");
		if (hash_map.containsValue("Green")) {
			//value exists
			System.out.println("Yes! ");
		} else {
			//value does not exists
			System.out.println("no!");
		}

		System.out.println("\n2. Is value \'orange\' exists?");
		if (hash_map.containsValue("orange")) {
			System.out.println("yes! - " );
		} else {
			System.out.println("No!");
		}

	}

	//9. Write a Java program to create a set view of the mappings contained in a map.
	public static void funcHashMap9() {
		HashMap < Integer, String > hash_map = new HashMap < Integer, String > ();
		hash_map.put(1, "Red");
		hash_map.put(2, "Green");
		hash_map.put(3, "Black");
		hash_map.put(4, "White");
		hash_map.put(5, "Blue");
		// create set view for the map
		Set<Entry<Integer, String>> set = hash_map.entrySet();
		// check set values
		System.out.println("Set values: " + set);

	}

	//10. Write a Java program to get the value of a specified key in a map.
	public static void funcHashMap10() {
		HashMap<Integer,String> hash_map= new HashMap<Integer,String>();  
		hash_map.put(1,"Red");
		hash_map.put(2,"Green");
		hash_map.put(3,"Black");
		hash_map.put(4,"White");
		hash_map.put(5,"Blue");
		// get value of key 3
		String val=(String)hash_map.get(3); 
		// check the value
		System.out.println("Value for key 3 is: " + val);

	}

	//11. Write a Java program to get a set view of the keys contained in this map.
	public static void funcHashMap11() {
		HashMap<Integer,String> hash_map= new HashMap<Integer,String>();  

		hash_map.put(1,"Red");
		hash_map.put(2,"Green");
		hash_map.put(3,"Black");
		hash_map.put(4,"White");
		hash_map.put(5,"Blue");

		// get keyset value from map
		Set<Integer> keyset = hash_map.keySet();

		// check key set values
		System.out.println("Key set values are: " + keyset);  

	}

	//12. Write a Java program to get a collection view of the values contained in this map.
	public static void funcHashMap12() {
		HashMap<Integer,String> hash_map= new HashMap<Integer,String>();  
		hash_map.put(1,"Red");
		hash_map.put(2,"Green");
		hash_map.put(3,"Black");
		hash_map.put(4,"White");
		hash_map.put(5,"Blue");

		// checking collection view of the map
		System.out.println("Collection view is: "+ hash_map.values());

	}
	
	
	/*************************
	 * TreeMap
	 ************************/
	//1. Write a Java program to associate the specified value with the specified key in a Tree Map.
	public static void funcTreeMap1() {
		// Create a tree map
		TreeMap<Integer,String> tree_map=new TreeMap<Integer,String>();      
		// Put elements to the map 
		tree_map.put(1, "Red");
		tree_map.put(2, "Green");
		tree_map.put(3, "Black");
		tree_map.put(4, "White");
		tree_map.put(5, "Blue");

		for (Map.Entry<Integer,String> entry : tree_map.entrySet())
		{
			System.out.println(entry.getKey() + "=>" + entry.getValue());
		}

	}

	//2. Write a Java program to copy Tree Map's content to another Tree Map.
	public static void funcTreeMap2() {
		// Create a tree map
		TreeMap<String,String> tree_map1=new TreeMap<String,String>();      

		// Put elements to the map 
		tree_map1.put("C1", "Red");
		tree_map1.put("C2", "Green");
		tree_map1.put("C3", "Black");
		tree_map1.put("C4", "White");
		tree_map1.put("C5", "Blue");
		System.out.println("Tree Map 1: "+tree_map1);
		TreeMap<String,String> tree_map2 = new TreeMap<String,String>();
		tree_map2.put("A1", "Orange");
		tree_map2.put("A2", "Pink");
		System.out.println("Tree Map 2: "+tree_map2);
		tree_map1.putAll(tree_map2);
		System.out.println("After coping map2 to map1: "+tree_map1);   

	}

	//3. Write a Java program to search for a key in a Tree Map.
	public static void funcTreeMap3() {
		// Create a tree map
		TreeMap<String,String> tree_map1=new TreeMap<String,String>();      

		// Put elements to the map 
		tree_map1.put("C1", "Red");
		tree_map1.put("C2", "Green");
		tree_map1.put("C3", "Black");
		tree_map1.put("C4", "White"); 

		System.out.println(tree_map1);
		if(tree_map1.containsKey("C1")){
			System.out.println("The Tree Map contains key C1");
		} else {
			System.out.println("The Tree Map does not contain key C1");
		}
		if(tree_map1.containsKey("C5")){
			System.out.println("The Tree Map contains key C5");
		} else {
			System.out.println("The TreeMap does not contain key C5");
		}

	}

	//4. Write a Java program to search for a value in a Tree Map.
	public static void funcTreeMap4() {
		// Create a tree map
		TreeMap<String,String> tree_map1=new TreeMap<String,String>();      

		// Put elements to the map 
		tree_map1.put("C1", "Red");
		tree_map1.put("C2", "Green");
		tree_map1.put("C3", "Black");
		tree_map1.put("C4", "White"); 

		if(tree_map1.containsValue("Green")){
			System.out.println("The TreeMap contains value Green");
		} else {
			System.out.println("The TreeMap does not contain value Green");
		}
		if(tree_map1.containsValue("Pink")){
			System.out.println("The TreeMap contains value Pink");
		} else {
			System.out.println("The TreeMap does not contain value Pink");
		}

	}

	//5. Write a Java program to get all keys from a Tree Map.
	public static void funcTreeMap5() {
		// Create a tree map
		TreeMap<String,String> tree_map1=new TreeMap<String,String>();      
		// Put elements to the map 
		tree_map1.put("C1", "Red");
		tree_map1.put("C2", "Green");
		tree_map1.put("C3", "Black");
		tree_map1.put("C4", "White"); 

		Set<String> keys = tree_map1.keySet();
		for(String key: keys){
			System.out.println(key);
		}

	}

	//6. Write a Java program to delete all elements from a Tree Map.
	public static void funcTreeMap6() {
		// Create a tree map
		TreeMap<String,String> tree_map1 = new TreeMap<String,String>();      
		// Put elements to the map 
		tree_map1.put("C1", "Red");
		tree_map1.put("C2", "Green");
		tree_map1.put("C3", "Black");
		tree_map1.put("C4", "White"); 

		System.out.println("Orginal TreeMap content: "+tree_map1);
		tree_map1.clear();
		System.out.println("The New map: "+tree_map1);

	}

	//7. Write a Java program to sort keys in a Tree Map by using a comparator.	
	public static void funcTreeMap7() {
		TreeMap<String,String> tree_map1 = new TreeMap<String,String>(new sort_key());
		// Put elements to the map 
		tree_map1.put("C2", "Red");
		tree_map1.put("C4", "Green");
		tree_map1.put("C3", "Black");
		tree_map1.put("C1", "White"); 
		System.out.println(tree_map1); 

	}

	//8. Write a Java program to get a key-value mapping associated with the greatest key and the least key in a map.
	public static void funcTreeMap8() {
		// Create a tree map
		TreeMap <String,String> tree_map1 = new TreeMap <String,String> ();

		// Put elements to the map 
		tree_map1.put("C1", "Red");
		tree_map1.put("C2", "Green");
		tree_map1.put("C3", "Black");
		tree_map1.put("C4", "White");

		System.out.println("Orginal TreeMap content: " + tree_map1);
		System.out.println("Greatest key: " + tree_map1.firstEntry());
		System.out.println("Least key: " + tree_map1.lastEntry());

	}

	//9. Write a Java program to get the first (lowest) key and the last (highest) key currently in a map.
	public static void funcTreeMap9() {
		// Create a tree map
		TreeMap <String,String> tree_map1 = new TreeMap <String,String> ();

		// Put elements to the map 
		tree_map1.put("C2", "Red");
		tree_map1.put("C1", "Green");
		tree_map1.put("C4", "Black");
		tree_map1.put("C3", "White");

		System.out.println("Orginal TreeMap content: " + tree_map1);
		System.out.println("Greatest key: " + tree_map1.firstKey());
		System.out.println("Least key: " + tree_map1.lastKey());

	}

	//10. Write a Java program to get a reverse order view of the keys contained in a given map.
	public static void funcTreeMap10() {
		// Create a tree map
		TreeMap <String,String> tree_map1 = new TreeMap <String,String> ();

		// Put elements to the map 
		tree_map1.put("C2", "Red");
		tree_map1.put("C1", "Green");
		tree_map1.put("C4", "Black");
		tree_map1.put("C3", "White");

		System.out.println("Orginal TreeMap content: " + tree_map1);
		System.out.println("Reverse order view of the keys: " + tree_map1.descendingKeySet());

	}

	//11. Write a Java program to get a key-value mapping associated with the greatest key less than or equal to the given key.
	public static void funcTreeMap11() {
		// Create a tree map
		TreeMap < Integer, String > tree_map1 = new TreeMap < Integer, String > ();
		// Put elements to the map 
		tree_map1.put(10, "Red");
		tree_map1.put(20, "Green");
		tree_map1.put(40, "Black");
		tree_map1.put(50, "White");
		tree_map1.put(60, "Pink");

		System.out.println("Orginal TreeMap content: " + tree_map1);
		System.out.println("Checking the entry for 10: ");
		System.out.println("Value is: " + tree_map1.floorEntry(10));
		System.out.println("Checking the entry for 30: ");
		System.out.println("Value is: " + tree_map1.floorEntry(30));
		System.out.println("Checking the entry for 70: ");
		System.out.println("Value is: " + tree_map1.floorEntry(70));

	}

	//12. Write a Java program to get the greatest key less than or equal to the given key.
	public static void funcTreeMap12() {
		// Create a tree map
		TreeMap < Integer, String > tree_map1 = new TreeMap < Integer, String > ();
		// Put elements to the map 
		tree_map1.put(10, "Red");
		tree_map1.put(20, "Green");
		tree_map1.put(40, "Black");
		tree_map1.put(50, "White");
		tree_map1.put(60, "Pink");

		System.out.println("Orginal TreeMap content: " + tree_map1);
		System.out.println("Checking the entry for 10: ");
		System.out.println("Key is: " + tree_map1.floorKey(10));
		System.out.println("Checking the entry for 30: ");
		System.out.println("Key is: " + tree_map1.floorKey(30));
		System.out.println("Checking the entry for 70: ");
		System.out.println("Key is: " + tree_map1.floorKey(70));

	}

	//13. Write a Java program to get the portion of a map whose keys are strictly less than a given key.
	public static void funcTreeMap13() {
		// Create a tree map
		TreeMap < Integer, String > tree_map1 = new TreeMap < Integer, String > ();

		// Put elements to the map 
		tree_map1.put(10, "Red");
		tree_map1.put(20, "Green");
		tree_map1.put(40, "Black");
		tree_map1.put(50, "White");
		tree_map1.put(60, "Pink");

		System.out.println("Orginal TreeMap content: " + tree_map1);
		System.out.println("Checking the entry for 10: ");
		System.out.println("Key(s): " + tree_map1.headMap(10));
		System.out.println("Checking the entry for 30: ");
		System.out.println("Key(s): " + tree_map1.headMap(30));
		System.out.println("Checking the entry for 70: ");
		System.out.println("Key(s): " + tree_map1.headMap(70));

	}

	//14. Write a Java program to get the portion of this map whose keys are less than (or equal to, if inclusive is true) a given key.
	public static void funcTreeMap14() {
		// Create a tree map
		TreeMap < Integer, String > tree_map1 = new TreeMap < Integer, String > ();

		// Put elements to the map 
		tree_map1.put(10, "Red");
		tree_map1.put(20, "Green");
		tree_map1.put(40, "Black");
		tree_map1.put(50, "White");
		tree_map1.put(60, "Pink");

		System.out.println("Orginal TreeMap content: " + tree_map1);
		System.out.println("Checking the entry for 10: ");
		System.out.println("Key(s): " + tree_map1.headMap(10, true));
		System.out.println("Checking the entry for 20: ");
		System.out.println("Key(s): " + tree_map1.headMap(20, true));
		System.out.println("Checking the entry for 70: ");
		System.out.println("Key(s): " + tree_map1.headMap(70, true));

	}

	//15. Write a Java program to get the least key strictly greater than the given key. Return null if there is no such key.
	public static void funcTreeMap15() {
		// Create a tree map
		TreeMap< Integer, String > tree_map1 = new TreeMap< Integer, String >();      

		// Put elements to the map 
		tree_map1.put(10, "Red");
		tree_map1.put(20, "Green");
		tree_map1.put(40, "Black");
		tree_map1.put(50, "White"); 
		tree_map1.put(60, "Pink"); 

		System.out.println("Orginal TreeMap content: "+tree_map1);
		System.out.println("Checking the entry for 10: ");
		System.out.println("Key(s): "+tree_map1.higherEntry(10));  
		System.out.println("Checking the entry for 20: ");
		System.out.println("Key(s): "+tree_map1.higherEntry(20));  
		System.out.println("Checking the entry for 70: ");
		System.out.println("Key(s): "+tree_map1.higherEntry(70));  

	}

	//16. Write a Java program to get a key-value mapping associated with the greatest key strictly less than the given key. Return null if there is no such key.
	public static void funcTreeMap16() {
		// Create a tree map
		TreeMap< Integer, String > tree_map1 = new TreeMap< Integer, String >();      

		// Put elements to the map 
		tree_map1.put(10, "Red");
		tree_map1.put(20, "Green");
		tree_map1.put(40, "Black");
		tree_map1.put(50, "White"); 
		tree_map1.put(60, "Pink"); 

		System.out.println("Orginal TreeMap content: "+tree_map1);
		System.out.println("Checking the entry for 10: ");
		System.out.println("Key(s): "+tree_map1.lowerEntry(10));  
		System.out.println("Checking the entry for 20: ");
		System.out.println("Key(s): "+tree_map1.lowerEntry(20));  
		System.out.println("Checking the entry for 70: ");
		System.out.println("Key(s): "+tree_map1.lowerEntry(70));  

	}

	//17. Write a Java program to get the greatest key strictly less than the given key. Return null if there is no such key.
	public static void funcTreeMap17() {
		// Create a tree map
		TreeMap < Integer, String > tree_map1 = new TreeMap < Integer, String > ();

		// Put elements to the map 
		tree_map1.put(10, "Red");
		tree_map1.put(20, "Green");
		tree_map1.put(40, "Black");
		tree_map1.put(50, "White");
		tree_map1.put(60, "Pink");

		System.out.println("Orginal TreeMap content: " + tree_map1);
		System.out.println("Checking the entry for 10: ");
		System.out.println("Key(s): " + tree_map1.lowerKey(10));
		System.out.println("Checking the entry for 20: ");
		System.out.println("Key(s): " + tree_map1.lowerKey(20));
		System.out.println("Checking the entry for 70: ");
		System.out.println("Key(s): " + tree_map1.lowerKey(70));

	}

	//18. Write a Java program to get a NavigableSet view of keys in a map.
	public static void funcTreeMap18() {
		// Create a tree map
		TreeMap < Integer, String > tree_map1 = new TreeMap < Integer, String > ();

		// Put elements to the map 
		tree_map1.put(10, "Red");
		tree_map1.put(20, "Green");
		tree_map1.put(40, "Black");
		tree_map1.put(50, "White");
		tree_map1.put(60, "Pink");

		System.out.println("Orginal TreeMap content: " + tree_map1);
		System.out.println("Orginal TreeMap content: " + tree_map1.navigableKeySet());

	}

	//19. Write a Java program to remove and get a key-value mapping associated with the least key in a map.
	public static void funcTreeMap19() {
		// Create a tree map
		TreeMap < Integer, String > tree_map = new TreeMap < Integer, String > ();

		// Put elements to the map 
		tree_map.put(10, "Red");
		tree_map.put(20, "Green");
		tree_map.put(40, "Black");
		tree_map.put(50, "White");
		tree_map.put(60, "Pink");

		// polling first entry
		System.out.println("Value before poll: " + tree_map);
		System.out.println("Value returned: " + tree_map.pollFirstEntry());
		System.out.println("Value after poll: " + tree_map);

	}

	//20. Write a Java program to remove and get a key-value mapping associated with the greatest key in this map.
	public static void funcTreeMap20() {
		// Create a tree map
		TreeMap < Integer, String > tree_map = new TreeMap < Integer, String > ();

		// Put elements to the map 
		tree_map.put(10, "Red");
		tree_map.put(20, "Green");
		tree_map.put(40, "Black");
		tree_map.put(50, "White");
		tree_map.put(60, "Pink");

		// polling first entry
		System.out.println("Value before poll: " + tree_map);
		System.out.println("Value returned: " + tree_map.pollLastEntry());
		System.out.println("Value after poll: " + tree_map);

	}

	//21. Write a Java program to get the portion of a map whose keys range from a given key (inclusive) to another key (exclusive).
	public static void funcTreeMap21() {
		// Declare tree maps
		TreeMap < Integer, String > tree_map = new TreeMap < Integer, String > ();
		SortedMap < Integer, String > sub_tree_map = new TreeMap < Integer, String > ();

		// Put elements to the map 
		tree_map.put(10, "Red");
		tree_map.put(20, "Green");
		tree_map.put(30, "Black");
		tree_map.put(40, "White");
		tree_map.put(50, "Pink");
		System.out.println("Orginal TreeMap content: " + tree_map);
		sub_tree_map = tree_map.subMap(20, 40);
		System.out.println("Sub map key-values: " + sub_tree_map);

	}

	//22. Write a Java program to get the portion of a map whose keys range from a given key to another key.
	public static void funcTreeMap22() {
		// Declare tree maps
		TreeMap < Integer, String > tree_map = new TreeMap < Integer, String > ();
		SortedMap < Integer, String > sub_tree_map = new TreeMap < Integer, String > ();

		// Put elements to the map 
		tree_map.put(10, "Red");
		tree_map.put(20, "Green");
		tree_map.put(30, "Black");
		tree_map.put(40, "White");
		tree_map.put(50, "Pink");
		System.out.println("Orginal TreeMap content: " + tree_map);
		sub_tree_map = tree_map.subMap(20, true, 40, true);
		System.out.println("Sub map key-values: " + sub_tree_map);

	}

	//23. Write a Java program to get a portion of a map whose keys are greater than or equal to a given key.
	public static void funcTreeMap23() {
		// Declare tree maps
		TreeMap < Integer, String > tree_map = new TreeMap < Integer, String > ();

		// Put elements to the map 
		tree_map.put(10, "Red");
		tree_map.put(20, "Green");
		tree_map.put(30, "Black");
		tree_map.put(40, "White");
		tree_map.put(50, "Pink");
		System.out.println("Orginal TreeMap content: " + tree_map);
		System.out.println("Keys are greater than or equal to 20: " + tree_map.tailMap(20));

	}

	//24. Write a Java program to get a portion of a map whose keys are greater than a given key.
	public static void funcTreeMap24() {
		// Declare tree maps
		TreeMap < Integer, String > tree_map = new TreeMap < Integer, String > ();

		// Put elements to the map 
		tree_map.put(10, "Red");
		tree_map.put(20, "Green");
		tree_map.put(30, "Black");
		tree_map.put(40, "White");
		tree_map.put(50, "Pink");
		System.out.println("Orginal TreeMap content: " + tree_map);
		System.out.println("Keys are greater than 20: " + tree_map.tailMap(20, false));

	}

	//25. Write a Java program to get a key-value mapping associated with the least key greater than or equal to the given key. Return null if there is no such key.
	public static void funcTreeMap25() {
		// Declare tree maps
		TreeMap < Integer, String > tree_map = new TreeMap < Integer, String > ();
		// Put elements to the map 
		tree_map.put(10, "Red");
		tree_map.put(20, "Green");
		tree_map.put(30, "Black");
		tree_map.put(40, "White");
		tree_map.put(50, "Pink");
		System.out.println("Orginal TreeMap content: " + tree_map);
		System.out.println("Keys greater than or equal to 20: " + tree_map.ceilingEntry(20));
		System.out.println("Keys greater than or equal to 40: " + tree_map.ceilingEntry(40));
		System.out.println("Keys greater than or equal to 50: " + tree_map.ceilingEntry(50));

	}

	//26. Write a Java program to get the least key greater than or equal to the given key. Returns null if there is no such key.
	public static void funcTreeMap26() {
		// Declare tree maps
		TreeMap < Integer, String > tree_map = new TreeMap < Integer, String > ();
		// Put elements to the map 
		tree_map.put(10, "Red");
		tree_map.put(20, "Green");
		tree_map.put(40, "Black");
		tree_map.put(50, "White");
		tree_map.put(60, "Pink");
		System.out.println("Orginal TreeMap content: " + tree_map);
		System.out.println("Keys greater than or equal to 20: " + tree_map.ceilingKey(20));
		System.out.println("Keys greater than or equal to 30: " + tree_map.ceilingKey(30));
		System.out.println("Keys greater than or equal to 50: " + tree_map.ceilingKey(50));

	}
	
}
