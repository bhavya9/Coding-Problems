package coding_problems;

import java.util.PriorityQueue;

public class PriorityQueueTest {

	public static void main(String[] args) {
		PriorityQueue<String> pQueue = new PriorityQueue<String>();
        pQueue.add("Java");
        pQueue.add("Collections");
        pQueue.add(null);
        System.out.println(pQueue.size());
   
	}

}
