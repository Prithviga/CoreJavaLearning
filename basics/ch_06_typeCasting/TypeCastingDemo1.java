package basics.ch_06_typeCasting;

public class TypeCastingDemo1 {

	public static void main(String[] args) {
		int intNumber = 10;
		System.out.println(intNumber);                 //10
		
		double doubleNumber = intNumber;
		System.out.println(doubleNumber);              //10.0

		doubleNumber = 1.123456789012345;
		System.out.println(doubleNumber);              //1.123456789012345
		
		intNumber = (int)doubleNumber;                 
		System.out.println(intNumber);                 //1
		
		float floatNumber = (float)doubleNumber;
		System.out.println(floatNumber);               //1.1234567
		
		long longNumber = (long)doubleNumber;
		System.out.println(longNumber);                //1
		
		char charVariable = (char)doubleNumber;
		System.out.println(charVariable);
		
		short shortNumber = (short)doubleNumber;
		System.out.println(shortNumber);               //1
		
		byte byteNumber = (byte)doubleNumber;
		System.out.println(byteNumber);                //1
		
		longNumber = 1_234_567_890L;
		intNumber = (int)longNumber;
		System.out.println(intNumber);                 //1234567890
		
		String stringNumber = "21";
		System.out.println(stringNumber + 10);         //2110
		//intNumber = (int)stringNumber; //not allowed
		
		intNumber = Integer.parseInt(stringNumber);
		System.out.println(intNumber + 10);            //31 
	}
}
