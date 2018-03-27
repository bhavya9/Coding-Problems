package coding_problems;

import java.time.LocalDateTime;

public class addSecondsToDate {

	public static void main(String[] args) {
		//create data using java 8 LocalDateTime 
		  LocalDateTime datetime= LocalDateTime.now();
		  
		  System.out.println("Before: "+datetime);
		  //add seconds by using plusSeconds(seconds) method
		  datetime=datetime.plusSeconds(12);
		  System.out.println("After: "+datetime);
	}

}
