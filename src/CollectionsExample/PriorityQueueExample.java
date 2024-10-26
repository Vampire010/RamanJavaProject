package CollectionsExample;
import java.util.PriorityQueue;

public class PriorityQueueExample {

	public static void main(String[] args) 
	{
		 PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
		// Enqueue elements with different priorities
	        priorityQueue.add(20);
	        priorityQueue.add(10);
	        priorityQueue.add(30);
	        
	     // Print the priority queue
	        System.out.println("Priority Queue: " + priorityQueue);
	      
	        // Dequeue elements (highest priority first)
	        //int dequeuedElement = priorityQueue.poll();
	        int dequeuedElement = priorityQueue.peek();
	        System.out.println("Dequeued Element: " + dequeuedElement);
	        System.out.println("Updated Priority Queue: " + priorityQueue);
	        
	      
	       
	}

}
