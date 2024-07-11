package basics.ch_08_string;

public class StringMethods {

	public static void main(String[] args) {
		String subject;
		
		subject = new String("java");
		System.out.println(subject); // java
		
		// toUpperCase() 
		// converts a string to upper case letters
		// returns string converted to upper case
		subject = subject.toUpperCase();
		System.out.println(subject); // JAVA
		
		// toLowerCase()
		// converts a string to lower case letters
		// returns a string converted to lower case
		subject = subject.toLowerCase();
		System.out.println(subject); // java
		
		boolean isTrueOrFalse;
		// contains("values")
		// check whether a string contains a sequence of characters
		// returns true or false
		isTrueOrFalse = subject.contains("va");
		System.out.println(isTrueOrFalse); // true
		
		// equals()
		// compare two strings
		// returns true if the strings are equal, and false if not
		isTrueOrFalse = "java".equals("java");
		System.out.println(isTrueOrFalse); // true
		
		isTrueOrFalse = "Java".equals("java");
		System.out.println(isTrueOrFalse); // false
		
		// equalsIgnoreCase()
		// compares two strings, ignoring case consideration
		// retruns true if the strings are equal, and false if not
		isTrueOrFalse = "SQL".equalsIgnoreCase("sql");
		System.out.println(isTrueOrFalse); // true
		
		String text;
		// replaceAll("oldText","newText");
		// replaces each substring of this string that matches the given regular
		// expression with the given replacement
		// returns the resulting string
		text = subject.replaceAll("ja","ma"); 
		System.out.println(text); // mava 
		
		int index;
		// indexOf('character')
		// returns the index or position of the first found occurance of
		// the specified character is a string
		// returns -1 if the character is not found
		index = subject.indexOf('j');
		System.out.println(index); // 0
		index = subject.indexOf('z');
		System.out.println(index); // -1
		
		char character;
		// charAt(index)
		// returns the character value at the specified index (position)
		character = subject.charAt(2);
		System.out.println(character); // v
		
		int size;
		// length()
		// returns the length of a specified string
		// returns the count of total character in the specified string
		size = "machine learning".length();
		System.out.println(size); // 16
		
		// isEmpty()
		// checks whether a string is empty or not
		// returns true if length is 0 otherwise false
		isTrueOrFalse = "".isEmpty();
		System.out.println(isTrueOrFalse); // true
		
		isTrueOrFalse = " ".isEmpty();
		System.out.println(isTrueOrFalse); // false
		
		// lastIndexOf('character')
		// returns the position of the last found occurence of 
		// specified characters in a string
		// returns -1 if the character is not found
		index = subject.lastIndexOf('a');
		System.out.println(index); // 3
		
		// endsWith("text")
		// tests if this string ends with the specific suffix
		// checks whether a string ends with specific character(s)
		// returns true or false
		isTrueOrFalse ="world".endsWith("ld");
		System.out.println(isTrueOrFalse); // true
		
		// startsWith("text")
		// checks whether a string starts with specific characters(s)
		// returns true or false
		isTrueOrFalse ="hello".startsWith("he");
		System.out.println(isTrueOrFalse); // true
		
		// trim()
		// remove whitespace from both ends of a string
		// retruns the resulting string
		text = "   sun shine   ".trim();
		System.out.println(text);  // sun shine
		
		// isBlank()
		// retruns true if the string is empty
		// or contains only whitespace otherwise false
		isTrueOrFalse = " ".isBlank();
		System.out.println(isTrueOrFalse); // true
	}

}
