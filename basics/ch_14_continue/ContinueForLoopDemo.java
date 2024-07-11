package basics.ch_14_continue;

public class ContinueForLoopDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int counter = 1; counter < 11; counter++) {
			if(counter == 5) {
				continue;
			}
			System.out.println(counter);
		}

	}

}
