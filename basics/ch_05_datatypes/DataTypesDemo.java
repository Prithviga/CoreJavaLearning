package basics.ch_05_datatypes;

// 8 primitive DataTypes
// 1 string DataTypes

public class DataTypesDemo {

	public static void main(String[] args) {
		 char charVariable = 'z';
		 System.out.println(charVariable);
		
		 String stringVariable = "java";
		 System.out.println(stringVariable);
		
		 // Whole numbers
		
		 byte byteVariable = 127;
		 System.out.println(byteVariable);
		 
		 short shortVariable = 32767;
		 System.out.println(shortVariable);
		 
		 int intVariable = 1234567;
		 System.out.println(intVariable);
		 
		 long longVariable = 1_234_567_890L;
		 System.out.println(longVariable);
		 
		 // Decimal numbers
		 
		 float floatVariable = 1.23456F;
		 System.out.println(floatVariable);
		 
		 double doubleVariable = 1.234567890;
		 System.out.println(doubleVariable);
		 
		 // Default value of boolean value is false
		 boolean booleanVariable = true;
		 System.out.println(booleanVariable);
	}

}
