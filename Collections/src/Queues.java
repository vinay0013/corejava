import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class Queues {

	public static void main(String[] args) {
		//Queue
		Queue<Integer> q = new LinkedList<>(); 
	    // Adds elements {0, 1, 2, 3, 4} to queue 
	    for (int i=0; i<5; i++) 
	     q.add(i); 
	    // Display contents of the queue. 
	    System.out.println("Elements of queue-"+q); 
	    // To remove the head of queue. 
	    int removedele = q.remove(); 
	    System.out.println("removed element-" + removedele); 
	    System.out.println(q); 
	    // To view the head of queue 
	    int head = q.peek(); 
	    System.out.println("head of queue-" + head); 
	    // Rest all methods of collection interface, 
	    // Like size and contains can be used with this 
	    // implementation. 
	    int size = q.size(); 
	    System.out.println("Size of queue-" + size); 
	    
	    
	    //DeQueue
	    Deque<String> deque = new LinkedList<String>(); 
	    
        // We can add elements to the queue in various ways 
        deque.add("Element 1 (Tail)"); // add to tail 
        deque.addFirst("Element 2 (Head)"); 
        deque.addLast("Element 3 (Tail)"); 
        deque.push("Element 4 (Head)"); //add to head 
        deque.offer("Element 5 (Tail)"); 
        deque.offerFirst("Element 6 (Head)"); 
        deque.offerLast("Element 7 (Tail)"); 
  
        System.out.println(deque + "\n"); 
  
        // Iterate through the queue elements. 
        System.out.println("Standard Iterator"); 
        Iterator iterator = deque.iterator(); 
        while (iterator.hasNext()) 
            System.out.println("\t" + iterator.next()); 
  
  
        // Reverse order iterator 
        Iterator reverse = deque.descendingIterator(); 
        System.out.println("Reverse Iterator"); 
        while (reverse.hasNext()) 
            System.out.println("\t" + reverse.next()); 
  
        // Peek returns the head, without deleting 
        // it from the deque 
        System.out.println("Peek " + deque.peek()); 
        System.out.println("After peek: " + deque); 
  
        // Pop returns the head, and removes it from 
        // the deque 
        System.out.println("Pop " + deque.pop()); 
        System.out.println("After pop: " + deque); 
  
        // We can check if a specific element exists 
        // in the deque 
        System.out.println("Contains element 3: " + 
                        deque.contains("Element 3 (Tail)")); 
  
        // We can remove the first / last element. 
        deque.removeFirst(); 
        deque.removeLast(); 
        System.out.println("Deque after removing " + 
                            "first and last: " + deque); 

	}

}
