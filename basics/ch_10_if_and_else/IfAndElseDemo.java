package basics.ch_10_if_and_else;

public class IfAndElseDemo {

	public static void main(String[] args) {
		// If And Else
		// Control Statements
		
		if(true) {
			System.out.println("condition was true");
		} else {
			System.out.println("condition was false");
		}
		
		if(false) {
			System.out.println("condition was true");
		} else {
			System.out.println("condition was false");
		}
		
		if(true)
		System.out.println("1: TRUE");
		
		if(false)
		System.out.println("2: TRUE");
		System.out.println("2: FALSE");
		
		if(false) {
			System.out.println("3: TRUE");
		}else if(true) {
			System.out.println("3: ELSE IF TRUE");
		} else {
			System.out.println("3: ELSE FALSE");
		}
			
	} // end method()

}
