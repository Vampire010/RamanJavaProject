package CollectionsExample;

//import java.util.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

public class ArrayListExample 
{

	public static void main(String[] args)
	{
		// Create an ArrayList of integers
		List<Integer> numbers = new ArrayList<Integer>();
		
        // Add elements to the list
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        
     // Access elements by index
        System.out.println("Size of Collection: "+ numbers.size());
        System.out.println("Index Value: "+ numbers.get(0));//accessing Based on Index
        
     // Update an element
        numbers.set(0, 15); // Replacing the first element (10) with 1
        System.out.println("Updated Index Value: "+ numbers.get(0));//accessing Based on Index
      
     // Check if an element is in the list
        boolean containsValue = numbers.contains(200); // false
        System.out.println("Is Elements Show: " + containsValue);//accessing Based on Index
        
        ArrayList<Integer> numbers2 = new ArrayList<Integer>();
        numbers2.addAll(numbers);
        
     // Create an iterator
        Iterator<Integer> iterator = numbers2.iterator();
        
        while (iterator.hasNext())
        {
        	int number=iterator.next();
        	System.out.println("Value: "+numbers2); // Accessing elements using iterator
        }
        
        numbers2.remove(0);
        System.out.println("Updated Index Value after using remove: "+ numbers2.get(0));//accessing Based on Index

        numbers2.removeAll(numbers2);
        boolean colletionEmpty = numbers2.isEmpty(); // false
        System.out.println("Is Collection Empty: " + colletionEmpty);//accessing Based on Index
	}

}
