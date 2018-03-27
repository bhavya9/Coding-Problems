package coding_problems;

public class CountNodesBetweenTwoNodes {

	  Node first;
	  Node fifth;

	  private class Node<Item> {
	    Item item;
	    Node next;
	  }

	public static void main(String[] args) {
		CountNodesBetweenTwoNodes countNodes = new CountNodesBetweenTwoNodes();
	    countNodes.buildCircularList();
	    int noOfNodes = countNodes.countNodesBetweenTwoNodes(countNodes.getFirst(), countNodes.getFifth());
	    System.out.println("Number of Nodes is: "+noOfNodes);
	  }

	  private Node buildCircularList() {
	    first = new Node();
	    first.item = "First";

	    Node second = new Node();
	    second.item = "Second";

	    Node third = new Node();
	    third.item = "Third";

	    Node forth = new Node();
	    forth.item = "Forth";

	    fifth = new Node();
	    fifth.item = "Fifth";

	    first.next = second;
	    second.next = third;
	    third.next = forth;
	    forth.next = fifth;

	    fifth.next = first;

	    return first;
	  }

	  private int countNodesBetweenTwoNodes(Node firstNode, Node secondNode) {
	    int count = 0;

	    while(firstNode.next != secondNode) {
	        count++;
	        firstNode = firstNode.next;
	    }

	    return count;
	  }

	  public Node getFirst() {
	    return first;
	  }

	  public Node getFifth() {
	    return fifth;
	 
	}

}
