/*
 * This class is to test how long it will take to overflow an int variable in Java. 
 * 
 * The int variable "count" is initialized to 0, then "count" is incremented repeatedly
 * in a loop until it becomes negative. The system time is checked before and after the
 * loop, and the time in seconds is written to the console.
 *  
 *  The total elapsed time will vary depending on your computer's specifications, 
 *  configuration, and current load.
 * 
 */
public class IntOverflow {

	public static void main(String[] args) {
		 
		int count = 0;

		long startTime = System.currentTimeMillis();
		
		while(true) {
			
			count++; 
			
			if (count < 0)
				break;
		}
		
		long endTime = System.currentTimeMillis();
		System.out.println("The total time to overflow an int variable "
				+ "in Java is currently: " + (endTime - startTime) / 1000. + " seconds");
	}

}

