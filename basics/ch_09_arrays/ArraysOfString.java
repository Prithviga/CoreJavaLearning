package basics.ch_09_arrays;

import java.util.Arrays;

public class ArraysOfString {

	public static void main(String[] args) {
		String[] subjectArray = {"java", "c", "c++", "python", "ai"};
		String stateArray[] = {"KA", "AP", "TS", "TN", "KL"};
		String[] nameArray = new String[10];
		String cityArray[] = new String[4];
		String petArray[] = new String[] {"fish", "dog", "cat", "camel"};
		
		System.out.println(subjectArray);
		System.out.println(Arrays.toString(subjectArray));
		
		// you can access an array element by index number
		// Array indexes start with zero
		System.out.println(subjectArray[0]); // java
		
		// to change the value of a specific element,
		// refere to the index number
		System.out.println(subjectArray[4]); // ai
		subjectArray[4] = "sql";
		System.out.println(subjectArray[4]); // sql
		
		// to find out how many element an array has,
		// use the length property
		int size = subjectArray.length;
		System.out.println(size); // 5
		
		// index of last element is array.length minus one
		System.out.println("index of last element:" + (size - 1)); // 4
	}
}