//2 a. Develop a java program for performing various string operations with different string handling
//functions directed as follows
//String Creation and Basic Operations, Length and Character Access, String Comparison, String Searching,
//Substring Operations , String Modification, Whitespace Handling, String Concatenation, String
//Splitting, StringBuilder Demo, String Formatting , Validate Email with contains( ) and startsWith() and
//endsWith()

package String;

public class p2a {
	    public static void main(String[] args) {

	        // 1. String Creation and Basic Operations
	        String str1 = "Hello";
	        String str2 = new String("World");
	        System.out.println("String 1: " + str1);
	        System.out.println("String 2: " + str2);

	        // 2. Length and Character Access
	        System.out.println("Length of str1: " + str1.length());
	        System.out.println("Character at index 1: " + str1.charAt(1));

	        // 3. String Comparison
	        String str3 = "hello";
	        System.out.println("Equals: " + str1.equals(str3));
	        System.out.println("Equals Ignore Case: " + str1.equalsIgnoreCase(str3));

	        // 4. String Searching
	        String text = "Java Programming Language";
	        System.out.println("Index of 'Programming': " + text.indexOf("Programming"));
	        System.out.println("Contains 'Java': " + text.contains("Java"));

	        // 5. Substring Operations
	        System.out.println("Substring (0 to 4): " + text.substring(0, 4));

	        // 6. String Modification
	        String modified = text.replace("Java", "Python");
	        System.out.println("Modified String: " + modified);

	        // 7. Whitespace Handling
	        String str4 = "   Welcome to Java   ";
	        System.out.println("Before Trim: '" + str4 + "'");
	        System.out.println("After Trim: '" + str4.trim() + "'");

	        // 8. String Concatenation
	        String concat = str1 + " " + str2;
	        System.out.println("Concatenated String: " + concat);

	        // 9. String Splitting
	        String sentence = "Apple,Banana,Orange";
	        String[] fruits = sentence.split(",");
	        System.out.println("Splitted Strings:");
	        for (String fruit : fruits) {
	            System.out.println(fruit);
	        }

	        // 10. StringBuilder Demo
	        StringBuilder sb = new StringBuilder("Java");
	        sb.append(" Programming");
	        System.out.println("StringBuilder Result: " + sb);

	        // 11. String Formatting
	        String formatted = String.format("Name: %s, Age: %d", "Asha", 20);
	        System.out.println("Formatted String: " + formatted);

	        // 12. Validate Email
	        String email = "example@gmail.com";
	        if (email.contains("@") && email.startsWith("example") && email.endsWith(".com")) {
	            System.out.println("Valid Email");
	        } else {
	            System.out.println("Invalid Email");
	        }
	    }
	}


