package coding_problems;

import java.util.ArrayList;

public class ArrayListIterationUsingForLoop {

	public static void main(String[] args) {
	
		ArrayList<Integer> arrlist = new ArrayList<Integer>();
				arrlist.add(14);
				arrlist.add(7);
				arrlist.add(39);
				arrlist.add(40);
				
				/* For Loop for iterating
				ArrayList */
				System.out.println("For Loop");
				for (int counter = 0; counter<arrlist.size();counter++) {
				System.out.println(arrlist.get(counter));
				}

}
}