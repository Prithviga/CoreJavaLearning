package basics.ch_13_break;

public class BreakWithWhileLoopDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int counter = 1;
		
		while(counter < 11) {
			System.out.println(counter); // 1 2 3 4
			counter++;
			
			if(counter == 5) {
				break;
			}
		}

	}

}
