package basics.ch_10_if_and_else;

public class IfAndElsePractice {

	public static void main(String[] args) {
		int age = 12;
		
		if(age >= 0 && age < 12) {
			System.out.println("CHILD");
		}
		else if(age >= 12 && age < 18) {
			System.out.println("TEEN");
		}
		else if(age >= 18 && age < 50) {
			System.out.println("ADULT");
		}
		else if(age >= 50 && age < 127) {
			System.out.println("SENIOR");
		}
		else {
			System.out.println("ENTER VALUES BETWEEN 0 AND 127");
		}
	}
}