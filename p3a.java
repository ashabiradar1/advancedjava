//3a. Develop a java program for performing various string operations with different string handling
//functions directed as follows:
//String Creation and Basic Operations, Length and Character Access, String Comparison, String
//Searching, Substring Operations , String Modification, Whitespace Handling, String Concatenation,
//String Splitting, StringBuilder Demo, String Formatting , Validate Email with contains( ) and
//startsWith() and endsWith()

package String;

public class p3a {
	    public static void main(String[] args) {

	        // 1. String Creation and Basic Operations
	        String s1 = "Hello";
	        String s2 = new String("World");
	        System.out.println("String 1: " + s1);
	        System.out.println("String 2: " + s2);

	        // 2. Length and Character Access
	        System.out.println("Length of s1: " + s1.length());
	        System.out.println("Character at index 2: " + s1.charAt(2));

	        // 3. String Comparison
	        String s3 = "hello";
	        System.out.println("Equals: " + s1.equals(s3));
	        System.out.println("Equals Ignore Case: " + s1.equalsIgnoreCase(s3));

	        // 4. String Searching
	        String text = "Java Programming";
	        System.out.println("Index of 'Pro': " + text.indexOf("Pro"));
	        System.out.println("Contains 'Java': " + text.contains("Java"));

	        // 5. Substring Operations
	        System.out.println("Substring (0 to 4): " + text.substring(0, 4));

	        // 6. String Modification
	        String modified = text.replace("Java", "Python");
	        System.out.println("Modified String: " + modified);

	        // 7. Whitespace Handling
	        String s4 = "   Welcome Java   ";
	        System.out.println("Before Trim: '" + s4 + "'");
	        System.out.println("After Trim: '" + s4.trim() + "'");

	        // 8. String Concatenation
	        String concat = s1 + " " + s2;
	        System.out.println("Concatenated String: " + concat);

	        // 9. String Splitting
	        String fruits = "Apple,Banana,Orange";
	        String arr[] = fruits.split(",");
	        System.out.println("Splitted Strings:");
	        for (String f : arr) {
	            System.out.println(f);
	        }

	        // 10. StringBuilder Demo
	        StringBuilder sb = new StringBuilder("Java");
	        sb.append(" Programming");
	        System.out.println("StringBuilder Output: " + sb);

	        // 11. String Formatting
	        String formatted = String.format("Name: %s, Age: %d", "Asha", 20);
	        System.out.println("Formatted String: " + formatted);

	        // 12. Email Validation
	        String email = "asha@gmail.com";
	        if (email.contains("@") && email.startsWith("asha") && email.endsWith(".com")) {
	            System.out.println("Valid Email");
	        } else {
	            System.out.println("Invalid Email");
	        }
	    }
	}


