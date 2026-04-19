//2.b. Develop a Java program to make a Performance Test on StringBuffer and StringBuilder for appending
//the string ‘AIET’ for 10000 times both in the StringBuffer and StringBuilder. Justify your answer which
//one is better.

package String;

public class p2b {
	    public static void main(String[] args) {

	        int n = 10000;

	        // Test with StringBuffer
	        StringBuffer sbuffer = new StringBuffer();
	        long startTime1 = System.nanoTime();

	        for (int i = 0; i < n; i++) {
	            sbuffer.append("AIET");
	        }

	        long endTime1 = System.nanoTime();
	        long timeBuffer = endTime1 - startTime1;

	        // Test with StringBuilder
	        StringBuilder sbuilder = new StringBuilder();
	        long startTime2 = System.nanoTime();

	        for (int i = 0; i < n; i++) {
	            sbuilder.append("AIET");
	        }

	        long endTime2 = System.nanoTime();
	        long timeBuilder = endTime2 - startTime2;

	        // Display results
	        System.out.println("Time taken by StringBuffer: " + timeBuffer + " ns");
	        System.out.println("Time taken by StringBuilder: " + timeBuilder + " ns");

	        // Conclusion
	        if (timeBuffer > timeBuilder) {
	            System.out.println("StringBuilder is faster than StringBuffer.");
	        } else {
	            System.out.println("StringBuffer is faster than StringBuilder.");
	        }
	    }
	}


